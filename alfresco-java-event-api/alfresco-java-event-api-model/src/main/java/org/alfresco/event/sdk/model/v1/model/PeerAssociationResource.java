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
 * @author Jamal Kaabi-Mofrad
 */
public class PeerAssociationResource extends AbstractAssociationResource {

    private PeerAssocInfo source;
    private PeerAssocInfo target;

    public PeerAssociationResource() {
        super(null);
    }

    public PeerAssociationResource(final String sourceId, final String targetId, final String assocType) {
        super(assocType);
        this.source = new PeerAssocInfo(sourceId);
        this.target = new PeerAssocInfo(targetId);
    }

    public PeerAssocInfo getSource() {
        return source;
    }

    public PeerAssocInfo getTarget() {
        return target;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeerAssociationResource)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final PeerAssociationResource that = (PeerAssociationResource) o;
        return Objects.equals(source, that.source) && Objects.equals(target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), source, target);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("PeerAssociationResource [source=").append(source)
                .append(", target=").append(target)
                .append(", assocType=").append(assocType)
                .append(']');
        return sb.toString();
    }
}
