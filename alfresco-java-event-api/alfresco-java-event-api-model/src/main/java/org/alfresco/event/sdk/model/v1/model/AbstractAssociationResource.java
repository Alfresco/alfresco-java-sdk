/*
 * Copyright 2010-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.alfresco.event.sdk.model.v1.model;

import java.util.Objects;

/**
 * Base association resource.
 *
 * @author Jamal Kaabi-Mofrad
 */
public abstract class AbstractAssociationResource implements Resource {

    protected String assocType;

    public AbstractAssociationResource(final String assocType) {
        this.assocType = assocType;
    }

    public String getAssocType() {
        return assocType;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractAssociationResource)) {
            return false;
        }
        final AbstractAssociationResource that = (AbstractAssociationResource) o;
        return Objects.equals(assocType, that.assocType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assocType);
    }
}