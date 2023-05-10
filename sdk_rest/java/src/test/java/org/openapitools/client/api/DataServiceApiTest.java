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
import org.openapitools.client.model.TitaniumExportRequest;
import org.openapitools.client.model.TitaniumExportResponse;
import org.openapitools.client.model.TitaniumSubmittedRequest;
import org.openapitools.client.model.TitaniumSubmittedResponse;
import org.openapitools.client.model.TitaniumUploadURLRequest;
import org.openapitools.client.model.TitaniumUploadURLResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataServiceApi
 */
@Disabled
public class DataServiceApiTest {

    private final DataServiceApi api = new DataServiceApi();

    /**
     * Export exports data according to the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataServiceExportTest() throws ApiException {
        TitaniumExportRequest body = null;
        TitaniumExportResponse response = api.dataServiceExport(body);
        // TODO: test validations
    }

    /**
     * Submitted returns submitted data based on the request made.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataServiceSubmittedTest() throws ApiException {
        TitaniumSubmittedRequest body = null;
        TitaniumSubmittedResponse response = api.dataServiceSubmitted(body);
        // TODO: test validations
    }

    /**
     * UploadURL returns a pre-signed S3 URL for uploading data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataServiceUploadURLTest() throws ApiException {
        TitaniumUploadURLRequest body = null;
        TitaniumUploadURLResponse response = api.dataServiceUploadURL(body);
        // TODO: test validations
    }

}
