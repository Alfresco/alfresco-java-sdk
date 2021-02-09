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
package org.alfresco.event.sdk.model.v1.model.schema;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.alfresco.event.sdk.model.v1.model.ChildAssocInfo;
import org.alfresco.event.sdk.model.v1.model.Resource;

/**
 * Event data object to generate the JSON schema for {@code ChildAssociationResource}.
 */
// Used with jsonschema-generator to control the order
@JsonPropertyOrder
public class ChildAssociationResource implements Resource {

    @Required
    private String assocType;
    @Required
    private ChildAssocInfo parent;
    @Required
    private ChildAssocInfo child;

    public ChildAssociationResource() {
    }

    public String getAssocType() {
        return assocType;
    }

    public ChildAssocInfo getParent() {
        return parent;
    }

    public ChildAssocInfo getChild() {
        return child;
    }
}
