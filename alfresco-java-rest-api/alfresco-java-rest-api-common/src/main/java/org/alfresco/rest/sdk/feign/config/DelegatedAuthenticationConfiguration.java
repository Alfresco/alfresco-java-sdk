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
package org.alfresco.rest.sdk.feign.config;

import org.alfresco.rest.sdk.feign.DelegatedAuthenticationProvider;
import org.alfresco.rest.sdk.feign.DelegatedAuthenticationRequestInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for external delegated authentication mechanism. This must be provided by the integrator of the SDK in the form of a bean that implements the
 * interface {@link DelegatedAuthenticationRequestInterceptor}. This authentication method is enabled via the property
 * <code>content.service.security.delegated</code>.
 */
@Configuration
@ConditionalOnProperty("content.service.security.delegated")
public class DelegatedAuthenticationConfiguration {

    @Bean
    public DelegatedAuthenticationRequestInterceptor delegatedAuthenticationRequestInterceptor(DelegatedAuthenticationProvider
        delegatedAuthenticationProvider) {
        return new DelegatedAuthenticationRequestInterceptor(delegatedAuthenticationProvider);
    }
}
