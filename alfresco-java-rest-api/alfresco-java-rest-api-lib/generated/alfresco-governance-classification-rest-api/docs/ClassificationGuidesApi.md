# ClassificationGuidesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**combinedInstructions**](ClassificationGuidesApi.md#combinedInstructions) | **POST** /combined-instructions | Combined instructions
[**createClassificationGuide**](ClassificationGuidesApi.md#createClassificationGuide) | **POST** /classification-guides | Create a classification guide
[**createSubtopic**](ClassificationGuidesApi.md#createSubtopic) | **POST** /topics/{topicId}/subtopics | Create a subtopic
[**createTopic**](ClassificationGuidesApi.md#createTopic) | **POST** /classification-guides/{classificationGuideId}/topics | Create a topic
[**deleteClassificationGuide**](ClassificationGuidesApi.md#deleteClassificationGuide) | **DELETE** /classification-guides/{classificationGuideId} | Delete a classification guide
[**deleteTopic**](ClassificationGuidesApi.md#deleteTopic) | **DELETE** /topics/{topicId} | Delete a topic
[**listClassificationGuides**](ClassificationGuidesApi.md#listClassificationGuides) | **GET** /classification-guides | List all classification guides
[**listSubtopics**](ClassificationGuidesApi.md#listSubtopics) | **GET** /topics/{topicId}/subtopics | List all subtopics
[**listTopics**](ClassificationGuidesApi.md#listTopics) | **GET** /classification-guides/{classificationGuideId}/topics | List all topics
[**showClassificationGuideById**](ClassificationGuidesApi.md#showClassificationGuideById) | **GET** /classification-guides/{classificationGuideId} | Get classification guide information
[**showTopicById**](ClassificationGuidesApi.md#showTopicById) | **GET** /topics/{topicId} | Get topic information
[**updateClassificationGuide**](ClassificationGuidesApi.md#updateClassificationGuide) | **PUT** /classification-guides/{classificationGuideId} | Update a classification guide
[**updateTopic**](ClassificationGuidesApi.md#updateTopic) | **PUT** /topics/{topicId} | Update a topic


<a name="combinedInstructions"></a>
# **combinedInstructions**
> InstructionEntry combinedInstructions(instructions)

Combined instructions

Combines instructions from the given topics and the user defined instruction, if any.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
CombinedInstructionBody instructions = new CombinedInstructionBody(); // CombinedInstructionBody | Instructions
try {
    InstructionEntry result = apiInstance.combinedInstructions(instructions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#combinedInstructions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instructions** | [**CombinedInstructionBody**](CombinedInstructionBody.md)| Instructions | [optional]

### Return type

[**InstructionEntry**](InstructionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClassificationGuide"></a>
# **createClassificationGuide**
> ClassificationGuideEntry createClassificationGuide(classificationGuide)

Create a classification guide

Creates a new classification guide.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
ClassificationGuideBody classificationGuide = new ClassificationGuideBody(); // ClassificationGuideBody | Classification guide
try {
    ClassificationGuideEntry result = apiInstance.createClassificationGuide(classificationGuide);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#createClassificationGuide");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classificationGuide** | [**ClassificationGuideBody**](ClassificationGuideBody.md)| Classification guide |

### Return type

[**ClassificationGuideEntry**](ClassificationGuideEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSubtopic"></a>
# **createSubtopic**
> TopicEntry createSubtopic(topicId, topic, include)

Create a subtopic

Creates a new subtopic of a topic.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String topicId = "topicId_example"; // String | The identifier for the topic
TopicBody topic = new TopicBody(); // TopicBody | Subtopic
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. 
try {
    TopicEntry result = apiInstance.createSubtopic(topicId, topic, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#createSubtopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**| The identifier for the topic |
 **topic** | [**TopicBody**](TopicBody.md)| Subtopic |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in.  | [optional]

### Return type

[**TopicEntry**](TopicEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTopic"></a>
# **createTopic**
> TopicEntry createTopic(classificationGuideId, topic, include)

Create a topic

Creates a new topic.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String classificationGuideId = "classificationGuideId_example"; // String | The identifier for the classification guide
TopicBody topic = new TopicBody(); // TopicBody | Topic
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. 
try {
    TopicEntry result = apiInstance.createTopic(classificationGuideId, topic, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#createTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classificationGuideId** | **String**| The identifier for the classification guide |
 **topic** | [**TopicBody**](TopicBody.md)| Topic |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in.  | [optional]

### Return type

[**TopicEntry**](TopicEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClassificationGuide"></a>
# **deleteClassificationGuide**
> deleteClassificationGuide(classificationGuideId)

Delete a classification guide

Deletes the classification guide with id **classificationGuideId**, including any topics and instructions.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String classificationGuideId = "classificationGuideId_example"; // String | The identifier for the classification guide
try {
    apiInstance.deleteClassificationGuide(classificationGuideId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#deleteClassificationGuide");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classificationGuideId** | **String**| The identifier for the classification guide |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTopic"></a>
# **deleteTopic**
> deleteTopic(topicId)

Delete a topic

Deletes the topic with id  **topicId**, including any subtopics and instructions.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String topicId = "topicId_example"; // String | The identifier for the topic
try {
    apiInstance.deleteTopic(topicId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#deleteTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**| The identifier for the topic |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listClassificationGuides"></a>
# **listClassificationGuides**
> ClassificationGuidePaging listClassificationGuides(include, skipCount, maxItems, orderBy, where)

List all classification guides

Gets all classification guides.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the guide. The following optional fields can be requested: * hasTopics - A flag indicating whether the guide already contains any topics. 
Integer skipCount = 56; // Integer | The number of entities that exist in the collection before those included in this list.
Integer maxItems = 56; // Integer | The maximum number of items to return in the list.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. 
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR. Fields to filter on: * enabled - e.g. (enabled = true OR enabled = false) 
try {
    ClassificationGuidePaging result = apiInstance.listClassificationGuides(include, skipCount, maxItems, orderBy, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#listClassificationGuides");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the guide. The following optional fields can be requested: * hasTopics - A flag indicating whether the guide already contains any topics.  | [optional]
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **where** | **String**| A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR. Fields to filter on: * enabled - e.g. (enabled &#x3D; true OR enabled &#x3D; false)  | [optional]

### Return type

[**ClassificationGuidePaging**](ClassificationGuidePaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSubtopics"></a>
# **listSubtopics**
> SubtopicPaging listSubtopics(topicId, include, skipCount, maxItems, orderBy, where, includeSource)

List all subtopics

Gets all subtopics of a topic.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String topicId = "topicId_example"; // String | The identifier for the topic
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. 
Integer skipCount = 56; // Integer | The number of entities that exist in the collection before those included in this list.
Integer maxItems = 56; // Integer | The maximum number of items to return in the list.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. 
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR. Fields to filter on: * hasInstruction * hasSubtopics 
Boolean includeSource = true; // Boolean | Also include **source** in addition to **entries** with folder information on the parent guide/topic
try {
    SubtopicPaging result = apiInstance.listSubtopics(topicId, include, skipCount, maxItems, orderBy, where, includeSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#listSubtopics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**| The identifier for the topic |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in.  | [optional]
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **where** | **String**| A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR. Fields to filter on: * hasInstruction * hasSubtopics  | [optional]
 **includeSource** | **Boolean**| Also include **source** in addition to **entries** with folder information on the parent guide/topic | [optional]

### Return type

[**SubtopicPaging**](SubtopicPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTopics"></a>
# **listTopics**
> TopicPaging listTopics(classificationGuideId, include, skipCount, maxItems, orderBy, where, includeSource)

List all topics

Gets all topics.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String classificationGuideId = "classificationGuideId_example"; // String | The identifier for the classification guide
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. 
Integer skipCount = 56; // Integer | The number of entities that exist in the collection before those included in this list.
Integer maxItems = 56; // Integer | The maximum number of items to return in the list.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. 
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR e.g. (instruction=true and hasSubtopics=false). Fields to filter on: * hasInstruction * hasSubtopics 
Boolean includeSource = true; // Boolean | Also include **source** in addition to **entries** with folder information on the parent guide/topic
try {
    TopicPaging result = apiInstance.listTopics(classificationGuideId, include, skipCount, maxItems, orderBy, where, includeSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#listTopics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classificationGuideId** | **String**| The identifier for the classification guide |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in.  | [optional]
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **where** | **String**| A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR e.g. (instruction&#x3D;true and hasSubtopics&#x3D;false). Fields to filter on: * hasInstruction * hasSubtopics  | [optional]
 **includeSource** | **Boolean**| Also include **source** in addition to **entries** with folder information on the parent guide/topic | [optional]

### Return type

[**TopicPaging**](TopicPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showClassificationGuideById"></a>
# **showClassificationGuideById**
> ClassificationGuideEntry showClassificationGuideById(classificationGuideId)

Get classification guide information

Gets the classification guide with id **classificationGuideId**.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String classificationGuideId = "classificationGuideId_example"; // String | The identifier for the classification guide
try {
    ClassificationGuideEntry result = apiInstance.showClassificationGuideById(classificationGuideId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#showClassificationGuideById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classificationGuideId** | **String**| The identifier for the classification guide |

### Return type

[**ClassificationGuideEntry**](ClassificationGuideEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTopicById"></a>
# **showTopicById**
> TopicEntry showTopicById(topicId, include)

Get topic information

Gets the topic with id **topicId**.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String topicId = "topicId_example"; // String | The identifier for the topic
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. 
try {
    TopicEntry result = apiInstance.showTopicById(topicId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#showTopicById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**| The identifier for the topic |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in.  | [optional]

### Return type

[**TopicEntry**](TopicEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClassificationGuide"></a>
# **updateClassificationGuide**
> ClassificationGuideEntry updateClassificationGuide(classificationGuideId, classificationGuide)

Update a classification guide

Updates the classification guide with id **classificationGuideId**. For example, you can rename a classification guide.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String classificationGuideId = "classificationGuideId_example"; // String | The identifier for the classification guide
ClassificationGuideBody classificationGuide = new ClassificationGuideBody(); // ClassificationGuideBody | Classification guide
try {
    ClassificationGuideEntry result = apiInstance.updateClassificationGuide(classificationGuideId, classificationGuide);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#updateClassificationGuide");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classificationGuideId** | **String**| The identifier for the classification guide |
 **classificationGuide** | [**ClassificationGuideBody**](ClassificationGuideBody.md)| Classification guide |

### Return type

[**ClassificationGuideEntry**](ClassificationGuideEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTopic"></a>
# **updateTopic**
> TopicEntry updateTopic(topicId, topic, include)

Update a topic

Updates the topic with id **topicId**.  Use this to rename a topic or to add, edit, or remove the instruction associated with it. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.ClassificationGuidesApi;








ClassificationGuidesApi apiInstance = new ClassificationGuidesApi();
String topicId = "topicId_example"; // String | The identifier for the topic
TopicBody topic = new TopicBody(); // TopicBody | Topic
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. 
try {
    TopicEntry result = apiInstance.updateTopic(topicId, topic, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationGuidesApi#updateTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topicId** | **String**| The identifier for the topic |
 **topic** | [**TopicBody**](TopicBody.md)| Topic |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in.  | [optional]

### Return type

[**TopicEntry**](TopicEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

