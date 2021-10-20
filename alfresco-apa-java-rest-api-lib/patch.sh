#!/usr/bin/env bash
set -e

GENERATED_SOURCE_DIR=${GENERATED_SOURCE_DIR:-generated}

find "${GENERATED_SOURCE_DIR}" -type f -name "*.java" -exec sed \
  -e 's;"${processServicesEnterprise_.name:processServicesEnterprise_}", url = "${processServicesEnterprise_.url:.*}";"process", url = "${process.service.url}", path = "${process.service.path}";g' \
  -e 's;"${activitiCloudQueryStarterQueryReST_.name:activitiCloudQueryStarterQueryReST_}", url = "${activitiCloudQueryStarterQueryReST_.url:}";"audit", url = "${activiti.service.audit.url}", path = "${activiti.service.audit.path}";g' \
  -e 's;"${alfrescoContentServicesREST_.name:alfrescoContentServicesREST_}", url = "${alfrescoContentServicesREST_.url:.*}";"search", url = "${content.service.url}", path = "${content.service.path}";g' \
  -e 's;"${alfrescoInsightEngineREST_.name:alfrescoInsightEngineREST_}", url = "${alfrescoInsightEngineREST_.url:.*}";"search-sql", url = "${content.service.url}", path = "${content.service.path}";g' \
  -e 's;"${alfrescoContentServicesREST_.name:alfrescoContentServicesREST_}", url = "${alfrescoContentServicesREST_.url:.*}";"discovery", url = "${discovery.service.url}", path = "${discovery.service.path}";g' \
  -e 's;"${alfrescoContentServicesREST_.name:alfrescoContentServicesREST_}", url = "${alfrescoContentServicesREST_.url:.*}";"authentication", url = "${authentication.service.url}", path = "${authentication.service.path}";g' \
  -e 's;"${alfrescoContentServicesREST_.name:alfrescoContentServicesREST_}", url = "${alfrescoContentServicesREST_.url:.*}";"alfresco", url = "${content.service.url}", path = "${content.service.path}";g' \
  -e 's;"${alfrescoDMNSimulationSpringBootStarterReST_.name:alfrescoDMNSimulationSpringBootStarterReST_}", url = "${alfrescoDMNSimulationSpringBootStarterReST_.url:}";"dmn-simulation", url = "${modeling.url}", path = "${modeling.path}";g' \
  -e 's;"${alfrescoStarterScriptModelingReST_.name:alfrescoStarterScriptModelingReST_}", url = "${alfrescoStarterScriptModelingReST_.url:}";"script-modeling", url = "${modeling.url}", path = "${modeling.path}";g' \
  -e 's;"${.*Deployment.*}", url = "${.*}";"deployment", url = "${activiti.service.deployment.url}", path = "${activiti.service.deployment.path}";g' \
  -e 's;"${.*Form.*}", url = "${.*}";"form", url = "${activiti.service.form.url}", path = "${activiti.service.form.path}";g' \
  -e 's;"${.*Preference.*}", url = "${.*}";"preference", url = "${activiti.service.preference.url}", path = "${activiti.service.preference.path}";g' \
  -e 's;"${.*Modeling.*}", url = "${.*}";"modeling", url = "${modeling.url}", path = "${modeling.path}";g' \
  -e 's;"${.*Runtime.*}", url = "${.*}", configuration = ClientConfiguration\.class, decode404 = true;"runtime", url = "${activiti.service.runtime.url}", path = "${activiti.service.runtime.path}", configuration = ClientConfiguration.class;g' \
  -e 's;"${apiDocumentation.name:apiDocumentation}", url = "${apiDocumentation.url:.*}";"audit", url = "${activiti.service.audit.url}", path = "${activiti.service.audit.path}";g' \
  -e 's;"${query.name:query}", url = "${query.url:.*}";"query", url = "${activiti.service.query.url}", path = "${activiti.service.query.path}";g' \
  -e 's;ErrorModelNamenamespaceorgSpringframeworkHateoasNameEntityModelOfJobExecution;EntryResponseContentOfJobExecution;g' \
  -e 's;"${alfrescoProcessStorageSpringBootStarterReST_.name:alfrescoProcessStorageSpringBootStarterReST_}", url = "${alfrescoProcessStorageSpringBootStarterReST_.url:.*}";"process-storage", url = "${activiti.service.process-storage.url}", path = "${activiti.service.process-storage.path}";g' \
  -e 's@import com\.alfresco\..*\.ResponseEntity;@@g' \
  -i '' {} +

