# Subscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdDate** | **Long** |  |  [optional]
**modifiedDate** | **Long** |  |  [optional]
**id** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**type** | **String** |  | 
**user** | **String** |  |  [optional]
**config** | **Map&lt;String, String&gt;** |  |  [optional]
**filters** | [**List&lt;Filter&gt;**](Filter.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
