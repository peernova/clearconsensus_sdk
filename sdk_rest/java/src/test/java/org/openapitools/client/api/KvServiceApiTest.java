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
import org.openapitools.client.model.TitaniumGetKVResponse;
import org.openapitools.client.model.TitaniumKVAsset;
import org.openapitools.client.model.TitaniumKVOperationResponse;
import org.openapitools.client.model.TitaniumKVRequest;
import org.openapitools.client.model.TitaniumListKVRequest;
import org.openapitools.client.model.TitaniumListKVResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KvServiceApi
 */
@Disabled
public class KvServiceApiTest {

    private final KvServiceApi api = new KvServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kVServiceAddKeyTest() throws ApiException {
        TitaniumKVAsset body = null;
        TitaniumKVOperationResponse response = api.kVServiceAddKey(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kVServiceDeleteKeyTest() throws ApiException {
        TitaniumKVRequest body = null;
        TitaniumKVOperationResponse response = api.kVServiceDeleteKey(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kVServiceGetKeyTest() throws ApiException {
        TitaniumKVRequest body = null;
        TitaniumGetKVResponse response = api.kVServiceGetKey(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kVServiceListKeysTest() throws ApiException {
        TitaniumListKVRequest body = null;
        TitaniumListKVResponse response = api.kVServiceListKeys(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kVServiceUpdateKeyTest() throws ApiException {
        TitaniumKVAsset body = null;
        TitaniumKVOperationResponse response = api.kVServiceUpdateKey(body);
        // TODO: test validations
    }

}
