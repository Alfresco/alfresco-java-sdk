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

package org.alfresco.repo.event.databind;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * Jackson serializer for the values of type {@link ZonedDateTime}.
 *
 * @author Jamal Kaabi-Mofrad
 */
public class DateTimeSerializer extends StdSerializer<ZonedDateTime>
{
    private static final long serialVersionUID = -5916748200020469756L;

    public DateTimeSerializer()
    {
        this(null, false);
    }

    protected DateTimeSerializer(Class<?> t, boolean dummy)
    {
        super(t, dummy);
    }

    @Override
    public void serialize(ZonedDateTime zonedDateTime, JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException
    {
        jsonGenerator.writeString(zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    }
}
