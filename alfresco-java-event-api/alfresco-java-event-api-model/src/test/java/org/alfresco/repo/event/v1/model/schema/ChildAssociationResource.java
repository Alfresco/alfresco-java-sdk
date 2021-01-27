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

import org.alfresco.repo.event.v1.model.ChildAssocInfo;
import org.alfresco.repo.event.v1.model.Resource;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Event data object to generate the JSON schema for {@code ChildAssociationResource}.
 *
 * @author Jamal Kaabi-Mofrad
 */
// Used with jsonschema-generator to control the order
@JsonPropertyOrder
public class ChildAssociationResource implements Resource
{
    @Required
    private String         assocType;
    @Required
    private ChildAssocInfo parent;
    @Required
    private ChildAssocInfo child;

    public ChildAssociationResource()
    {
    }

    public String getAssocType()
    {
        return assocType;
    }

    public ChildAssocInfo getParent()
    {
        return parent;
    }

    public ChildAssocInfo getChild()
    {
        return child;
    }
}
