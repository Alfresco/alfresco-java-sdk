
# CloudRuntimeEventModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appName** | **String** |  |  [optional]
**appVersion** | **String** |  |  [optional]
**businessKey** | **String** |  |  [optional]
**entity** | **Object** |  |  [optional]
**entityId** | **String** |  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**messageId** | **String** |  |  [optional]
**parentProcessInstanceId** | **String** |  |  [optional]
**processDefinitionId** | **String** |  |  [optional]
**processDefinitionKey** | **String** |  |  [optional]
**processDefinitionVersion** | **Integer** |  |  [optional]
**processInstanceId** | **String** |  |  [optional]
**sequenceNumber** | **Integer** |  |  [optional]
**serviceFullName** | **String** |  |  [optional]
**serviceName** | **String** |  |  [optional]
**serviceType** | **String** |  |  [optional]
**serviceVersion** | **String** |  |  [optional]
**timestamp** | **Long** |  |  [optional]


<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
ACTIVITY_CANCELLED | &quot;ACTIVITY_CANCELLED&quot;
ACTIVITY_COMPLETED | &quot;ACTIVITY_COMPLETED&quot;
ACTIVITY_STARTED | &quot;ACTIVITY_STARTED&quot;
APPLICATION_DEPLOYED | &quot;APPLICATION_DEPLOYED&quot;
ERROR_RECEIVED | &quot;ERROR_RECEIVED&quot;
INTEGRATION_ERROR_RECEIVED | &quot;INTEGRATION_ERROR_RECEIVED&quot;
INTEGRATION_REQUESTED | &quot;INTEGRATION_REQUESTED&quot;
INTEGRATION_RESULT_RECEIVED | &quot;INTEGRATION_RESULT_RECEIVED&quot;
MESSAGE_RECEIVED | &quot;MESSAGE_RECEIVED&quot;
MESSAGE_SENT | &quot;MESSAGE_SENT&quot;
MESSAGE_WAITING | &quot;MESSAGE_WAITING&quot;
PROCESS_CANCELLED | &quot;PROCESS_CANCELLED&quot;
PROCESS_COMPLETED | &quot;PROCESS_COMPLETED&quot;
PROCESS_CREATED | &quot;PROCESS_CREATED&quot;
PROCESS_DEPLOYED | &quot;PROCESS_DEPLOYED&quot;
PROCESS_RESUMED | &quot;PROCESS_RESUMED&quot;
PROCESS_STARTED | &quot;PROCESS_STARTED&quot;
PROCESS_SUSPENDED | &quot;PROCESS_SUSPENDED&quot;
PROCESS_UPDATED | &quot;PROCESS_UPDATED&quot;
SEQUENCE_FLOW_TAKEN | &quot;SEQUENCE_FLOW_TAKEN&quot;
SIGNAL_RECEIVED | &quot;SIGNAL_RECEIVED&quot;
TASK_ACTIVATED | &quot;TASK_ACTIVATED&quot;
TASK_ASSIGNED | &quot;TASK_ASSIGNED&quot;
TASK_CANCELLED | &quot;TASK_CANCELLED&quot;
TASK_CANDIDATE_GROUP_ADDED | &quot;TASK_CANDIDATE_GROUP_ADDED&quot;
TASK_CANDIDATE_GROUP_REMOVED | &quot;TASK_CANDIDATE_GROUP_REMOVED&quot;
TASK_CANDIDATE_USER_ADDED | &quot;TASK_CANDIDATE_USER_ADDED&quot;
TASK_CANDIDATE_USER_REMOVED | &quot;TASK_CANDIDATE_USER_REMOVED&quot;
TASK_COMPLETED | &quot;TASK_COMPLETED&quot;
TASK_CREATED | &quot;TASK_CREATED&quot;
TASK_SUSPENDED | &quot;TASK_SUSPENDED&quot;
TASK_UPDATED | &quot;TASK_UPDATED&quot;
TIMER_CANCELLED | &quot;TIMER_CANCELLED&quot;
TIMER_EXECUTED | &quot;TIMER_EXECUTED&quot;
TIMER_FAILED | &quot;TIMER_FAILED&quot;
TIMER_FIRED | &quot;TIMER_FIRED&quot;
TIMER_RETRIES_DECREMENTED | &quot;TIMER_RETRIES_DECREMENTED&quot;
TIMER_SCHEDULED | &quot;TIMER_SCHEDULED&quot;
VARIABLE_CREATED | &quot;VARIABLE_CREATED&quot;
VARIABLE_DELETED | &quot;VARIABLE_DELETED&quot;
VARIABLE_UPDATED | &quot;VARIABLE_UPDATED&quot;



