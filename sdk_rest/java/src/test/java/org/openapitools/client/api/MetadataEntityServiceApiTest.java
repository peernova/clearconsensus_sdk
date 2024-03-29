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
import org.openapitools.client.model.TitaniumEntityDefinition;
import org.openapitools.client.model.TitaniumEntityIdentifier;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetadataEntityServiceApi
 */
@Disabled
public class MetadataEntityServiceApiTest {

    private final MetadataEntityServiceApi api = new MetadataEntityServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void metadataEntityServiceAddEntityTest() throws ApiException {
        TitaniumEntityDefinition body = null;
        TitaniumAcknowledgeResponse response = api.metadataEntityServiceAddEntity(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void metadataEntityServiceDisableEntityTest() throws ApiException {
        TitaniumEntityIdentifier body = null;
        TitaniumAcknowledgeResponse response = api.metadataEntityServiceDisableEntity(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void metadataEntityServiceEnableEntityTest() throws ApiException {
        TitaniumEntityIdentifier body = null;
        TitaniumAcknowledgeResponse response = api.metadataEntityServiceEnableEntity(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void metadataEntityServiceGetEntityTest() throws ApiException {
        TitaniumEntityIdentifier body = null;
        TitaniumEntityDefinition response = api.metadataEntityServiceGetEntity(body);
        // TODO: test validations
    }

}
