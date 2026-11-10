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

import static org.assertj.core.api.Assertions.assertThat;

import feign.codec.Decoder;
import feign.codec.Encoder;
import org.junit.Test;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.support.FeignEncoderProperties;
import org.springframework.cloud.openfeign.support.FeignHttpMessageConverters;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FeignClientsConfigurationTest {

    @Test
    public void should_createFeignCodecsWithHttpMessageConverters() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(FeignClientProperties.class, FeignEncoderProperties.class, FeignClientsConfiguration.class);
            context.refresh();

            assertThat(context.getBean(FeignHttpMessageConverters.class).getConverters()).isNotEmpty();
            assertThat(context.getBean(Encoder.class)).isNotNull();
            assertThat(context.getBean(Decoder.class)).isNotNull();
        }
    }
}
