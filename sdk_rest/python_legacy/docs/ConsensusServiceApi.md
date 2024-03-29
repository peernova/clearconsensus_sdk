# openapi_client.ConsensusServiceApi

All URIs are relative to *http://api-dev.clearconsensus.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consensus_service_cohort_consensus_tab**](ConsensusServiceApi.md#consensus_service_cohort_consensus_tab) | **POST** /api/v1/consensus-result-set-view | 
[**consensus_service_consensus**](ConsensusServiceApi.md#consensus_service_consensus) | **POST** /api/v1/consensus | Consensus return information about consensus according to request. Need to specify consensus run timestamp, asset ID and etc.(See ConsensusRequest definition) Returns ConsensusResponse that contains information about column and rows related to consensus.
[**consensus_service_consensus_active**](ConsensusServiceApi.md#consensus_service_consensus_active) | **POST** /api/v1/operator/consensus/active | 
[**consensus_service_consensus_decision**](ConsensusServiceApi.md#consensus_service_consensus_decision) | **POST** /api/v1/operator/consensus/decision | 
[**consensus_service_consensus_explorer_instrument_details**](ConsensusServiceApi.md#consensus_service_consensus_explorer_instrument_details) | **POST** /api/v1/consensus-explorer/details | 
[**consensus_service_consensus_explorer_ranges**](ConsensusServiceApi.md#consensus_service_consensus_explorer_ranges) | **POST** /api/v1/consensus-explorer/range | 
[**consensus_service_consensus_explorer_table**](ConsensusServiceApi.md#consensus_service_consensus_explorer_table) | **POST** /api/v1/consensus-explorer/table | 
[**consensus_service_consensus_history**](ConsensusServiceApi.md#consensus_service_consensus_history) | **POST** /api/v1/operator/consensus/history | 
[**consensus_service_consensus_outliers**](ConsensusServiceApi.md#consensus_service_consensus_outliers) | **POST** /api/v1/outliers-list | ConsensusOutliers return list of outliers according to specified consensus. Need to identify consensus tun timestamp and etc.(Described in OutliersListRequest) Return ConsensusActiveResponse that contains active consensuses with specified run timestamp.
[**consensus_service_consensus_publish**](ConsensusServiceApi.md#consensus_service_consensus_publish) | **POST** /api/v1/operator/consensus/publish | 
[**consensus_service_consensus_timestamps**](ConsensusServiceApi.md#consensus_service_consensus_timestamps) | **POST** /api/v1/consensus/timestamps | ConsensusTimestamps returns timestamps when it was submitted. Need to specify asset ID and trace name. Returns ConsensusTimestampsResponse that contains all the timestamps related to specified asset ID.
[**consensus_service_consensus_to_publish**](ConsensusServiceApi.md#consensus_service_consensus_to_publish) | **POST** /api/v1/operator/consensus/to-publish | 
[**consensus_service_evaluated_price**](ConsensusServiceApi.md#consensus_service_evaluated_price) | **POST** /api/v1/evaluated-price | 
[**consensus_service_get_consensus_runs**](ConsensusServiceApi.md#consensus_service_get_consensus_runs) | **POST** /api/v1/consensus-runs-view | Get Consensus Run&#39;s consensus result sets
[**consensus_service_submission_evidence_tab**](ConsensusServiceApi.md#consensus_service_submission_evidence_tab) | **POST** /api/v1/consensus-result-set-view/submission-evidence | 


# **consensus_service_cohort_consensus_tab**
> TitaniumConsensusResultSetValuesResponse consensus_service_cohort_consensus_tab(body)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusTabRequest() # TitaniumConsensusTabRequest | 

    try:
        api_response = api_instance.consensus_service_cohort_consensus_tab(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_cohort_consensus_tab: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus**
> TitaniumConsensusResponse consensus_service_consensus(body)

Consensus return information about consensus according to request. Need to specify consensus run timestamp, asset ID and etc.(See ConsensusRequest definition) Returns ConsensusResponse that contains information about column and rows related to consensus.

This is a test of a different commenting type: Below we will be shown a placeholder for the Consensus RPC request. *sample input**  >`{`<br> >`   \"asset_id\": \"238917-2131-341ff\",`<br> >`   \"trace_name\": \"placeholder value\",`<br> >`   \"submitted_date\": \"238472301213\"`<br> >`}`

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusRequest() # TitaniumConsensusRequest | 

    try:
        # Consensus return information about consensus according to request. Need to specify consensus run timestamp, asset ID and etc.(See ConsensusRequest definition) Returns ConsensusResponse that contains information about column and rows related to consensus.
        api_response = api_instance.consensus_service_consensus(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_active**
> TitaniumConsensusActiveResponse consensus_service_consensus_active(body)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusActiveRequest() # TitaniumConsensusActiveRequest | 

    try:
        api_response = api_instance.consensus_service_consensus_active(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_active: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_decision**
> TitaniumMessageResponse consensus_service_consensus_decision(body)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusDecisionRequest() # TitaniumConsensusDecisionRequest | 

    try:
        api_response = api_instance.consensus_service_consensus_decision(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_decision: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_explorer_instrument_details**
> TitaniumConsensusExplorerInstrumentDetailsResponse consensus_service_consensus_explorer_instrument_details()



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    
    try:
        api_response = api_instance.consensus_service_consensus_explorer_instrument_details()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_explorer_instrument_details: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_explorer_ranges**
> TitaniumConsensusExplorerRangeResponse consensus_service_consensus_explorer_ranges()



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    
    try:
        api_response = api_instance.consensus_service_consensus_explorer_ranges()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_explorer_ranges: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_explorer_table**
> TitaniumConsensusExplorerTableResponse consensus_service_consensus_explorer_table()



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    
    try:
        api_response = api_instance.consensus_service_consensus_explorer_table()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_explorer_table: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_history**
> TitaniumConsensusHistoryResponse consensus_service_consensus_history(body)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusHistoryRequest() # TitaniumConsensusHistoryRequest | 

    try:
        api_response = api_instance.consensus_service_consensus_history(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_history: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_outliers**
> TitaniumConsensusActiveResponse consensus_service_consensus_outliers(body)

ConsensusOutliers return list of outliers according to specified consensus. Need to identify consensus tun timestamp and etc.(Described in OutliersListRequest) Return ConsensusActiveResponse that contains active consensuses with specified run timestamp.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumOutliersListRequest() # TitaniumOutliersListRequest | 

    try:
        # ConsensusOutliers return list of outliers according to specified consensus. Need to identify consensus tun timestamp and etc.(Described in OutliersListRequest) Return ConsensusActiveResponse that contains active consensuses with specified run timestamp.
        api_response = api_instance.consensus_service_consensus_outliers(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_outliers: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_publish**
> TitaniumMessageResponse consensus_service_consensus_publish(body)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusPublishRequest() # TitaniumConsensusPublishRequest | 

    try:
        api_response = api_instance.consensus_service_consensus_publish(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_publish: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_timestamps**
> TitaniumConsensusTimestampsResponse consensus_service_consensus_timestamps(body)

ConsensusTimestamps returns timestamps when it was submitted. Need to specify asset ID and trace name. Returns ConsensusTimestampsResponse that contains all the timestamps related to specified asset ID.

This is a test to see how detailed we can make a RPC method's documentation using this commenting type: Below we will be shown sample input for the ConsensusTimestamps endpoint. **sample input**  >`{`<br> >`   \"asset_id\": \"238917-2131-341ff\",`<br> >`   \"trace_name\": \"placeholder value\"`<br> >`}`

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusTimestampsRequest() # TitaniumConsensusTimestampsRequest | 

    try:
        # ConsensusTimestamps returns timestamps when it was submitted. Need to specify asset ID and trace name. Returns ConsensusTimestampsResponse that contains all the timestamps related to specified asset ID.
        api_response = api_instance.consensus_service_consensus_timestamps(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_timestamps: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_consensus_to_publish**
> TitaniumConsensusToPublishResponse consensus_service_consensus_to_publish(body)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusToPublishRequest() # TitaniumConsensusToPublishRequest | 

    try:
        api_response = api_instance.consensus_service_consensus_to_publish(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_consensus_to_publish: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_evaluated_price**
> TitaniumEVPResponse consensus_service_evaluated_price(body)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumEVPRequest() # TitaniumEVPRequest | 

    try:
        api_response = api_instance.consensus_service_evaluated_price(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_evaluated_price: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_get_consensus_runs**
> TitaniumGetConsensusRunsResponse consensus_service_get_consensus_runs(body)

Get Consensus Run's consensus result sets

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumGetConsensusRunsRequest() # TitaniumGetConsensusRunsRequest | 

    try:
        # Get Consensus Run's consensus result sets
        api_response = api_instance.consensus_service_get_consensus_runs(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_get_consensus_runs: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **consensus_service_submission_evidence_tab**
> TitaniumConsensusResultSetValuesResponse consensus_service_submission_evidence_tab(body)



### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://api-dev.clearconsensus.io
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api-dev.clearconsensus.io"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConsensusServiceApi(api_client)
    body = openapi_client.TitaniumConsensusTabRequest() # TitaniumConsensusTabRequest | 

    try:
        api_response = api_instance.consensus_service_submission_evidence_tab(body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConsensusServiceApi->consensus_service_submission_evidence_tab: %s\n" % e)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

