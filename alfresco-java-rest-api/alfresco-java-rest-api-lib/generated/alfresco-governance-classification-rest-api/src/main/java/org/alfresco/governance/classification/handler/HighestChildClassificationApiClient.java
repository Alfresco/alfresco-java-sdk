package org.alfresco.governance.classification.handler;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(value = "${alfrescoGovernanceServicesSecurityControls.name:alfrescoGovernanceServicesSecurityControls}", url = "${alfrescoGovernanceServicesSecurityControls.url:}", configuration = ClientConfiguration.class, decode404 = true)
public interface HighestChildClassificationApiClient extends HighestChildClassificationApi {
}
