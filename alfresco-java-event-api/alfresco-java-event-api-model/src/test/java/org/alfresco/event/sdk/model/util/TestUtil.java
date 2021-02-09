/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.event.sdk.model.util;

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
public class TestUtil {

    // Ignore array elements ordering
    public static final ValueMatcher<Object> ELEMENTS_ORDERING_MATCHER = (o1, o2) -> {
        try {
            JSONAssert.assertEquals(o1.toString(), o2.toString(), JSONCompareMode.LENIENT);
            return true;
        } catch (JSONException e) {
            return false;
        }
    };
    public static final Pattern DATE_TIME_PATTERN = Pattern.compile(
            "^([0-9]+)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])[Tt]([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?(([Zz])|([\\+|\\-]([01][0-9]|2[0-3]):[0-5][0-9]))$");
    public static final ValueMatcher<Object> DATE_TIME_VALUE_MATCHER = (o1, o2) -> {
        // Just check that the "actual" value (o1) and expected value (o2)
        // are conforming to the defined regex. E.g: "2020-03-19T09:20:42.200386Z"
        return DATE_TIME_PATTERN.matcher(o1.toString()).matches() && DATE_TIME_PATTERN.matcher(o2.toString()).matches();
    };
    public static final Pattern UUID_PATTERN = Pattern.compile(
            "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}");
    public static final ValueMatcher<Object> UUID_VALUE_MATCHER = (o1, o2) -> {
        // Just check that the "actual" value (o1) and expected value (o2)
        // are conforming to the defined regex. E.g: "521aac1c-20eb-444b-a137-2da3d35ee1a8"
        return UUID_PATTERN.matcher(o1.toString()).matches() && UUID_PATTERN.matcher(o2.toString()).matches();
    };
    public static final Customization[] CUSTOMIZATIONS = new Customization[]{
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
            new Customization("data.resource.aspectNames", ELEMENTS_ORDERING_MATCHER)};
    public static final CustomComparator JSON_COMPARATOR = new CustomComparator(JSONCompareMode.STRICT, CUSTOMIZATIONS);

    public static String getResourceFileAsString(final String fileName) throws Exception {
        final InputStream inputStream = TestUtil.class.getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null) {
            return null;
        }
        try (final Reader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8.name()))) {
            return IOUtils.toString(reader);
        }
    }

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static List<String> getTestNodePrimaryHierarchy() {
        return List.of("521aac1c-20eb-444b-a137-2da3d35ee1a8", "2641bbe1-39ff-44dc-b47f-736552ad46cc");
    }

    public static URI getSource() {
        return URI.create("/f6d21231-618e-4f12-a920-e498660c5b9d");
    }

    public static URI getDataSchema(final String schemaName) {
        return URI.create("https://api.alfresco.com/schema/event/repo/v1/" + schemaName);
    }

    public static ZonedDateTime parseTime(final String time) {
        return ZonedDateTime.parse(time);
    }
}
