# ClearconsensusSdk.ConsensusServiceApi

All URIs are relative to *http://api-dev.clearconsensus.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consensusServiceCohortConsensusTab**](ConsensusServiceApi.md#consensusServiceCohortConsensusTab) | **POST** /api/v1/consensus-result-set-view | 
[**consensusServiceConsensus**](ConsensusServiceApi.md#consensusServiceConsensus) | **POST** /api/v1/consensus | Consensus return information about consensus according to request. Need to specify consensus run timestamp, asset ID and etc.(See ConsensusRequest definition) Returns ConsensusResponse that contains information about column and rows related to consensus.
[**consensusServiceConsensusActive**](ConsensusServiceApi.md#consensusServiceConsensusActive) | **POST** /api/v1/operator/consensus/active | 
[**consensusServiceConsensusDecision**](ConsensusServiceApi.md#consensusServiceConsensusDecision) | **POST** /api/v1/operator/consensus/decision | 
[**consensusServiceConsensusExplorerInstrumentDetails**](ConsensusServiceApi.md#consensusServiceConsensusExplorerInstrumentDetails) | **POST** /api/v1/consensus-explorer/details | 
[**consensusServiceConsensusExplorerRanges**](ConsensusServiceApi.md#consensusServiceConsensusExplorerRanges) | **POST** /api/v1/consensus-explorer/range | 
[**consensusServiceConsensusExplorerTable**](ConsensusServiceApi.md#consensusServiceConsensusExplorerTable) | **POST** /api/v1/consensus-explorer/table | 
[**consensusServiceConsensusHistory**](ConsensusServiceApi.md#consensusServiceConsensusHistory) | **POST** /api/v1/operator/consensus/history | 
[**consensusServiceConsensusOutliers**](ConsensusServiceApi.md#consensusServiceConsensusOutliers) | **POST** /api/v1/outliers-list | ConsensusOutliers return list of outliers according to specified consensus. Need to identify consensus tun timestamp and etc.(Described in OutliersListRequest) Return ConsensusActiveResponse that contains active consensuses with specified run timestamp.
[**consensusServiceConsensusPublish**](ConsensusServiceApi.md#consensusServiceConsensusPublish) | **POST** /api/v1/operator/consensus/publish | 
[**consensusServiceConsensusTimestamps**](ConsensusServiceApi.md#consensusServiceConsensusTimestamps) | **POST** /api/v1/consensus/timestamps | ConsensusTimestamps returns timestamps when it was submitted. Need to specify asset ID and trace name. Returns ConsensusTimestampsResponse that contains all the timestamps related to specified asset ID.
[**consensusServiceConsensusToPublish**](ConsensusServiceApi.md#consensusServiceConsensusToPublish) | **POST** /api/v1/operator/consensus/to-publish | 
[**consensusServiceEvaluatedPrice**](ConsensusServiceApi.md#consensusServiceEvaluatedPrice) | **POST** /api/v1/evaluated-price | 
[**consensusServiceGetConsensusRuns**](ConsensusServiceApi.md#consensusServiceGetConsensusRuns) | **POST** /api/v1/consensus-runs-view | Get Consensus Run&#39;s consensus result sets
[**consensusServiceSubmissionEvidenceTab**](ConsensusServiceApi.md#consensusServiceSubmissionEvidenceTab) | **POST** /api/v1/consensus-result-set-view/submission-evidence | 



## consensusServiceCohortConsensusTab

> TitaniumConsensusResultSetValuesResponse consensusServiceCohortConsensusTab(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusTabRequest(); // TitaniumConsensusTabRequest | 
apiInstance.consensusServiceCohortConsensusTab(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusTabRequest**](TitaniumConsensusTabRequest.md)|  | 

### Return type

[**TitaniumConsensusResultSetValuesResponse**](TitaniumConsensusResultSetValuesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensus

> TitaniumConsensusResponse consensusServiceConsensus(body)

Consensus return information about consensus according to request. Need to specify consensus run timestamp, asset ID and etc.(See ConsensusRequest definition) Returns ConsensusResponse that contains information about column and rows related to consensus.

This is a test of a different commenting type: Below we will be shown a placeholder for the Consensus RPC request. *sample input**  &gt;&#x60;{&#x60;&lt;br&gt; &gt;&#x60;   \&quot;asset_id\&quot;: \&quot;238917-2131-341ff\&quot;,&#x60;&lt;br&gt; &gt;&#x60;   \&quot;trace_name\&quot;: \&quot;placeholder value\&quot;,&#x60;&lt;br&gt; &gt;&#x60;   \&quot;submitted_date\&quot;: \&quot;238472301213\&quot;&#x60;&lt;br&gt; &gt;&#x60;}&#x60;

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusRequest(); // TitaniumConsensusRequest | 
apiInstance.consensusServiceConsensus(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusRequest**](TitaniumConsensusRequest.md)|  | 

### Return type

[**TitaniumConsensusResponse**](TitaniumConsensusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusActive

> TitaniumConsensusActiveResponse consensusServiceConsensusActive(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusActiveRequest(); // TitaniumConsensusActiveRequest | 
apiInstance.consensusServiceConsensusActive(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusActiveRequest**](TitaniumConsensusActiveRequest.md)|  | 

### Return type

[**TitaniumConsensusActiveResponse**](TitaniumConsensusActiveResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusDecision

> TitaniumMessageResponse consensusServiceConsensusDecision(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusDecisionRequest(); // TitaniumConsensusDecisionRequest | 
apiInstance.consensusServiceConsensusDecision(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusDecisionRequest**](TitaniumConsensusDecisionRequest.md)|  | 

### Return type

[**TitaniumMessageResponse**](TitaniumMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusExplorerInstrumentDetails

> TitaniumConsensusExplorerInstrumentDetailsResponse consensusServiceConsensusExplorerInstrumentDetails()



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
apiInstance.consensusServiceConsensusExplorerInstrumentDetails((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TitaniumConsensusExplorerInstrumentDetailsResponse**](TitaniumConsensusExplorerInstrumentDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusExplorerRanges

> TitaniumConsensusExplorerRangeResponse consensusServiceConsensusExplorerRanges()



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
apiInstance.consensusServiceConsensusExplorerRanges((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TitaniumConsensusExplorerRangeResponse**](TitaniumConsensusExplorerRangeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusExplorerTable

> TitaniumConsensusExplorerTableResponse consensusServiceConsensusExplorerTable()



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
apiInstance.consensusServiceConsensusExplorerTable((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TitaniumConsensusExplorerTableResponse**](TitaniumConsensusExplorerTableResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusHistory

> TitaniumConsensusHistoryResponse consensusServiceConsensusHistory(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusHistoryRequest(); // TitaniumConsensusHistoryRequest | 
apiInstance.consensusServiceConsensusHistory(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusHistoryRequest**](TitaniumConsensusHistoryRequest.md)|  | 

### Return type

[**TitaniumConsensusHistoryResponse**](TitaniumConsensusHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusOutliers

> TitaniumConsensusActiveResponse consensusServiceConsensusOutliers(body)

ConsensusOutliers return list of outliers according to specified consensus. Need to identify consensus tun timestamp and etc.(Described in OutliersListRequest) Return ConsensusActiveResponse that contains active consensuses with specified run timestamp.

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumOutliersListRequest(); // TitaniumOutliersListRequest | 
apiInstance.consensusServiceConsensusOutliers(body, (error, data, response) => {
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
 **body** | [**TitaniumOutliersListRequest**](TitaniumOutliersListRequest.md)|  | 

### Return type

[**TitaniumConsensusActiveResponse**](TitaniumConsensusActiveResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusPublish

> TitaniumMessageResponse consensusServiceConsensusPublish(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusPublishRequest(); // TitaniumConsensusPublishRequest | 
apiInstance.consensusServiceConsensusPublish(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusPublishRequest**](TitaniumConsensusPublishRequest.md)|  | 

### Return type

[**TitaniumMessageResponse**](TitaniumMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusTimestamps

> TitaniumConsensusTimestampsResponse consensusServiceConsensusTimestamps(body)

ConsensusTimestamps returns timestamps when it was submitted. Need to specify asset ID and trace name. Returns ConsensusTimestampsResponse that contains all the timestamps related to specified asset ID.

This is a test to see how detailed we can make a RPC method&#39;s documentation using this commenting type: Below we will be shown sample input for the ConsensusTimestamps endpoint. **sample input**  &gt;&#x60;{&#x60;&lt;br&gt; &gt;&#x60;   \&quot;asset_id\&quot;: \&quot;238917-2131-341ff\&quot;,&#x60;&lt;br&gt; &gt;&#x60;   \&quot;trace_name\&quot;: \&quot;placeholder value\&quot;&#x60;&lt;br&gt; &gt;&#x60;}&#x60;

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusTimestampsRequest(); // TitaniumConsensusTimestampsRequest | 
apiInstance.consensusServiceConsensusTimestamps(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusTimestampsRequest**](TitaniumConsensusTimestampsRequest.md)|  | 

### Return type

[**TitaniumConsensusTimestampsResponse**](TitaniumConsensusTimestampsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceConsensusToPublish

> TitaniumConsensusToPublishResponse consensusServiceConsensusToPublish(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusToPublishRequest(); // TitaniumConsensusToPublishRequest | 
apiInstance.consensusServiceConsensusToPublish(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusToPublishRequest**](TitaniumConsensusToPublishRequest.md)|  | 

### Return type

[**TitaniumConsensusToPublishResponse**](TitaniumConsensusToPublishResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceEvaluatedPrice

> TitaniumEVPResponse consensusServiceEvaluatedPrice(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumEVPRequest(); // TitaniumEVPRequest | 
apiInstance.consensusServiceEvaluatedPrice(body, (error, data, response) => {
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
 **body** | [**TitaniumEVPRequest**](TitaniumEVPRequest.md)|  | 

### Return type

[**TitaniumEVPResponse**](TitaniumEVPResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceGetConsensusRuns

> TitaniumGetConsensusRunsResponse consensusServiceGetConsensusRuns(body)

Get Consensus Run&#39;s consensus result sets

### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumGetConsensusRunsRequest(); // TitaniumGetConsensusRunsRequest | 
apiInstance.consensusServiceGetConsensusRuns(body, (error, data, response) => {
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
 **body** | [**TitaniumGetConsensusRunsRequest**](TitaniumGetConsensusRunsRequest.md)|  | 

### Return type

[**TitaniumGetConsensusRunsResponse**](TitaniumGetConsensusRunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## consensusServiceSubmissionEvidenceTab

> TitaniumConsensusResultSetValuesResponse consensusServiceSubmissionEvidenceTab(body)



### Example

```javascript
import ClearconsensusSdk from 'clearconsensus_sdk';

let apiInstance = new ClearconsensusSdk.ConsensusServiceApi();
let body = new ClearconsensusSdk.TitaniumConsensusTabRequest(); // TitaniumConsensusTabRequest | 
apiInstance.consensusServiceSubmissionEvidenceTab(body, (error, data, response) => {
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
 **body** | [**TitaniumConsensusTabRequest**](TitaniumConsensusTabRequest.md)|  | 

### Return type

[**TitaniumConsensusResultSetValuesResponse**](TitaniumConsensusResultSetValuesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

