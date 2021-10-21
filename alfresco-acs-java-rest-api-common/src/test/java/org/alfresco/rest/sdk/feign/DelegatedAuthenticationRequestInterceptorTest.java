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

import static org.mockito.Mockito.verify;

import feign.RequestTemplate;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Unit tests for {@link DelegatedAuthenticationRequestInterceptor}.
 */
public class DelegatedAuthenticationRequestInterceptorTest {

    @Mock
    private DelegatedAuthenticationProvider mockDelegatedAuthenticationProvider;

    private DelegatedAuthenticationRequestInterceptor delegatedAuthenticationRequestInterceptor;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
        delegatedAuthenticationRequestInterceptor = new DelegatedAuthenticationRequestInterceptor(mockDelegatedAuthenticationProvider);
    }

    @Test
    public void should_invokeDelegatedAuthenticationProvider_when_interceptorIsApplied() {
        RequestTemplate requestTemplate = new RequestTemplate();

        delegatedAuthenticationRequestInterceptor.apply(requestTemplate);

        verify(mockDelegatedAuthenticationProvider).setAuthentication(requestTemplate);
    }
}
