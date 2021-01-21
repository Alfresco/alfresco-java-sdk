package org.alfresco.search.sql.handler;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(value = "search-sql", url = "${content.service.url}", path = "${content.service.path}", configuration = ClientConfiguration.class, decode404 = true)
public interface SqlApiClient extends SqlApi {
}
