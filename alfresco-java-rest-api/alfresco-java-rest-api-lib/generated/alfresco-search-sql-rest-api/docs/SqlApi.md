# SqlApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/search/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SqlApi.md#search) | **POST** /sql | Alfresco Insight Engine SQL Passthrough


<a name="search"></a>
# **search**
> SQLResultSetPaging search(queryBody)

Alfresco Insight Engine SQL Passthrough

**Note**: this endpoint is available in Alfresco 6.0 and newer versions. This will require Insight Engine and will not work with Alfresco Search Services.  **You specify all the parameters in this API in a JSON body**, A basic query looks like this:  &#x60;&#x60;&#x60;JSON {   \&quot;stmt\&quot;: \&quot;select * from alfresco\&quot;,   \&quot;locales\&quot;: [\&quot;en_UK\&quot;]   \&quot;timezone\&quot;: \&quot;Europe/London\&quot;   \&quot;includeMetadata\&quot;:true } &#x60;&#x60;&#x60;  **Note:** the minimum possible query parameter required. &#x60;&#x60;&#x60;JSON {   \&quot;stmt\&quot;: } &#x60;&#x60;&#x60; The expected reponse will appear in the Alfresco format as seen below. &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 1,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 1,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100   },   \&quot;entries\&quot;: [{     \&quot;entry\&quot;: [       {         \&quot;label\&quot;: \&quot;aliases\&quot;,         \&quot;value\&quot;: \&quot;{\\\&quot;SITE\\\&quot;:\\\&quot;site\\\&quot;}\&quot;       },       {         \&quot;label\&quot;: \&quot;isMetadata\&quot;,         \&quot;value\&quot;: \&quot;true\&quot;       },       {         \&quot;label\&quot;: \&quot;fields\&quot;,         \&quot;value\&quot;: \&quot;[\\\&quot;SITE\\\&quot;]\&quot;       }     ]   }]}}   &#x60;&#x60;&#x60;   To override the default format set the format to solr.   &#x60;&#x60;&#x60;JSON   {     \&quot;stmt\&quot;: \&quot;select * from alfresco\&quot;,     \&quot;format\&quot;: \&quot;solr\&quot;   } &#x60;&#x60;&#x60; This will return Solr&#39;s output response. &#x60;&#x60;&#x60;JSON {   \&quot;result-set\&quot;: {   \&quot;docs\&quot;: [     {       \&quot;aliases\&quot;: {       \&quot;SITE\&quot;: \&quot;site\&quot;     },       \&quot;isMetadata\&quot;: true,       \&quot;fields\&quot;: [ \&quot;SITE\&quot;]     },     {         \&quot;RESPONSE_TIME\&quot;: 23,         \&quot;EOF\&quot;: true     }   ]} } &#x60;&#x60;&#x60;   You can use the **locales parameter** to filter results based on locale. &#x60;&#x60;&#x60;JSON \&quot;locales\&quot;: [\&quot;en_UK\&quot;, \&quot;en_US\&quot;] &#x60;&#x60;&#x60;  To include timezone in the query add the **timezone parameter**. &#x60;&#x60;&#x60;JSON \&quot;timezone\&quot;: \&quot;Japan\&quot; &#x60;&#x60;&#x60;  To include custom filter queries add the **filterQueries parameter**. &#x60;&#x60;&#x60;JSON \&quot;filterQueries\&quot;: [\&quot;-SITE:swsdp\&quot;] &#x60;&#x60;&#x60;  You can use the **includeMetadata parameter** to include addtional  information, this is by default set to false.  &#x60;&#x60;&#x60;JSON \&quot;includeMetadata\&quot;: \&quot;false\&quot; &#x60;&#x60;&#x60; Please note that if its set to true the first entry will represent the metdata requested   &#x60;&#x60;&#x60;JSON  {    \&quot;stmt\&quot;: \&quot;select site from alfresco limit 2\&quot;,    \&quot;includeMetadata\&quot;:true  } &#x60;&#x60;&#x60; The expected response: &#x60;&#x60;&#x60;JSON \&quot;entries\&quot;: [   {     #First entry holds the Metadata infromation as set by {includeMetadata:true}     \&quot;entry\&quot;: [       {         \&quot;label\&quot;: \&quot;aliases\&quot;,         \&quot;value\&quot;: \&quot;{\\\&quot;SITE\\\&quot;:\\\&quot;site\\\&quot;}\&quot;        },       {         \&quot;label\&quot;: \&quot;isMetadata\&quot;,         \&quot;value\&quot;: \&quot;true\&quot;       },       {         \&quot;label\&quot;: \&quot;fields\&quot;,         \&quot;value\&quot;: \&quot;[\\\&quot;SITE\\\&quot;]\&quot;       }     ]     #end of Metadata   },   {     #Query result entry value.     \&quot;entry\&quot;: [       {         \&quot;label\&quot;: \&quot;site\&quot;,         \&quot;value\&quot;: \&quot;[\\\&quot;test\\\&quot;]\&quot;       }     ]   },   {     \&quot;entry\&quot;: [     {       \&quot;label\&quot;: \&quot;site\&quot;,       \&quot;value\&quot;: \&quot;[\\\&quot;test\\\&quot;]\&quot;     }     ]   } ] &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.search.sql.handler.SqlApi;








SqlApi apiInstance = new SqlApi();
SQLSearchRequest queryBody = new SQLSearchRequest(); // SQLSearchRequest | Generic query API 
try {
    SQLResultSetPaging result = apiInstance.search(queryBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryBody** | [**SQLSearchRequest**](SQLSearchRequest.md)| Generic query API  |

### Return type

[**SQLResultSetPaging**](SQLResultSetPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

