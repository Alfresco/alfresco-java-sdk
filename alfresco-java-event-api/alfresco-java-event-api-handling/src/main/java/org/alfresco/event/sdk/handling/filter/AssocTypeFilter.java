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
package org.alfresco.event.sdk.handling.filter;

import java.util.Objects;

import org.alfresco.repo.event.v1.model.AbstractAssociationResource;
import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link EventFilter} that checks if an event corresponds to a specific association type. This doesn't distinguish if the event is representing peer or child
 * associations.
 */
public class AssocTypeFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AssocTypeFilter.class);

    private final String acceptedAssocType;

    private AssocTypeFilter(final String acceptedAssocType) {
        this.acceptedAssocType = Objects.requireNonNull(acceptedAssocType);
    }

    /**
     * Obtain a {@link AssocTypeFilter} for a specific association type.
     *
     * @param acceptedAssocType given association type to be filtered
     * @return created {@link AssocTypeFilter}
     */
    public static AssocTypeFilter of(final String acceptedAssocType) {
        return new AssocTypeFilter(acceptedAssocType);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for assoc type {} and event {}", acceptedAssocType, event);
        return isAssocEvent(event) && acceptedAssocType.equals(((AbstractAssociationResource) event.getData().getResource()).getAssocType());
    }
}
