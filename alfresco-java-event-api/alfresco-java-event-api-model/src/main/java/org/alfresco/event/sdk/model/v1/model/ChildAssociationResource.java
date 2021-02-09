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
package org.alfresco.event.sdk.model.v1.model;

import java.util.Objects;

public class ChildAssociationResource extends AbstractAssociationResource {

    private ChildAssocInfo parent;
    private ChildAssocInfo child;

    public ChildAssociationResource() {
        super(null);
    }

    public ChildAssociationResource(final String parentId, final String childId, final String assocType) {
        super(assocType);
        this.parent = new ChildAssocInfo(parentId);
        this.child = new ChildAssocInfo(childId);
    }

    public ChildAssocInfo getParent() {
        return parent;
    }

    public ChildAssocInfo getChild() {
        return child;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChildAssociationResource)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final ChildAssociationResource that = (ChildAssociationResource) o;
        return Objects.equals(parent, that.parent) && Objects.equals(child, that.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parent, child);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("ChildAssociationResource [parent=").append(parent)
                .append(", child=").append(child)
                .append(", assocType=").append(assocType)
                .append(']');
        return sb.toString();
    }
}
