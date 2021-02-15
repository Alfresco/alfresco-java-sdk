
# SharedLink

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**nodeId** | **String** |  |  [optional]
**name** | **String** | The name must not contain spaces or the following special characters: * \&quot; &lt; &gt; \\ / ? : and |.  The character . must not be used at the end of the name.  |  [optional]
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedByUser** | [**UserInfo**](UserInfo.md) |  |  [optional]
**sharedByUser** | [**UserInfo**](UserInfo.md) |  |  [optional]
**content** | [**ContentInfo**](ContentInfo.md) |  |  [optional]
**allowableOperations** | **List&lt;String&gt;** | The allowable operations for the Quickshare link itself. See allowableOperationsOnTarget for the allowable operations pertaining to the linked content node.  |  [optional]
**allowableOperationsOnTarget** | **List&lt;String&gt;** | The allowable operations for the content node being shared.  |  [optional]
**isFavorite** | **Boolean** |  |  [optional]
**properties** | **Object** | A subset of the target node&#39;s properties, system properties and properties already available in the SharedLink are excluded.  |  [optional]
**aspectNames** | **List&lt;String&gt;** |  |  [optional]



