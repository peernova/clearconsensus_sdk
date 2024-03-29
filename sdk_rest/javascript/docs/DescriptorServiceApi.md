# ClearconsensusSdk.DescriptorServiceApi

All URIs are relative to *http://api-dev.clearconsensus.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**descriptorServiceAddDescriptor**](DescriptorServiceApi.md#descriptorServiceAddDescriptor) | **POST** /api/v1/descriptor/add | AddDescriptor is used to add specific descriptor with specific definition to the system. Regular users can store a descriptor within their own scope, and any attempts to push it to a different scope will be declined. Back office users can store descriptors in any scope, provided that a scope key is provided. The name of the descriptor must match the name of the asset class to be mapped correctly. If a descriptor with the same name already exists, it will be updated.
[**descriptorServiceDescriptorDependencies**](DescriptorServiceApi.md#descriptorServiceDescriptorDependencies) | **POST** /api/v1/descriptor/dependencies | 
[**descriptorServiceDisableDescriptor**](DescriptorServiceApi.md#descriptorServiceDisableDescriptor) | **POST** /api/v1/descriptor/disable | DisableDescriptor is used to disable specific descriptor. Example of response : {    \&quot;data\&quot;: {        \&quot;uid\&quot;: \&quot;\&quot;,        \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;    } }
[**descriptorServiceEnableDescriptor**](DescriptorServiceApi.md#descriptorServiceEnableDescriptor) | **POST** /api/v1/descriptor/enable | EnableDescriptor is used to enable specific descriptor.
[**descriptorServiceGetDescriptor**](DescriptorServiceApi.md#descriptorServiceGetDescriptor) | **POST** /api/v1/descriptor/get | GetDescriptor is used to get specific descriptor definition based on get definition. Regular users can retrieve only their own descriptors and descriptors associated with asset classes. Back office users can retrieve any of the existing descriptors.
[**descriptorServiceGetDescriptorVersion**](DescriptorServiceApi.md#descriptorServiceGetDescriptorVersion) | **GET** /api/v1/descriptor/version/{scope}/{name}/{versionId} | GetDescriptorVersion returns current version of the specific descriptor.
[**descriptorServiceListDescriptorVersions**](DescriptorServiceApi.md#descriptorServiceListDescriptorVersions) | **POST** /api/v1/descriptor/versions | ListDescriptorVersions returns list of version of the specific descriptor versions.
[**descriptorServiceListDescriptors**](DescriptorServiceApi.md#descriptorServiceListDescriptors) | **POST** /api/v1/descriptor/list | ListDescriptors returns list of specific descriptors according to request.



## descriptorServiceAddDescriptor

> TitaniumAcknowledgeResponse descriptorServiceAddDescriptor(body)

AddDescriptor is used to add specific descriptor with specific definition to the system. Regular users can store a descriptor within their own scope, and any attempts to push it to a different scope will be declined. Back office users can store descriptors in any scope, provided that a scope key is provided. The name of the descriptor must match the name of the asset class to be mapped correctly. If a descriptor with the same name already exists, it will be updated.

Example of request for regular user : {   \&quot;name\&quot;:\&quot;foreign_exchange-vanilla-forwards\&quot;,   \&quot;fields\&quot;:[      { [data]&#x3D;\&quot;typeEnumToDisplayName[cellData]\&quot;v        \&quot;name\&quot;:\&quot;submission_date\&quot;,         \&quot;nullable\&quot;:true,         \&quot;type\&quot;:\&quot;string\&quot;      },      {         \&quot;name\&quot;:\&quot;submission_asset\&quot;,         \&quot;nullable\&quot;:true,         \&quot;type\&quot;:\&quot;string\&quot;      }   ] }  Example of request for Back Office : {   \&quot;name\&quot;:\&quot;foreign_exchange-vanilla-forwards\&quot;,   \&quot;scope\&quot;: \&quot;global\&quot;,   \&quot;fields\&quot;:[      {         \&quot;name\&quot;:\&quot;snap_date\&quot;,         \&quot;alias\&quot;:\&quot;snap_date\&quot;,         \&quot;type\&quot;:\&quot;date\&quot;,         \&quot;options\&quot;:{            \&quot;format\&quot;:\&quot;MM/dd/yy\&quot;         }      },      {         \&quot;name\&quot;:\&quot;asset\&quot;,         \&quot;alias\&quot;:\&quot;asset\&quot;,         \&quot;type\&quot;:\&quot;string\&quot;      },      {        \&quot;name\&quot;: \&quot;sub-asset\&quot;,        \&quot;alias\&quot;: \&quot;sub-asset\&quot;,        \&quot;type\&quot;: \&quot;string\&quot;      }   ] }  Example of response : {   \&quot;data\&quot;:{      \&quot;uid\&quot;:\&quot;98fd0526-cc88-11ec-b784-0fe7a41b45e0\&quot;,      \&quot;name\&quot;:\&quot;foreign_exchange-vanilla-forwards\&quot;   } }  Example of error response : {   \&quot;error\&quot;:{      \&quot;code\&quot;:70,      \&quot;message\&quot;:\&quot;Can&#39;t add descriptor: [com.peernova.api.searchmetadata.metadata.exceptions.MetaDataServiceException: Namespace [bank11] is not valid].\&quot;   } }

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.DescriptorServiceApi();
let body = new ClearconsensusSdk.TitaniumDescriptorDefinition(); // TitaniumDescriptorDefinition | 
apiInstance.descriptorServiceAddDescriptor(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TitaniumDescriptorDefinition**](TitaniumDescriptorDefinition.md)|  | 

### Return type

[**TitaniumAcknowledgeResponse**](TitaniumAcknowledgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## descriptorServiceDescriptorDependencies

> TitaniumDescriptorDependenciesResponse descriptorServiceDescriptorDependencies(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.DescriptorServiceApi();
let body = new ClearconsensusSdk.TitaniumGetDefinition(); // TitaniumGetDefinition | 
apiInstance.descriptorServiceDescriptorDependencies(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TitaniumGetDefinition**](TitaniumGetDefinition.md)|  | 

### Return type

[**TitaniumDescriptorDependenciesResponse**](TitaniumDescriptorDependenciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## descriptorServiceDisableDescriptor

> TitaniumAcknowledgeResponse descriptorServiceDisableDescriptor(body)

DisableDescriptor is used to disable specific descriptor. Example of response : {    \&quot;data\&quot;: {        \&quot;uid\&quot;: \&quot;\&quot;,        \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;    } }

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.DescriptorServiceApi();
let body = new ClearconsensusSdk.TitaniumEnableDisableRequest(); // TitaniumEnableDisableRequest | 
apiInstance.descriptorServiceDisableDescriptor(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TitaniumEnableDisableRequest**](TitaniumEnableDisableRequest.md)|  | 

### Return type

[**TitaniumAcknowledgeResponse**](TitaniumAcknowledgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## descriptorServiceEnableDescriptor

> TitaniumAcknowledgeResponse descriptorServiceEnableDescriptor(body)

EnableDescriptor is used to enable specific descriptor.

Example of request : {  \&quot;name\&quot; : \&quot;foreign_exchange-vanilla-forwards\&quot;,  \&quot;scope\&quot;: \&quot;global\&quot; }  Example of response : {    \&quot;data\&quot;: {        \&quot;uid\&quot;: \&quot;\&quot;,        \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;    } }

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.DescriptorServiceApi();
let body = new ClearconsensusSdk.TitaniumEnableDisableRequest(); // TitaniumEnableDisableRequest | 
apiInstance.descriptorServiceEnableDescriptor(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TitaniumEnableDisableRequest**](TitaniumEnableDisableRequest.md)|  | 

### Return type

[**TitaniumAcknowledgeResponse**](TitaniumAcknowledgeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## descriptorServiceGetDescriptor

> TitaniumDescriptorDefinitionResponse descriptorServiceGetDescriptor(body)

GetDescriptor is used to get specific descriptor definition based on get definition. Regular users can retrieve only their own descriptors and descriptors associated with asset classes. Back office users can retrieve any of the existing descriptors.

Example of request : {   \&quot;identifier\&quot;:{      \&quot;name\&quot;:\&quot;foreign_exchange-vanilla-forwards\&quot;   },   \&quot;scope\&quot;:\&quot;global\&quot; }  Example of response : {    \&quot;data\&quot;: \&quot;{\\\&quot;name\\\&quot;:\\\&quot;foreign_exchange-vanilla-forwards\\\&quot;,\\\&quot;fields\\\&quot;:[{\\\&quot;name\\\&quot;:\\\&quot;snap_date\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;date\\\&quot;,\\\&quot;options\\\&quot;:{\\\&quot;format\\\&quot;:\\\&quot;MM/dd/yy\\\&quot;},\\\&quot;alias\\\&quot;:\\\&quot;snap_date\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;asset\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;alias\\\&quot;:\\\&quot;asset\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;sub-asset\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;alias\\\&quot;:\\\&quot;sub-asset\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;service\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;service\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;snap_time\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;alias\\\&quot;:\\\&quot;snap_time\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;curr_1\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;alias\\\&quot;:\\\&quot;curr_1\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;curr_2\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;alias\\\&quot;:\\\&quot;curr_2\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;onshore_offshore_curr_1\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;onshore_offshore_curr_1\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;onshore_offshore_curr_2\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;onshore_offshore_curr_2\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;instrument_type\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;alias\\\&quot;:\\\&quot;instrument_type\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;tenor\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;tenor\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;value_source\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;value_source\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;fwrd_conversion_factor\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;double\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;fwrd_conversion_factor\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;mid_fwrd_outright\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;double\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;mid_fwrd_outright\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;value_source_ref_id\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;value_source_ref_id\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;client\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;alias\\\&quot;:\\\&quot;client\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;spot_reference_price\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;double\\\&quot;,\\\&quot;nullable\\\&quot;:true,\\\&quot;alias\\\&quot;:\\\&quot;spot_reference_price\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;mid_fwrd_points\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;double\\\&quot;,\\\&quot;alias\\\&quot;:\\\&quot;mid_fwrd_points\\\&quot;}]}\&quot; }  Example of error response : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Can&#39;t get descriptor: [[foreign_exchange-vanilla-forwards1] of service [DESCRIPTOR] does not exist in namespace [global]].\&quot;    } }

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.DescriptorServiceApi();
let body = new ClearconsensusSdk.TitaniumGetDefinition(); // TitaniumGetDefinition | 
apiInstance.descriptorServiceGetDescriptor(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TitaniumGetDefinition**](TitaniumGetDefinition.md)|  | 

### Return type

[**TitaniumDescriptorDefinitionResponse**](TitaniumDescriptorDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## descriptorServiceGetDescriptorVersion

> TitaniumDescriptorDefinitionResponse descriptorServiceGetDescriptorVersion(scope, name, versionId, opts)

GetDescriptorVersion returns current version of the specific descriptor.

Example of response : { \&quot;data\&quot;:\&quot;{\\\&quot;name\\\&quot;:\\\&quot;fx_test_for_bank1\\\&quot;,\\\&quot;fields\\\&quot;:[{\\\&quot;name\\\&quot;:\\\&quot;submission_date\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;date\\\&quot;,\\\&quot;options\\\&quot;:{\\\&quot;format\\\&quot;:\\\&quot;MM/dd/yyyy\\\&quot;},\\\&quot;alias\\\&quot;:\\\&quot;date12\\\&quot;},{\\\&quot;name\\\&quot;:\\\&quot;submission_asset\\\&quot;,\\\&quot;type\\\&quot;:\\\&quot;string\\\&quot;,\\\&quot;nullable\\\&quot;:true}],\\\&quot;options\\\&quot;:{\\\&quot;DEDUPLICATION\\\&quot;:{\\\&quot;GROUP_BY\\\&quot;:[\\\&quot;submission_date\\\&quot;,\\\&quot;submission_asset\\\&quot;]}}}\&quot; }

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.DescriptorServiceApi();
let scope = "scope_example"; // String | 
let name = "name_example"; // String | 
let versionId = "versionId_example"; // String | 
let opts = {
  'descriptorName': "descriptorName_example" // String | 
};
apiInstance.descriptorServiceGetDescriptorVersion(scope, name, versionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**|  | 
 **name** | **String**|  | 
 **versionId** | **String**|  | 
 **descriptorName** | **String**|  | [optional] 

### Return type

[**TitaniumDescriptorDefinitionResponse**](TitaniumDescriptorDefinitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## descriptorServiceListDescriptorVersions

> TitaniumListVersionResponse descriptorServiceListDescriptorVersions(body)

ListDescriptorVersions returns list of version of the specific descriptor versions.

Example of request : {   \&quot;scope\&quot;:\&quot;global\&quot;,   \&quot;identifier\&quot;:{      \&quot;name\&quot;:\&quot;foreign_exchange-vanilla-forwards\&quot;   } }  Example of response : {    \&quot;data\&quot;: {        \&quot;versions\&quot;: [            {                \&quot;versionId\&quot;: \&quot;fM9AukEqTJXKOcbW_tQ7Sfr4Clp5qinKq_liXZYzyiI&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-06-14 10:57:42.0\&quot;            },            {                \&quot;versionId\&quot;: \&quot;LmVlkPbnsUKFBw8qIbUHEzBsRrcnG_BSMnopA5Ptd7I&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-06-14 10:20:48.0\&quot;            }        ]    } }

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.DescriptorServiceApi();
let body = new ClearconsensusSdk.TitaniumGetDefinition(); // TitaniumGetDefinition | 
apiInstance.descriptorServiceListDescriptorVersions(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TitaniumGetDefinition**](TitaniumGetDefinition.md)|  | 

### Return type

[**TitaniumListVersionResponse**](TitaniumListVersionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## descriptorServiceListDescriptors

> TitaniumDescriptorList descriptorServiceListDescriptors(body)

ListDescriptors returns list of specific descriptors according to request.

Example of request : {   \&quot;scope\&quot;:\&quot;global\&quot; }  Example of response : {    \&quot;data\&quot;: {        \&quot;results\&quot;: [            {                \&quot;uid\&quot;: \&quot;\&quot;,                \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-options\&quot;            },            {                \&quot;uid\&quot;: \&quot;\&quot;,                \&quot;name\&quot;: \&quot;foreign_exchange-exotics-barriers_and_digitals\&quot;            },            {                \&quot;uid\&quot;: \&quot;\&quot;,                \&quot;name\&quot;: \&quot;foreign_exchange-exotics-tarfs\&quot;            }        ]    } }

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.DescriptorServiceApi();
let body = new ClearconsensusSdk.TitaniumListRequest(); // TitaniumListRequest | 
apiInstance.descriptorServiceListDescriptors(body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TitaniumListRequest**](TitaniumListRequest.md)|  | 

### Return type

[**TitaniumDescriptorList**](TitaniumDescriptorList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

