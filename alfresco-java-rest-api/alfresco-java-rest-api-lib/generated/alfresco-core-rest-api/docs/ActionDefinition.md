
# ActionDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the action definition — used for example when executing an action | 
**name** | **String** | name of the action definition, e.g. \&quot;move\&quot; |  [optional]
**title** | **String** | title of the action definition, e.g. \&quot;Move\&quot; |  [optional]
**description** | **String** | describes the action definition, e.g. \&quot;This will move the matched item to another space.\&quot; |  [optional]
**applicableTypes** | **List&lt;String&gt;** | QNames of the types this action applies to | 
**trackStatus** | **Boolean** | whether the basic action definition supports action tracking or not | 
**parameterDefinitions** | [**List&lt;ActionParameterDefinition&gt;**](ActionParameterDefinition.md) |  |  [optional]