find "${GENERATED_SOURCE_DIR}" -type f -name "*.md" -exec sed \
  -e 's, *ApiClient defaultClient = Configuration.getDefaultApiClient();,,g' \
  -e 's,ErrorModelNamenamespaceorgSpringframeworkHateoasNameEntityModelOfJobExecution,EntryResponseContentOfJobExecution,g' \
  -e 's, *// Configure HTTP basic authorization: basicAuth,,g' \
  -e 's,.*All URIs are relative to.*,All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name,g' \
  -e 's, *HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");,,g' \
  -e 's, *basicAuth.setUsername("YOUR USERNAME");,,g' \
  -e 's, *basicAuth.setPassword("YOUR PASSWORD");,,g' \
  -i '' {} +

find "${GENERATED_SOURCE_DIR}" -type f -name 'NodeBody*.java' -exec sed \
  -e 's;private Map<String, String> properties = null;private Map<String, Object> properties = null;g' \
  -e 's;properties(Map<String, String> properties) {;properties(Map<String, Object> properties) {;g' \
  -e 's;public Map<String, String> getProperties();public Map<String, Object> getProperties();g' \
  -e 's;public void setProperties(Map<String, String> properties);public void setProperties(Map<String, Object> properties);g' \
  -e 's;this.properties = new HashMap<String, String>();this.properties = new HashMap<String, Object>();g' \
  -e 's;putPropertiesItem(String key, String propertiesItem);putPropertiesItem(String key, Object propertiesItem);g' \
  -i '' {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'ProjectsApi.java' -exec sed \
  -e 's/ResponseEntity<Void> export/byte[] export/' \
  -e 's/@RequestParam("file")/@PathVariable("file")/' \
  -i '' {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'ModelsApi.java' -exec sed \
  -e 's/ResponseEntity<Void> getModelContentUsingGET/byte[] getModelContentUsingGET/' \
  -e 's/ResponseEntity<Void> exportModelUsingGET/byte[] exportModelUsingGET/' \
  -e 's/ResponseEntity<String>/byte[]/' \
  -e 's/@RequestParam("file")/@PathVariable("file")/' \
  -i '' {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'DescriptorControllerApi.java' -exec sed \
  -e 's/ResponseEntity<Void> export/byte[] export/' \
  -e 's/@RequestParam("file")/@PathVariable("file")/' \
  -i '' {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'FormsApi.java' -exec sed \
  -e '/model.ResponseEntityFormSummaryView/d' \
  -e 's/ResponseEntityFormSummaryView/ResponseEntity/' \
  -i '' {} +

find "${GENERATED_SOURCE_DIR}" -type d \( \
  -name 'gradle' \
  -o -name 'auth' \
  -o -name 'test' \
  \) -exec rm -rf {} +

find "${GENERATED_SOURCE_DIR}" -type f -iname 'README.md' -exec sed \
  -e '/ReleasesApi/d' \
  -i '' {} +

find "${GENERATED_SOURCE_DIR}" -type f \( \
  -name 'ResponseEntity*.java' \
  -o -name 'WebMvcLinksHandlerApi*.java' \
  -o -name 'Zone*.java' \
  -o -name 'Resource.java' \
  -o -name 'ResponseEntityFormSummaryView.md' \
  -o -name 'ApiClient.java' \
  -o -name 'CustomInstantDeserializer.java' \
  -o -name 'RFC3339DateFormat.java' \
  -o -name 'AndroidManifest.xml' \
  -o -name '*gradle*' \
  -o -name '.travis.yml' \
  -o -name '.gitignore' \
  -o -name 'git_push.sh' \
  -o -name 'build.sbt' \
  -o -name '*ReleasesApi*' \
  \) -delete