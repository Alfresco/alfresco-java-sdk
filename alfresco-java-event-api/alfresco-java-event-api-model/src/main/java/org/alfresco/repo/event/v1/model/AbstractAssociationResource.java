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
 * Base association resource.
 *
 * @author Jamal Kaabi-Mofrad
 */
public abstract class AbstractAssociationResource implements Resource
{
    protected String assocType;

    public AbstractAssociationResource(String assocType)
    {
        this.assocType = assocType;
    }

    public String getAssocType()
    {
        return assocType;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof AbstractAssociationResource))
        {
            return false;
        }
        AbstractAssociationResource that = (AbstractAssociationResource) o;
        return Objects.equals(assocType, that.assocType);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(assocType);
    }
}
