
# Node

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**name** | **String** | The name must not contain spaces or the following special characters: * \&quot; &lt; &gt; \\ / ? : and |. The character . must not be used at the end of the name.  | 
**nodeType** | **String** |  | 
**isFolder** | **Boolean** |  | 
**isFile** | **Boolean** |  | 
**isLocked** | **Boolean** |  |  [optional]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**modifiedByUser** | [**UserInfo**](UserInfo.md) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdByUser** | [**UserInfo**](UserInfo.md) |  | 
**parentId** | **String** |  |  [optional]
**isLink** | **Boolean** |  |  [optional]
**isFavorite** | **Boolean** |  |  [optional]
**content** | [**ContentInfo**](ContentInfo.md) |  |  [optional]
**aspectNames** | **List&lt;String&gt;** |  |  [optional]
**properties** | **Object** |  |  [optional]
**allowableOperations** | **List&lt;String&gt;** |  |  [optional]
**path** | [**PathInfo**](PathInfo.md) |  |  [optional]
**permissions** | [**PermissionsInfo**](PermissionsInfo.md) |  |  [optional]



