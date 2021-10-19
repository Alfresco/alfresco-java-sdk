
# Descriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String** |  |  [optional]
**deployed** | **Boolean** |  |  [optional]
**id** | **Long** |  |  [optional]
**lastModifiedAt** | **String** |  |  [optional]
**name** | **String** |  | 
**payload** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CREATEAPP | &quot;CreateApp&quot;
CREATEDESCRIPTOR | &quot;CreateDescriptor&quot;
DEPLOYSTARTED | &quot;DeployStarted&quot;
DEPLOYSTARTEDFAILED | &quot;DeployStartedFailed&quot;
DESCRIPTORCREATED | &quot;DescriptorCreated&quot;
IMAGEBUILD | &quot;ImageBuild&quot;
IMAGEBUILDFAILED | &quot;ImageBuildFailed&quot;
IMAGEPUSH | &quot;ImagePush&quot;
IMAGEPUSHFAILED | &quot;ImagePushFailed&quot;
NOTDEPLOYED | &quot;NotDeployed&quot;
PENDING | &quot;Pending&quot;
RUNNING | &quot;Running&quot;
UNKNOWN | &quot;Unknown&quot;
UPDATEAPP | &quot;UpdateApp&quot;
WAITINGFORDESCRIPTOR | &quot;WaitingForDescriptor&quot;



