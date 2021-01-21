package org.alfresco.governance.core.handler;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(value = "${alfrescoGovernanceServicesREST_.name:alfrescoGovernanceServicesREST_}", url = "${alfrescoGovernanceServicesREST_.url:}", configuration = ClientConfiguration.class, decode404 = true)
public interface RecordCategoriesApiClient extends RecordCategoriesApi {
}
