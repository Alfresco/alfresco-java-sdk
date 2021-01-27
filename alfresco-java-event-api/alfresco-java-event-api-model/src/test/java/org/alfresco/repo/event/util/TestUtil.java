/*
 * #%L
 * Alfresco Repository
 * %%
 * Copyright (C) 2005 - 2020 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software.
 * If the software was purchased under a paid Alfresco license, the terms of
 * the paid license agreement will prevail.  Otherwise, the software is
 * provided under the following open source license terms:
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

package org.alfresco.repo.event.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.ValueMatcher;
import org.skyscreamer.jsonassert.comparator.CustomComparator;

/**
 * @author Jamal Kaabi-Mofrad
 */
public class TestUtil
{
    private static final Pattern UUID_PATTERN = Pattern.compile(
                "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}");
    private static final Pattern DATE_TIME_PATTERN = Pattern.compile(
                "^([0-9]+)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])[Tt]([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?(([Zz])|([\\+|\\-]([01][0-9]|2[0-3]):[0-5][0-9]))$");

    private static final ValueMatcher<Object> UUID_VALUE_MATCHER = (o1, o2) -> {
        // Just check that the "actual" value (o1) and expected value (o2)
        // are conforming to the defined regex. E.g: "521aac1c-20eb-444b-a137-2da3d35ee1a8"
        return UUID_PATTERN.matcher(o1.toString()).matches() && UUID_PATTERN.matcher(o2.toString()).matches();
    };

    private static final ValueMatcher<Object> DATE_TIME_VALUE_MATCHER = (o1, o2) -> {
        // Just check that the "actual" value (o1) and expected value (o2)
        // are conforming to the defined regex. E.g: "2020-03-19T09:20:42.200386Z"
        return DATE_TIME_PATTERN.matcher(o1.toString()).matches() && DATE_TIME_PATTERN.matcher(o2.toString()).matches();
    };

    // Ignore array elements ordering
    public static final ValueMatcher<Object> ELEMENTS_ORDERING_MATCHER = (o1, o2) -> {
        try
        {
            JSONAssert.assertEquals(o1.toString(), o2.toString(), JSONCompareMode.LENIENT);
            return true;
        }
        catch (JSONException e)
        {
            return false;
        }
    };

    public static final Customization[] CUSTOMIZATIONS = new Customization[] {
                new Customization("id", UUID_VALUE_MATCHER),
                new Customization("data.eventGroupId", UUID_VALUE_MATCHER),
                new Customization("data.resource.id", UUID_VALUE_MATCHER),
                new Customization("data.resource.parent.id", UUID_VALUE_MATCHER),
                new Customization("data.resource.child.id", UUID_VALUE_MATCHER),
                new Customization("data.resource.source.id", UUID_VALUE_MATCHER),
                new Customization("data.resource.target.id", UUID_VALUE_MATCHER),
                new Customization("time", DATE_TIME_VALUE_MATCHER),
                new Customization("data.resource.createdAt", DATE_TIME_VALUE_MATCHER),
                new Customization("data.resource.modifiedAt", DATE_TIME_VALUE_MATCHER),
                new Customization("data.resourceBefore.modifiedAt", DATE_TIME_VALUE_MATCHER),
                new Customization("data.resource.aspectNames", ELEMENTS_ORDERING_MATCHER) };

    public static final CustomComparator JSON_COMPARATOR = new CustomComparator(JSONCompareMode.STRICT, CUSTOMIZATIONS);


    public static String getResourceFileAsString(String fileName) throws Exception
    {
        InputStream inputStream = TestUtil.class.getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null)
        {
            return null;
        }
        try (Reader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8.name())))
        {
            return IOUtils.toString(reader);
        }
    }

    public static String getUUID()
    {
        return UUID.randomUUID().toString();
    }

    public static List<String> getTestNodePrimaryHierarchy()
    {
        return List.of("521aac1c-20eb-444b-a137-2da3d35ee1a8", "2641bbe1-39ff-44dc-b47f-736552ad46cc");
    }

    public static URI getSource()
    {
        return URI.create("/f6d21231-618e-4f12-a920-e498660c5b9d");
    }

    public static URI getDataSchema(String schemaName)
    {
        return URI.create("https://api.alfresco.com/schema/event/repo/v1/" + schemaName);
    }

    public static ZonedDateTime parseTime(String time)
    {
        return ZonedDateTime.parse(time);
    }
}
