package org.alfresco.search.handler;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(value = "search", url = "${content.service.url}", path = "${content.service.path}", configuration = ClientConfiguration.class, decode404 = true)
public interface SearchApiClient extends SearchApi {
}
