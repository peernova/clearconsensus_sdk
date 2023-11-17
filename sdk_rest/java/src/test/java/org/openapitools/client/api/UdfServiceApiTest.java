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
import org.openapitools.client.model.TitaniumGetUdfResponse;
import org.openapitools.client.model.TitaniumListRequest;
import org.openapitools.client.model.TitaniumListUdfResponse;
import org.openapitools.client.model.TitaniumMessageResponse;
import org.openapitools.client.model.TitaniumUdfNameRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UdfServiceApi
 */
@Disabled
public class UdfServiceApiTest {

    private final UdfServiceApi api = new UdfServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void udfServiceDisableUdfTest() throws ApiException {
        TitaniumUdfNameRequest body = null;
        TitaniumMessageResponse response = api.udfServiceDisableUdf(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void udfServiceGetUdfDefinitionTest() throws ApiException {
        String name = null;
        String scope = null;
        TitaniumGetUdfResponse response = api.udfServiceGetUdfDefinition(name, scope);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void udfServiceListUdfsTest() throws ApiException {
        TitaniumListRequest body = null;
        TitaniumListUdfResponse response = api.udfServiceListUdfs(body);
        // TODO: test validations
    }

}
