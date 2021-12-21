#!/usr/bin/env bash
set -e

GENERATED_SOURCE_DIR=${GENERATED_SOURCE_DIR:-generated}
case $(uname | tr '[:upper:]' '[:lower:]') in
  darwin*)
    export EDIT_FILE_IN_PLACE_PARAM="''"
    ;;
  *)
    export EDIT_FILE_IN_PLACE_PARAM=
    ;;
esac

find "${GENERATED_SOURCE_DIR}" -type f -name "*.java" -exec sed \
  -e 's;, url = "${processServicesEnterprise_.url:.*}";, url = "${process.service.url}", path = "${process.service.path}";g' \
  -e 's;, url = "${alfrescoContentServicesREST_.url:.*}";, url = "${content.service.url}", path = "${content.service.path}";g' \
  -e 's;"${alfrescoContentServicesREST_.security.basicAuth.username:.*}";"${content.service.security.basicAuth.username}";g' \
  -e 's;"${alfrescoContentServicesREST_.security.basicAuth.password:.*}";"${content.service.security.basicAuth.password}";g' \
  -e 's;"alfrescoContentServicesREST_.security.basicAuth.username";"content.service.security.basicAuth.username";g' \
  -e 's;, url = "${alfrescoGovernanceServicesSecurityControls.url:.*}";, url = "${content.service.url}", path = "${governance.service.path}";g' \
  -e 's;"${alfrescoGovernanceServicesSecurityControls.security.basicAuth.username:.*}";"${content.service.security.basicAuth.username}";g' \
  -e 's;"${alfrescoGovernanceServicesSecurityControls.security.basicAuth.password:.*}";"${content.service.security.basicAuth.password}";g' \
  -e 's;"alfrescoGovernanceServicesSecurityControls.security.basicAuth.username";"content.service.security.basicAuth.username";g' \
  -e 's;, url = "${alfrescoGovernanceServicesREST_.url:.*}";, url = "${content.service.url}", path = "${governance.service.path}";g' \
  -e 's;"${alfrescoGovernanceServicesREST_.security.basicAuth.username:.*}";"${content.service.security.basicAuth.username}";g' \
  -e 's;"${alfrescoGovernanceServicesREST_.security.basicAuth.password:.*}";"${content.service.security.basicAuth.password}";g' \
  -e 's;"alfrescoGovernanceServicesREST_.security.basicAuth.username";"content.service.security.basicAuth.username";g' \
  -e 's;, url = "${alfrescoInsightEngineREST_.url:.*}";, url = "${content.service.url}", path = "${search-sql.service.path}";g' \
  -e 's;"${alfrescoInsightEngineREST_.security.basicAuth.username:.*}";"${content.service.security.basicAuth.username}";g' \
  -e 's;"${alfrescoInsightEngineREST_.security.basicAuth.password:.*}";"${content.service.security.basicAuth.password}";g' \
  -e 's;"alfrescoInsightEngineREST_.security.basicAuth.username";"content.service.security.basicAuth.username";g' \
  -e 's@import com\.alfresco\..*\.ResponseEntity;@@g' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find "${GENERATED_SOURCE_DIR}" -type f -name "*.md" -exec sed \
  -e 's, *ApiClient defaultClient = Configuration.getDefaultApiClient();,,g' \
  -e 's, *// Configure HTTP basic authorization: basicAuth,,g' \
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


find ${GENERATED_SOURCE_DIR} -type f -iname 'ModelsApi.java' -exec sed \
  -e 's/ResponseEntity<Void> getModelContentUsingGET/byte[] getModelContentUsingGET/' \
  -e 's/ResponseEntity<Void> exportModelUsingGET/byte[] exportModelUsingGET/' \
  -e 's/ResponseEntity<String>/byte[]/' \
  -e 's/@RequestParam("file")/@PathVariable("file")/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -name 'SearchApiClient.java' -exec sed \
  -e 's/path = "${content.service.path}"/path = "${search.service.path}"/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find ${GENERATED_SOURCE_DIR} -type f -name 'DiscoveryApiClient.java' -exec sed \
  -e 's/path = "${content.service.path}"/path = "${discovery.service.path}"/' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find "${GENERATED_SOURCE_DIR}" -type d \( \
  -name 'gradle' \
  -o -name 'auth' \
  -o -name 'test' \
  \) -exec rm -rf {} +

find "${GENERATED_SOURCE_DIR}" -type f -iname 'README.md' -exec sed \
  -e '/ReleasesApi/d' \
  -i $EDIT_FILE_IN_PLACE_PARAM {} +

find "${GENERATED_SOURCE_DIR}" -type f \( \
  -name 'ResponseEntity*.java' \
  -o -name 'WebMvcLinksHandlerApi*.java' \
  -o -name 'Zone*.java' \
  -o -name 'Resource.java' \
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
