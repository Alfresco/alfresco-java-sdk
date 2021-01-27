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
package org.alfresco.repo.event.v1.model.schema;

import java.net.URI;
import java.time.ZonedDateTime;

import org.alfresco.repo.event.EventAttributes;
import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.Resource;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Event data object to generate the JSON schema for {@code RepoEvent}.
 *
 * @author Jamal Kaabi-Mofrad
 */
// Used with jsonschema-generator to control the order
@JsonPropertyOrder
public class RepoEvent<D extends DataAttributes<? extends Resource>> implements EventAttributes
{
    @Required
    private String        specversion;
    @Required
    private String        type;
    @Required
    private String        id;
    @Required
    private URI           source;
    @Required
    private ZonedDateTime time;
    @Required
    private URI           dataschema;
    @Required
    private String        datacontenttype;
    @Required
    private D             data;

    @Override
    public String getSpecversion()
    {
        return specversion;
    }

    @Override
    public String getType()
    {
        return type;
    }

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public URI getSource()
    {
        return source;
    }

    @Override
    public ZonedDateTime getTime()
    {
        return time;
    }

    @Override
    public URI getDataschema()
    {
        return dataschema;
    }

    @Override
    public String getDatacontenttype()
    {
        return datacontenttype;
    }

    public D getData()
    {
        return data;
    }
}
