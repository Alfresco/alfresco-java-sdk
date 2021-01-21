package org.alfresco.activiti.handler;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(value = "process", url = "${process.service.url}", path = "${process.service.path}", configuration = ClientConfiguration.class, decode404 = true)
public interface DecisionTableModelsApiClient extends DecisionTableModelsApi {
}
