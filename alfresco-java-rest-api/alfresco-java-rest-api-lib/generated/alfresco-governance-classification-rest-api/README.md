# alfresco-governance-classification-rest-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.alfresco</groupId>
    <artifactId>alfresco-governance-classification-rest-api</artifactId>
    <version>5.0.0-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-governance-classification-rest-api:5.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-governance-classification-rest-api-5.0.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

  import org.alfresco.*;
  import org.alfresco.auth.*;
  import org.alfresco.governance.classification.model.*;
  import org.alfresco.governance.classification.handler.ClassificationGuidesApi;

  import java.io.File;
  import java.util.*;

  public class ClassificationGuidesApiExample {

  public static void main(String[] args) {

  





  ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
    CombinedInstructionBody instructions = new CombinedInstructionBody(); // CombinedInstructionBody | Instructions
  try {
  InstructionEntry result = apiInstance.combinedInstructions(instructions);
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling ClassificationGuidesApi#combinedInstructions");
  e.printStackTrace();
  }
  }
  }

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClassificationGuidesApi* | [**combinedInstructions**](docs/ClassificationGuidesApi.md#combinedInstructions) | **POST** /combined-instructions | Combined instructions
*ClassificationGuidesApi* | [**createClassificationGuide**](docs/ClassificationGuidesApi.md#createClassificationGuide) | **POST** /classification-guides | Create a classification guide
*ClassificationGuidesApi* | [**createSubtopic**](docs/ClassificationGuidesApi.md#createSubtopic) | **POST** /topics/{topicId}/subtopics | Create a subtopic
*ClassificationGuidesApi* | [**createTopic**](docs/ClassificationGuidesApi.md#createTopic) | **POST** /classification-guides/{classificationGuideId}/topics | Create a topic
*ClassificationGuidesApi* | [**deleteClassificationGuide**](docs/ClassificationGuidesApi.md#deleteClassificationGuide) | **DELETE** /classification-guides/{classificationGuideId} | Delete a classification guide
*ClassificationGuidesApi* | [**deleteTopic**](docs/ClassificationGuidesApi.md#deleteTopic) | **DELETE** /topics/{topicId} | Delete a topic
*ClassificationGuidesApi* | [**listClassificationGuides**](docs/ClassificationGuidesApi.md#listClassificationGuides) | **GET** /classification-guides | List all classification guides
*ClassificationGuidesApi* | [**listSubtopics**](docs/ClassificationGuidesApi.md#listSubtopics) | **GET** /topics/{topicId}/subtopics | List all subtopics
*ClassificationGuidesApi* | [**listTopics**](docs/ClassificationGuidesApi.md#listTopics) | **GET** /classification-guides/{classificationGuideId}/topics | List all topics
*ClassificationGuidesApi* | [**showClassificationGuideById**](docs/ClassificationGuidesApi.md#showClassificationGuideById) | **GET** /classification-guides/{classificationGuideId} | Get classification guide information
*ClassificationGuidesApi* | [**showTopicById**](docs/ClassificationGuidesApi.md#showTopicById) | **GET** /topics/{topicId} | Get topic information
*ClassificationGuidesApi* | [**updateClassificationGuide**](docs/ClassificationGuidesApi.md#updateClassificationGuide) | **PUT** /classification-guides/{classificationGuideId} | Update a classification guide
*ClassificationGuidesApi* | [**updateTopic**](docs/ClassificationGuidesApi.md#updateTopic) | **PUT** /topics/{topicId} | Update a topic
*ClassificationReasonsApi* | [**createClassificationReason**](docs/ClassificationReasonsApi.md#createClassificationReason) | **POST** /classification-reasons | Create a classification reason
*ClassificationReasonsApi* | [**deleteClassificationReason**](docs/ClassificationReasonsApi.md#deleteClassificationReason) | **DELETE** /classification-reasons/{classificationReasonId} | Delete a classification reason
*ClassificationReasonsApi* | [**listClassificationReasons**](docs/ClassificationReasonsApi.md#listClassificationReasons) | **GET** /classification-reasons | List all classification reasons
*ClassificationReasonsApi* | [**showClassificationReasonById**](docs/ClassificationReasonsApi.md#showClassificationReasonById) | **GET** /classification-reasons/{classificationReasonId} | Get classification reason information
*ClassificationReasonsApi* | [**updateClassificationReason**](docs/ClassificationReasonsApi.md#updateClassificationReason) | **PUT** /classification-reasons/{classificationReasonId} | Update a classification reason
*DeclassificationExemptionsApi* | [**createDeclassificationExemption**](docs/DeclassificationExemptionsApi.md#createDeclassificationExemption) | **POST** /declassification-exemptions | Create a declassification exemption
*DeclassificationExemptionsApi* | [**deleteDeclassificationExemption**](docs/DeclassificationExemptionsApi.md#deleteDeclassificationExemption) | **DELETE** /declassification-exemptions/{declassificationExemptionId} | Delete a declassification exemption
*DeclassificationExemptionsApi* | [**listDeclassificationExemptions**](docs/DeclassificationExemptionsApi.md#listDeclassificationExemptions) | **GET** /declassification-exemptions | List all declassification exemptions
*DeclassificationExemptionsApi* | [**showDeclassificationExemptionById**](docs/DeclassificationExemptionsApi.md#showDeclassificationExemptionById) | **GET** /declassification-exemptions/{declassificationExemptionId} | Get declassification exemption information
*DeclassificationExemptionsApi* | [**updateDeclassificationExemption**](docs/DeclassificationExemptionsApi.md#updateDeclassificationExemption) | **PUT** /declassification-exemptions/{declassificationExemptionId} | Update a declassification exemption
*DefaultClassificationValuesApi* | [**calculateDefaultDeclassificationDate**](docs/DefaultClassificationValuesApi.md#calculateDefaultDeclassificationDate) | **POST** /default-classification-values/{nodeId}/calculate-declassification-date | Calculate the default declassification date
*DefaultClassificationValuesApi* | [**declassificationDateRecalculationProcessesGet**](docs/DefaultClassificationValuesApi.md#declassificationDateRecalculationProcessesGet) | **GET** /declassification-date-recalculation-processes | Get declassification date recalculation information
*DefaultClassificationValuesApi* | [**declassificationDateRecalculationProcessesPost**](docs/DefaultClassificationValuesApi.md#declassificationDateRecalculationProcessesPost) | **POST** /declassification-date-recalculation-processes | Start the declassification date recalculation process
*DefaultClassificationValuesApi* | [**declassificationDateRecalculationProcessesProcessIdGet**](docs/DefaultClassificationValuesApi.md#declassificationDateRecalculationProcessesProcessIdGet) | **GET** /declassification-date-recalculation-processes/{processId} | Get declassification date recalculation process information
*HighestChildClassificationApi* | [**showHighestChildClassification**](docs/HighestChildClassificationApi.md#showHighestChildClassification) | **GET** /highest-child-classification/{containerNodeId} | Get highest classification item in the category or folder
*SecuredNodesApi* | [**getSecuringMarks**](docs/SecuredNodesApi.md#getSecuringMarks) | **GET** /secured-nodes/{nodeId}/securing-marks | List all security marks assigned to a node.
*SecuredNodesApi* | [**updateSecuringMarks**](docs/SecuredNodesApi.md#updateSecuringMarks) | **POST** /secured-nodes/{nodeId}/securing-marks | Manage the existing security marks for a node
*SecurityControlSettingsApi* | [**getSecurityControlSetting**](docs/SecurityControlSettingsApi.md#getSecurityControlSetting) | **GET** /security-control-settings/{securityControlSettingKey} | Get security control setting value
*SecurityControlSettingsApi* | [**updateSecurityControlSetting**](docs/SecurityControlSettingsApi.md#updateSecurityControlSetting) | **PUT** /security-control-settings/{securityControlSettingKey} | Update security control setting value
*SecurityGroupsApi* | [**createSecurityGroup**](docs/SecurityGroupsApi.md#createSecurityGroup) | **POST** /security-groups | Create a security group
*SecurityGroupsApi* | [**deleteSecurityGroup**](docs/SecurityGroupsApi.md#deleteSecurityGroup) | **DELETE** /security-groups/{securityGroupId} | Delete a security group
*SecurityGroupsApi* | [**getSecurityGroup**](docs/SecurityGroupsApi.md#getSecurityGroup) | **GET** /security-groups/{securityGroupId} | Get security group information
*SecurityGroupsApi* | [**listSecurityGroups**](docs/SecurityGroupsApi.md#listSecurityGroups) | **GET** /security-groups | List all security groups
*SecurityGroupsApi* | [**updateSecurityGroup**](docs/SecurityGroupsApi.md#updateSecurityGroup) | **PUT** /security-groups/{securityGroupId} | Update a security group
*SecurityMarksApi* | [**createSecurityMark**](docs/SecurityMarksApi.md#createSecurityMark) | **POST** /security-groups/{securityGroupId}/security-marks | Create a security mark in the security group with id **securityGroupId**.
*SecurityMarksApi* | [**deleteSecurityMark**](docs/SecurityMarksApi.md#deleteSecurityMark) | **DELETE** /security-groups/{securityGroupId}/security-marks/{securityMarkId} | Delete a security mark from a security group
*SecurityMarksApi* | [**getSecurityGroupMark**](docs/SecurityMarksApi.md#getSecurityGroupMark) | **GET** /security-groups/{securityGroupId}/security-marks/{securityMarkId} | Get security mark information
*SecurityMarksApi* | [**getSecurityGroupMarks**](docs/SecurityMarksApi.md#getSecurityGroupMarks) | **GET** /security-groups/{securityGroupId}/security-marks | Gets all the marks in a security group
*SecurityMarksApi* | [**updateSecurityMark**](docs/SecurityMarksApi.md#updateSecurityMark) | **PUT** /security-groups/{securityGroupId}/security-marks/{securityMarkId} | Update a security mark with id **securityMarkId**


## Documentation for Models

 - [ClassificationGuideBody](docs/ClassificationGuideBody.md)
 - [ClassificationGuideEntry](docs/ClassificationGuideEntry.md)
 - [ClassificationGuidePaging](docs/ClassificationGuidePaging.md)
 - [ClassificationGuidePagingList](docs/ClassificationGuidePagingList.md)
 - [ClassificationGuidesBody](docs/ClassificationGuidesBody.md)
 - [ClassificationGuidesEntry](docs/ClassificationGuidesEntry.md)
 - [ClassificationInformation](docs/ClassificationInformation.md)
 - [ClassificationLevel](docs/ClassificationLevel.md)
 - [ClassificationLevelEntry](docs/ClassificationLevelEntry.md)
 - [ClassificationReason](docs/ClassificationReason.md)
 - [ClassificationReasonBody](docs/ClassificationReasonBody.md)
 - [ClassificationReasonEntry](docs/ClassificationReasonEntry.md)
 - [ClassificationReasonsPaging](docs/ClassificationReasonsPaging.md)
 - [ClassificationReasonsPagingList](docs/ClassificationReasonsPagingList.md)
 - [DeclassificationDateRecalculationProcessBody](docs/DeclassificationDateRecalculationProcessBody.md)
 - [DeclassificationDateRecalculationProcessEntry](docs/DeclassificationDateRecalculationProcessEntry.md)
 - [DeclassificationDateRecalculationProcessPaging](docs/DeclassificationDateRecalculationProcessPaging.md)
 - [DeclassificationDateRecalculationProcessPagingList](docs/DeclassificationDateRecalculationProcessPagingList.md)
 - [DeclassificationExemption](docs/DeclassificationExemption.md)
 - [DeclassificationExemptionBody](docs/DeclassificationExemptionBody.md)
 - [DeclassificationExemptionEntry](docs/DeclassificationExemptionEntry.md)
 - [DeclassificationExemptionsPaging](docs/DeclassificationExemptionsPaging.md)
 - [DeclassificationExemptionsPagingList](docs/DeclassificationExemptionsPagingList.md)
 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [Instruction](docs/Instruction.md)
 - [InstructionBody](docs/InstructionBody.md)
 - [InstructionEntry](docs/InstructionEntry.md)
 - [Pagination](docs/Pagination.md)
 - [Path](docs/Path.md)
 - [PathElement](docs/PathElement.md)
 - [SecuringMark](docs/SecuringMark.md)
 - [SecuringMarksEntry](docs/SecuringMarksEntry.md)
 - [SecuringMarksPaging](docs/SecuringMarksPaging.md)
 - [SecuringMarksPagingList](docs/SecuringMarksPagingList.md)
 - [SecuringMarksUpdateBody](docs/SecuringMarksUpdateBody.md)
 - [SecuringMarksUpdateEntry](docs/SecuringMarksUpdateEntry.md)
 - [SecurityControlSetting](docs/SecurityControlSetting.md)
 - [SecurityControlSettingBody](docs/SecurityControlSettingBody.md)
 - [SecurityControlSettingEntry](docs/SecurityControlSettingEntry.md)
 - [SecurityGroupModel](docs/SecurityGroupModel.md)
 - [SecurityGroupModelEntry](docs/SecurityGroupModelEntry.md)
 - [SecurityGroupPaging](docs/SecurityGroupPaging.md)
 - [SecurityGroupPagingList](docs/SecurityGroupPagingList.md)
 - [SecurityMark](docs/SecurityMark.md)
 - [SecurityMarkBody](docs/SecurityMarkBody.md)
 - [SecurityMarkInformation](docs/SecurityMarkInformation.md)
 - [SecurityMarkInformationBody](docs/SecurityMarkInformationBody.md)
 - [SecurityMarkModel](docs/SecurityMarkModel.md)
 - [SecurityMarkModelEntry](docs/SecurityMarkModelEntry.md)
 - [SecurityMarks](docs/SecurityMarks.md)
 - [SecurityMarksBody](docs/SecurityMarksBody.md)
 - [SecurityMarksPaging](docs/SecurityMarksPaging.md)
 - [SecurityMarksPagingList](docs/SecurityMarksPagingList.md)
 - [SubtopicPaging](docs/SubtopicPaging.md)
 - [Topic](docs/Topic.md)
 - [TopicBody](docs/TopicBody.md)
 - [TopicEntry](docs/TopicEntry.md)
 - [TopicPaging](docs/TopicPaging.md)
 - [TopicPagingList](docs/TopicPagingList.md)
 - [ClassificationGuideInTopic](docs/ClassificationGuideInTopic.md)
 - [ClassificationGuidesInTopic](docs/ClassificationGuidesInTopic.md)
 - [CombinedInstructionBody](docs/CombinedInstructionBody.md)
 - [ClassificationGuide](docs/ClassificationGuide.md)
 - [ClassificationGuides](docs/ClassificationGuides.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



