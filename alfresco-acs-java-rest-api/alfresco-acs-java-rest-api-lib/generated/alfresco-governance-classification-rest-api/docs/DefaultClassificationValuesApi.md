# DefaultClassificationValuesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateDefaultDeclassificationDate**](DefaultClassificationValuesApi.md#calculateDefaultDeclassificationDate) | **POST** /default-classification-values/{nodeId}/calculate-declassification-date | Calculate the default declassification date
[**declassificationDateRecalculationProcessesGet**](DefaultClassificationValuesApi.md#declassificationDateRecalculationProcessesGet) | **GET** /declassification-date-recalculation-processes | Get declassification date recalculation information
[**declassificationDateRecalculationProcessesPost**](DefaultClassificationValuesApi.md#declassificationDateRecalculationProcessesPost) | **POST** /declassification-date-recalculation-processes | Start the declassification date recalculation process
[**declassificationDateRecalculationProcessesProcessIdGet**](DefaultClassificationValuesApi.md#declassificationDateRecalculationProcessesProcessIdGet) | **GET** /declassification-date-recalculation-processes/{processId} | Get declassification date recalculation process information


<a name="calculateDefaultDeclassificationDate"></a>
# **calculateDefaultDeclassificationDate**
> String calculateDefaultDeclassificationDate(nodeId)

Calculate the default declassification date

Calculates the default declassification date for **nodeId** based on the properties of the node and the current declassification time frame.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="declassificationDateRecalculationProcessesGet"></a>
# **declassificationDateRecalculationProcessesGet**
> DeclassificationDateRecalculationProcessPaging declassificationDateRecalculationProcessesGet()

Get declassification date recalculation information

Find the status of the declassification date recalculation process(es).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DeclassificationDateRecalculationProcessPaging**](DeclassificationDateRecalculationProcessPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="declassificationDateRecalculationProcessesPost"></a>
# **declassificationDateRecalculationProcessesPost**
> DeclassificationDateRecalculationProcessEntry declassificationDateRecalculationProcessesPost(declassificationDateRecalculationProcess)

Start the declassification date recalculation process

Start the declassification date recalculation process with id **processId** if it is not already running.  The only supported id is \&quot;-declassificationDateRecalculationProcess-\&quot;. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **declassificationDateRecalculationProcess** | [**DeclassificationDateRecalculationProcessBody**](DeclassificationDateRecalculationProcessBody.md)| The entity containing the identifier for the declassification date recalculation process. The id should be set to \&quot;-declassificationDateRecalculationProcess-\&quot;. |

### Return type

[**DeclassificationDateRecalculationProcessEntry**](DeclassificationDateRecalculationProcessEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="declassificationDateRecalculationProcessesProcessIdGet"></a>
# **declassificationDateRecalculationProcessesProcessIdGet**
> DeclassificationDateRecalculationProcessEntry declassificationDateRecalculationProcessesProcessIdGet(processId)

Get declassification date recalculation process information

Gets the declassification date recalculation process with id **processId**.  The only supported id is \&quot;-declassificationDateRecalculationProcess-\&quot;.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| The identifier for the declassification date recalculation process. This should be set to \&quot;-declassificationDateRecalculationProcess-\&quot;. |

### Return type

[**DeclassificationDateRecalculationProcessEntry**](DeclassificationDateRecalculationProcessEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

