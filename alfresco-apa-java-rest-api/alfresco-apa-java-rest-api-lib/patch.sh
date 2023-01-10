#!/usr/bin/env bash
set -e

GENERATED_SOURCE_DIR=${GENERATED_SOURCE_DIR:-generated}
case $(uname | tr '[:upper:]' '[:lower:]') in
  darwin*)
    export EDIT_FILE_IN_PLACE_PARAM="\'\'"
    ;;
  *)
    export EDIT_FILE_IN_PLACE_PARAM=
    ;;
esac

find "${GENERATED_SOURCE_DIR}" -type f -name "*.java" -exec sed \
  -e 's;url = "${processServicesEnterprise_.url:.*}";url = "${process.service.url}", path = "${process.service.path}";g' \
  -e 's;url = "${deploymentReST_.url:}";url = "${alfresco.service.deployment.url}", path = "${alfresco.service.deployment.path}";g' \
  -e 's;url = "${modelingReST_.url.*}";url = "${modeling.url}", path = "${modeling.path}";g' \
  -e 's;url = "${runtimeBundleReST_.url.*}";url = "${activiti.service.runtime.url}", path = "${activiti.service.runtime.path}";g' \
  -e 's;url = "${auditServiceReST_.url.*}";url = "${activiti.service.audit.url}", path = "${activiti.service.audit.path}";g' \
  -e 's;url = "${preferenceReST_.url.*}";url = "${activiti.service.preference.url}", path = "${activiti.service.preference.path}";g' \
  -e 's;url = "${formReST_.url.*}";url = "${activiti.service.form.url}", path = "${activiti.service.form.path}";g' \
  -e 's;url = "${queryServiceReST_.url:}";url = "${activiti.service.query.url}", path = "${activiti.service.query.path}";g' \
  -e 's;url = "${processStorageReST_.url:}";url = "${alfresco.service.process.storage.url}", path = "${alfresco.service.process.storage.path}";g' \
  -e 's;@RequestPart("file") MultipartFile file;@PathVariable("file") MultipartFile file;g' \
  -e 's;ErrorModelNamenamespaceorgSpringframeworkHateoasNameEntityModelOfJobExecution;EntryResponseContentOfJobExecution;g' \
  -e 's@import org\.alfresco\..*\.ResponseEntity;@@g' \
  -e 's;value = "FindAndManageDescriptors_";value = "FindAndManageDescriptors";g' \
  -e 's;value = "alfrescoFindAndManageDescriptors_Api";value = "alfrescoFindAndManageDescriptorsApi";g' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find "${GENERATED_SOURCE_DIR}" -type f -name "*.md" -exec sed \
  -e 's, *ApiClient defaultClient = Configuration.getDefaultApiClient();,,g' \
  -e 's,ErrorModelNamenamespaceorgSpringframeworkHateoasNameEntityModelOfJobExecution,EntryResponseContentOfJobExecution,g' \
  -e 's, *// Configure HTTP basic authorization: basicAuth,,g' \
  -e 's,.*All URIs are relative to.*,All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name,g' \
  -e 's, *HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");,,g' \
  -e 's, *basicAuth.setUsername("YOUR USERNAME");,,g' \
  -e 's, *basicAuth.setPassword("YOUR PASSWORD");,,g' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find "${GENERATED_SOURCE_DIR}" -type f -name 'NodeBody*.java' -exec sed \
  -e 's;private Map<String, String> properties = null;private Map<String, Object> properties = null;g' \
  -e 's;properties(Map<String, String> properties) {;properties(Map<String, Object> properties) {;g' \
  -e 's;public Map<String, String> getProperties();public Map<String, Object> getProperties();g' \
  -e 's;public void setProperties(Map<String, String> properties);public void setProperties(Map<String, Object> properties);g' \
  -e 's;this.properties = new HashMap<String, String>();this.properties = new HashMap<String, Object>();g' \
  -e 's;putPropertiesItem(String key, String propertiesItem);putPropertiesItem(String key, Object propertiesItem);g' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'ProjectsApi.java' -exec sed \
  -e 's/ResponseEntity<Void> export/byte[] export/' \
  -e 's/@RequestParam("file")/@PathVariable("file")/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'ModelsApi.java' -exec sed \
  -e 's/ResponseEntity<Void> getModelDiagram/byte[] getModelDiagram/' \
  -e 's/ResponseEntity<Void> exportModel/byte[] exportModel/' \
  -e 's/ResponseEntity<String>/byte[]/' \
  -e 's/@RequestParam("file")/@PathVariable("file")/' \
  -e 's/@RequestBody ModelIdContentBody/@PathVariable("file") MultipartFile/' \
  -e 's/@RequestBody ModelIdValidateBody/@PathVariable("file") MultipartFile/' \
  -e 's/@RequestBody ValidateExtensionsBody/@PathVariable("file") MultipartFile/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'FindAndManageDescriptors_Api.java' -exec sed \
  -e 's/ResponseEntity<Void> exportDescriptor/byte[] exportDescriptor/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'FindAndManageApplicationsApi.java' -exec sed \
  -e '/import org.alfresco.activiti.deployment.model.NamespaceHealth;/a\
  import org.alfresco.activiti.deployment.model.ApplicationRepresentation;' \
  -e 's/ResponseEntity<Void> createApplication(@ApiParam(value = "", required=true ) @Valid @RequestBody String body)/ResponseEntity<Void> createApplication(@ApiParam(value = "", required=true ) @Valid @RequestBody ApplicationRepresentation body)/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'DescriptorControllerApi.java' -exec sed \
  -e 's/ResponseEntity<Void> export/byte[] export/' \
  -e 's/@RequestParam("file")/@PathVariable("file")/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'FormsApi.java' -exec sed \
  -e '/model.ResponseEntityFormSummaryView/d' \
  -e 's/ResponseEntityFormSummaryView/ResponseEntity/' \
  -e 's/ResponseEntity<String>/ResponseEntity<ResponseEntity>/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -iname 'PreferenceApi.java' -exec sed \
  -e 's/ResponseEntity<String>/ResponseEntity<ResponseEntity>/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find "${GENERATED_SOURCE_DIR}" -type d \( \
  -name 'gradle' \
  -o -name 'auth' \
  -o -name 'test' \
  \) -exec rm -rf {} +

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
