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

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.alfresco.repo.event.v1.model.ContentInfo;
import org.alfresco.repo.event.v1.model.Resource;
import org.alfresco.repo.event.v1.model.UserInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Event data object to generate the JSON schema for {@code NodeResource}.
 *
 * @author Jamal Kaabi-Mofrad
 */
// Used with jsonschema-generator to control the order
@JsonPropertyOrder
public class NodeResource implements Resource
{
    @Required
    private String                    id;
    private String                    name;
    private String                    nodeType;
    private Boolean                   file;
    private Boolean                   folder;
    private UserInfo                  createdByUser;
    private ZonedDateTime             createdAt;
    private UserInfo                  modifiedByUser;
    private ZonedDateTime             modifiedAt;
    private ContentInfo               content;
    private List<String>              primaryHierarchy;
    private Map<String, Serializable> properties;
    private Set<String>               aspectNames;

    public NodeResource()
    {
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getNodeType()
    {
        return nodeType;
    }

    @JsonProperty("isFile")
    public Boolean isFile()
    {
        return file;
    }

    @JsonProperty("isFolder")
    public Boolean isFolder()
    {
        return folder;
    }

    public UserInfo getCreatedByUser()
    {
        return createdByUser;
    }

    public ZonedDateTime getCreatedAt()
    {
        return createdAt;
    }

    public UserInfo getModifiedByUser()
    {
        return modifiedByUser;
    }

    public ZonedDateTime getModifiedAt()
    {
        return modifiedAt;
    }

    public ContentInfo getContent()
    {
        return content;
    }

    public List<String> getPrimaryHierarchy()
    {
        return primaryHierarchy;
    }

    public Map<String, Serializable> getProperties()
    {
        return properties;
    }

    public Set<String> getAspectNames()
    {
        return aspectNames;
    }
}
