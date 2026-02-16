package org.alfresco.sdk.sample.oauth2feign.feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "alfrescoDiscovery", url = "${alfresco.base-url}")
public interface AlfrescoDiscoveryClient
{
    @GetMapping("/alfresco/api/discovery")
    Map<String, Object> getDiscovery();
}
