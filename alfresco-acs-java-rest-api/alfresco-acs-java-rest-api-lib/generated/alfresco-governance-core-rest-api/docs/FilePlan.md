
# FilePlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**parentId** | **String** |  | 
**name** | **String** | The name must not contain spaces or the following special characters: * \&quot; &lt; &gt; \\ / ? : and |. The character . must not be used at the end of the name.  | 
**nodeType** | **String** |  | 
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**modifiedByUser** | [**UserInfo**](UserInfo.md) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdByUser** | [**UserInfo**](UserInfo.md) |  | 
**aspectNames** | **List&lt;String&gt;** |  |  [optional]
**properties** | **Object** |  |  [optional]
**allowableOperations** | **List&lt;String&gt;** |  |  [optional]
**path** | [**PathInfo**](PathInfo.md) |  |  [optional]



