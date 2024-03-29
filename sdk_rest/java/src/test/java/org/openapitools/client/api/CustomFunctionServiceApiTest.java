/*
 * clearconsensus-sdk
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.RpcStatus;
import org.openapitools.client.model.TitaniumAcknowledgeResponse;
import org.openapitools.client.model.TitaniumCustomFunction;
import org.openapitools.client.model.TitaniumCustomFunctionDefinitionResponse;
import org.openapitools.client.model.TitaniumCustomFunctionGetDefinition;
import org.openapitools.client.model.TitaniumGetDefinition;
import org.openapitools.client.model.TitaniumListCustomFunctionRequest;
import org.openapitools.client.model.TitaniumListCustomFunctionResponse;
import org.openapitools.client.model.TitaniumListVersionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFunctionServiceApi
 */
@Disabled
public class CustomFunctionServiceApiTest {

    private final CustomFunctionServiceApi api = new CustomFunctionServiceApi();

    /**
     * AddCustomFunction allows the user to create a new custom function by sending a CustomFunction message. It returns an AcknowledgeResponse indicating whether the custom function was successfully added or not.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customFunctionServiceAddCustomFunctionTest() throws ApiException {
        TitaniumCustomFunction body = null;
        TitaniumAcknowledgeResponse response = api.customFunctionServiceAddCustomFunction(body);
        // TODO: test validations
    }

    /**
     * GetCustomFunction retrieves the definition of a specific custom function. The custom function is specified in the CustomFunctionGetDefinition message, which includes its ID and scope. The method returns a CustomFunctionDefinitionResponse that contains either the custom function definition or an error.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customFunctionServiceGetCustomFunctionTest() throws ApiException {
        TitaniumCustomFunctionGetDefinition body = null;
        TitaniumCustomFunctionDefinitionResponse response = api.customFunctionServiceGetCustomFunction(body);
        // TODO: test validations
    }

    /**
     * ListCustomFunctionVersions lists all the versions of a specific custom function. The custom function is specified in the GetDefinition message, which includes its ID and scope. The method returns a ListVersionResponse that contains either a list of versions or an error.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customFunctionServiceListCustomFunctionVersionsTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumListVersionResponse response = api.customFunctionServiceListCustomFunctionVersions(body);
        // TODO: test validations
    }

    /**
     * ListCustomFunctions lists all the custom functions that match the specified criteria. The criteria are defined in the ListCustomFunctionRequest message, which includes the descriptor name and the type of the custom function descriptor. The method returns a ListCustomFunctionResponse that contains either a list of custom functions or an error.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void customFunctionServiceListCustomFunctionsTest() throws ApiException {
        TitaniumListCustomFunctionRequest body = null;
        TitaniumListCustomFunctionResponse response = api.customFunctionServiceListCustomFunctions(body);
        // TODO: test validations
    }

}
