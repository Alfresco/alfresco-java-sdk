
# RMSite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**guid** | **String** |  | 
**title** | **String** |  | 
**description** | **String** |  |  [optional]
**visibility** | [**VisibilityEnum**](#VisibilityEnum) |  | 
**compliance** | [**ComplianceEnum**](#ComplianceEnum) |  | 
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]


<a name="VisibilityEnum"></a>
## Enum: VisibilityEnum
Name | Value
---- | -----
PRIVATE | &quot;PRIVATE&quot;
MODERATED | &quot;MODERATED&quot;
PUBLIC | &quot;PUBLIC&quot;


<a name="ComplianceEnum"></a>
## Enum: ComplianceEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
DOD5015 | &quot;DOD5015&quot;


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
SITECONSUMER | &quot;SiteConsumer&quot;
SITECOLLABORATOR | &quot;SiteCollaborator&quot;
SITECONTRIBUTOR | &quot;SiteContributor&quot;
SITEMANAGER | &quot;SiteManager&quot;



