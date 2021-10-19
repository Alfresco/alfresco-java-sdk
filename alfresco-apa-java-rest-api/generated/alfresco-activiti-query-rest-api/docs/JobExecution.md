
# JobExecution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**exitDescription** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**jobId** | **Long** |  |  [optional]
**jobName** | **String** |  |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ABANDONED | &quot;ABANDONED&quot;
COMPLETED | &quot;COMPLETED&quot;
FAILED | &quot;FAILED&quot;
STARTED | &quot;STARTED&quot;
STARTING | &quot;STARTING&quot;
STOPPED | &quot;STOPPED&quot;
STOPPING | &quot;STOPPING&quot;
UNKNOWN | &quot;UNKNOWN&quot;



