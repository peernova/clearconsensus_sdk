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
import org.openapitools.client.model.TitaniumGenericChartMetadataDataQuality;
import org.openapitools.client.model.TitaniumGenericChartMetadataDataQualityResponse;
import org.openapitools.client.model.TitaniumGetPredefinedFiltersResponse;
import org.openapitools.client.model.TitaniumHistogramResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsControllerApi
 */
@Disabled
public class AnalyticsControllerApiTest {

    private final AnalyticsControllerApi api = new AnalyticsControllerApi();

    /**
     * FindConsensusAnalytics returns analytics related to specific consensus according to request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void analyticsControllerFindConsensusAnalyticsTest() throws ApiException {
        TitaniumGenericChartMetadataDataQuality body = null;
        TitaniumGenericChartMetadataDataQualityResponse response = api.analyticsControllerFindConsensusAnalytics(body);
        // TODO: test validations
    }

    /**
     * FindDataQualityErrors returns data quality errors according to request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void analyticsControllerFindDataQualityErrorsTest() throws ApiException {
        TitaniumGenericChartMetadataDataQuality body = null;
        TitaniumGenericChartMetadataDataQualityResponse response = api.analyticsControllerFindDataQualityErrors(body);
        // TODO: test validations
    }

    /**
     * GetAllConsensusAnalytics returns analytics related to all consensuses.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void analyticsControllerGetAllConsensusAnalyticsTest() throws ApiException {
        TitaniumGenericChartMetadataDataQualityResponse response = api.analyticsControllerGetAllConsensusAnalytics();
        // TODO: test validations
    }

    /**
     * GetAllDataQualityErrors returns all existing data quality errors in the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void analyticsControllerGetAllDataQualityErrorsTest() throws ApiException {
        TitaniumGenericChartMetadataDataQualityResponse response = api.analyticsControllerGetAllDataQualityErrors();
        // TODO: test validations
    }

    /**
     * GetHistogram returns analytics(submission and consensus) represented by histogram according to request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void analyticsControllerGetHistogramTest() throws ApiException {
        TitaniumHistogramResponse response = api.analyticsControllerGetHistogram();
        // TODO: test validations
    }

    /**
     * GetPredefinedFilter returns pre defined filters according to request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void analyticsControllerGetPredefinedFilterTest() throws ApiException {
        TitaniumGetPredefinedFiltersResponse response = api.analyticsControllerGetPredefinedFilter();
        // TODO: test validations
    }

}
