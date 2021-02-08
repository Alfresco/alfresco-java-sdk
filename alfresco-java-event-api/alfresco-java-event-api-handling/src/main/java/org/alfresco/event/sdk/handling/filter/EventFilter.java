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

import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;

import java.util.Objects;

/**
 * Predicate definition for the class {@link RepoEvent} to be able to define event filters that check different conditions in the corresponding events (i.e. the
 * node type has changed, a property has a specific value, etc.).
 * <p>
 * These event filters can be used in the event handlers ({@link org.alfresco.event.sdk.handling.handler.EventHandler}) to narrow down the conditions required
 * to execute the custom behaviour the integrator is aiming when implementing an event handler.
 */
@FunctionalInterface
public interface EventFilter {

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param event the input argument
     * @return {@code true} if the input argument matches the predicate, otherwise {@code false}
     */
    boolean test(RepoEvent<DataAttributes<Resource>> event);

    /**
     * Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.  When evaluating the composed predicate, if
     * this predicate is {@code false}, then the {@code other} predicate is not evaluated.
     *
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the {@code other} predicate will not be evaluated.
     *
     * @param other a predicate that will be logically-ANDed with this predicate
     * @return a composed predicate that represents the short-circuiting logical AND of this predicate and the {@code other} predicate
     * @throws NullPointerException if other is null
     */
    default EventFilter and(final EventFilter other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

    /**
     * Returns a predicate that represents the logical negation of this predicate.
     *
     * @return a predicate that represents the logical negation of this predicate
     */
    default EventFilter negate() {
        return (t) -> !test(t);
    }

    /**
     * Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.  When evaluating the composed predicate, if
     * this predicate is {@code true}, then the {@code other} predicate is not evaluated.
     *
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the {@code other} predicate will not be evaluated.
     *
     * @param other a predicate that will be logically-ORed with this predicate
     * @return a composed predicate that represents the short-circuiting logical OR of this predicate and the {@code other} predicate
     * @throws NullPointerException if other is null
     */
    default EventFilter or(final EventFilter other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }
}
