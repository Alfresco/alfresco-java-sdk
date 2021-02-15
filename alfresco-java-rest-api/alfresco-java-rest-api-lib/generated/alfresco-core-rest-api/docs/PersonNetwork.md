
# PersonNetwork

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | This network&#39;s unique id | 
**homeNetwork** | **Boolean** | Is this the home network? |  [optional]
**isEnabled** | **Boolean** |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**paidNetwork** | **Boolean** |  |  [optional]
**subscriptionLevel** | [**SubscriptionLevelEnum**](#SubscriptionLevelEnum) |  |  [optional]
**quotas** | [**List&lt;NetworkQuota&gt;**](NetworkQuota.md) |  |  [optional]


<a name="SubscriptionLevelEnum"></a>
## Enum: SubscriptionLevelEnum
Name | Value
---- | -----
FREE | &quot;Free&quot;
STANDARD | &quot;Standard&quot;
ENTERPRISE | &quot;Enterprise&quot;



