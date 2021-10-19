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

import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Util;


public class ApiKeyRequestInterceptor implements RequestInterceptor {
  private final String location;
  private final String name;
  private String value;

  public ApiKeyRequestInterceptor(String location, String name, String value) {
    Util.checkNotNull(location, "location", new Object[0]);
    Util.checkNotNull(name, "name", new Object[0]);
    Util.checkNotNull(value, "value", new Object[0]);
    this.location = location;
    this.name = name;
    this.value = value;
  }

  @Override
  public void apply(RequestTemplate requestTemplate) {
    if(location.equals("header")) {
      requestTemplate.header(name, value);
    } else if(location.equals("query")) {
      requestTemplate.query(name, value);
    }
  }

}
