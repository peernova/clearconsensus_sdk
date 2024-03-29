# GroupPolicyServiceApi

All URIs are relative to *http://api-dev.clearconsensus.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**groupPolicyServiceCreate**](GroupPolicyServiceApi.md#groupPolicyServiceCreate) | **POST** /api/v1/user-management/group-policies/create |  |
| [**groupPolicyServiceGetPolicies**](GroupPolicyServiceApi.md#groupPolicyServiceGetPolicies) | **POST** /api/v1/user-management/group-policies/getPolicies |  |


<a name="groupPolicyServiceCreate"></a>
# **groupPolicyServiceCreate**
> ProtoOperationSuccess groupPolicyServiceCreate(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupPolicyServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api-dev.clearconsensus.io");

    GroupPolicyServiceApi apiInstance = new GroupPolicyServiceApi(defaultClient);
    ProtoGroupPolicies body = new ProtoGroupPolicies(); // ProtoGroupPolicies | 
    try {
      ProtoOperationSuccess result = apiInstance.groupPolicyServiceCreate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupPolicyServiceApi#groupPolicyServiceCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProtoGroupPolicies**](ProtoGroupPolicies.md)|  | |

### Return type

[**ProtoOperationSuccess**](ProtoOperationSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a name="groupPolicyServiceGetPolicies"></a>
# **groupPolicyServiceGetPolicies**
> ProtoGroupPoliciesResponse groupPolicyServiceGetPolicies(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupPolicyServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api-dev.clearconsensus.io");

    GroupPolicyServiceApi apiInstance = new GroupPolicyServiceApi(defaultClient);
    ProtoPolicyType body = new ProtoPolicyType(); // ProtoPolicyType | 
    try {
      ProtoGroupPoliciesResponse result = apiInstance.groupPolicyServiceGetPolicies(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupPolicyServiceApi#groupPolicyServiceGetPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProtoPolicyType**](ProtoPolicyType.md)|  | |

### Return type

[**ProtoGroupPoliciesResponse**](ProtoGroupPoliciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

