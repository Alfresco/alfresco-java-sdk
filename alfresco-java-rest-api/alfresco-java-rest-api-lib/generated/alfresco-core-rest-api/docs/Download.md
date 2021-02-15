
# Download

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filesAdded** | **Integer** | number of files added so far in the zip |  [optional]
**bytesAdded** | **Integer** | number of bytes added so far in the zip |  [optional]
**id** | **String** | the id of the download node |  [optional]
**totalFiles** | **Integer** | the total number of files to be added in the zip |  [optional]
**totalBytes** | **Integer** | the total number of bytes to be added in the zip |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | the current status of the download node creation |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELLED | &quot;CANCELLED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
DONE | &quot;DONE&quot;
MAX_CONTENT_SIZE_EXCEEDED | &quot;MAX_CONTENT_SIZE_EXCEEDED&quot;



