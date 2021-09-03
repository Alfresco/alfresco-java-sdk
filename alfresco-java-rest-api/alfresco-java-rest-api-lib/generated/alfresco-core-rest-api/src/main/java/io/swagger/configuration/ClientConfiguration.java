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
package io.swagger.configuration;

import org.alfresco.rest.sdk.feign.config.BasicAuthConfiguration;
import org.alfresco.rest.sdk.feign.config.DelegatedAuthenticationConfiguration;
import org.alfresco.rest.sdk.feign.config.OAuth2Configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Feign client Spring configuration that provides support for different authentication methods. Currently, supported methods are:
 * <ul>
 *     <li>Basic Authentication</li>
 *     <li>OAuth2 - Client credentials flow</li>
 *     <li>OAuth2 - Password flow</li>
 *     <li>Delegated (external) authentication</li>
 * </ul>
 */
@Configuration
@Import({BasicAuthConfiguration.class, OAuth2Configuration.class, DelegatedAuthenticationConfiguration.class})
public class ClientConfiguration {

}
