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

import java.util.Objects;

/**
 * @author Jamal Kaabi-Mofrad
 */
public class ChildAssociationResource extends AbstractAssociationResource
{
    private ChildAssocInfo parent;
    private ChildAssocInfo child;

    public ChildAssociationResource()
    {
        super(null);
    }

    public ChildAssociationResource(String parentId, String childId, String assocType)
    {
        super(assocType);
        this.parent = new ChildAssocInfo(parentId);
        this.child = new ChildAssocInfo(childId);
    }

    public ChildAssocInfo getParent()
    {
        return parent;
    }

    public ChildAssocInfo getChild()
    {
        return child;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof ChildAssociationResource))
        {
            return false;
        }
        if (!super.equals(o))
        {
            return false;
        }
        ChildAssociationResource that = (ChildAssociationResource) o;
        return Objects.equals(parent, that.parent) && Objects.equals(child, that.child);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), parent, child);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("ChildAssociationResource [parent=").append(parent)
          .append(", child=").append(child)
          .append(", assocType=").append(assocType)
          .append(']');
        return sb.toString();
    }
}
