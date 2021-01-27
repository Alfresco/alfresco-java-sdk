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
package org.alfresco.repo.event.v1.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Base node resource object representing the common attributes of the resource affected.
 *
 * @author Jamal Kaabi-Mofrad
 */
public abstract class AbstractNodeResource implements Resource
{
    protected final String id;

    // Only relevant for certain resources
    @JsonInclude(Include.NON_NULL)
    protected final List<String> primaryHierarchy;

    public AbstractNodeResource(String id)
    {
        this(id, null);
    }

    public AbstractNodeResource(String id, List<String> primaryHierarchy)
    {
        this.id = id;
        this.primaryHierarchy = primaryHierarchy;
    }

    public String getId()
    {
        return id;
    }

    public List<String> getPrimaryHierarchy()
    {
        return primaryHierarchy;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof AbstractNodeResource))
        {
            return false;
        }
        AbstractNodeResource resource = (AbstractNodeResource) o;
        return Objects.equals(id, resource.id)
                    && Objects.equals(primaryHierarchy, resource.primaryHierarchy);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, primaryHierarchy);
    }
}
