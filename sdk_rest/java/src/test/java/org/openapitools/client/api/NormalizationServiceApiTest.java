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
import org.openapitools.client.model.TitaniumGetDefinition;
import org.openapitools.client.model.TitaniumListRequest;
import org.openapitools.client.model.TitaniumListRuleResponse;
import org.openapitools.client.model.TitaniumListVersionResponse;
import org.openapitools.client.model.TitaniumNormalizationRuleDefinition;
import org.openapitools.client.model.TitaniumNormalizationRuleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NormalizationServiceApi
 */
@Disabled
public class NormalizationServiceApiTest {

    private final NormalizationServiceApi api = new NormalizationServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void normalizationServiceAddNormalizationRuleTest() throws ApiException {
        TitaniumNormalizationRuleDefinition body = null;
        TitaniumAcknowledgeResponse response = api.normalizationServiceAddNormalizationRule(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void normalizationServiceDisableNormalizationRuleTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumAcknowledgeResponse response = api.normalizationServiceDisableNormalizationRule(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void normalizationServiceEnableNormalizationRuleTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumAcknowledgeResponse response = api.normalizationServiceEnableNormalizationRule(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void normalizationServiceGetNormalizationRuleTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumNormalizationRuleResponse response = api.normalizationServiceGetNormalizationRule(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void normalizationServiceGetNormalizationRuleVersionTest() throws ApiException {
        String descriptorName = null;
        String versionId = null;
        String name = null;
        String scope = null;
        TitaniumNormalizationRuleResponse response = api.normalizationServiceGetNormalizationRuleVersion(descriptorName, versionId, name, scope);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void normalizationServiceListNormalizationRuleVersionsTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumListVersionResponse response = api.normalizationServiceListNormalizationRuleVersions(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void normalizationServiceListNormalizationRulesTest() throws ApiException {
        TitaniumListRequest body = null;
        TitaniumListRuleResponse response = api.normalizationServiceListNormalizationRules(body);
        // TODO: test validations
    }

}
