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

import feign.RequestTemplate;

/**
 * Interface to be implemented to allow a delegated authentication in the SDK feign clients.
 */
@FunctionalInterface
public interface DelegatedAuthenticationProvider {

    /**
     * Set the authentication details in the request template.
     *
     * @param template {@link RequestTemplate} to set the authentication details
     */
    void setAuthentication(RequestTemplate template);
}
