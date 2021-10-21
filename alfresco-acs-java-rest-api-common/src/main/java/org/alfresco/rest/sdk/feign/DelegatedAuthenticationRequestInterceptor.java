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
package org.alfresco.rest.sdk.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Feign {@link RequestInterceptor} that delegates the authentication in an external class implementing {@link DelegatedAuthenticationProvider}.
 */
public class DelegatedAuthenticationRequestInterceptor implements RequestInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(DelegatedAuthenticationRequestInterceptor.class);

    private final DelegatedAuthenticationProvider delegatedAuthenticationProvider;

    /**
     * Constructor.
     *
     * @param delegatedAuthenticationProvider given {@link DelegatedAuthenticationProvider}
     */
    public DelegatedAuthenticationRequestInterceptor(final DelegatedAuthenticationProvider delegatedAuthenticationProvider) {
        this.delegatedAuthenticationProvider = Objects.requireNonNull(delegatedAuthenticationProvider);
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        LOGGER.debug("Delegating authentication setup to the provider {}", delegatedAuthenticationProvider);
        delegatedAuthenticationProvider.setAuthentication(requestTemplate);
    }
}
