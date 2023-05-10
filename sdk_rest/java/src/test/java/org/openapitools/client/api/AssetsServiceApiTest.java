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
import org.openapitools.client.model.TitaniumAssetsListRequest;
import org.openapitools.client.model.TitaniumAssetsListResponse;
import org.openapitools.client.model.TitaniumAssetsRequest;
import org.openapitools.client.model.TitaniumAssetsResponse;
import org.openapitools.client.model.TitaniumRecentAssetsRequest;
import org.openapitools.client.model.TitaniumRecentAssetsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetsServiceApi
 */
@Disabled
public class AssetsServiceApiTest {

    private final AssetsServiceApi api = new AssetsServiceApi();

    /**
     * Assets returns asset from the system according to request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceAssetsTest() throws ApiException {
        TitaniumAssetsRequest body = null;
        TitaniumAssetsResponse response = api.assetsServiceAssets(body);
        // TODO: test validations
    }

    /**
     * AssetsList return list of assets according to snap time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceAssetsListTest() throws ApiException {
        TitaniumAssetsListRequest body = null;
        TitaniumAssetsListResponse response = api.assetsServiceAssetsList(body);
        // TODO: test validations
    }

    /**
     * RecentAssets returns recent added assets according to request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceRecentAssetsTest() throws ApiException {
        TitaniumRecentAssetsRequest body = null;
        TitaniumRecentAssetsResponse response = api.assetsServiceRecentAssets(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceSupportedAssetsTest() throws ApiException {
        TitaniumAssetsListResponse response = api.assetsServiceSupportedAssets();
        // TODO: test validations
    }

}
