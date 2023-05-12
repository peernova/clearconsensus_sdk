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
import org.openapitools.client.model.TitaniumChallengeCreateRequest;
import org.openapitools.client.model.TitaniumChallengeCreateResponse;
import org.openapitools.client.model.TitaniumChallengeFormMetaRequest;
import org.openapitools.client.model.TitaniumChallengeFormMetaResponse;
import org.openapitools.client.model.TitaniumChallengeFreezeStatusRequest;
import org.openapitools.client.model.TitaniumGetAttachmentUploadUrlRequest;
import org.openapitools.client.model.TitaniumGetAttachmentUploadUrlResponse;
import org.openapitools.client.model.TitaniumGetChallengeDetailsRequest;
import org.openapitools.client.model.TitaniumGetChallengeDetailsResponse;
import org.openapitools.client.model.TitaniumStatusResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChallengeServiceApi
 */
@Disabled
public class ChallengeServiceApiTest {

    private final ChallengeServiceApi api = new ChallengeServiceApi();

    /**
     * ChallengeCreate creates challenge in the system.(Initiate process by dealer) To create \&quot;challenger\&quot; needs to be authorised and challenge can be created only if one of their own submitted data points has been declared an outlier in the published Consensus. Need to specify asset and fill out evidence information. Returns response that contains ticket ID of the Challenge or the Error.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void challengeServiceChallengeCreateTest() throws ApiException {
        TitaniumChallengeCreateRequest body = null;
        TitaniumChallengeCreateResponse response = api.challengeServiceChallengeCreate(body);
        // TODO: test validations
    }

    /**
     * ChallengeFormMeta is used to request information(template) about the form fields required to submit a challenge for a specific asset and evidence type. Returns response with template with pre-filled data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void challengeServiceChallengeFormMetaTest() throws ApiException {
        TitaniumChallengeFormMetaRequest body = null;
        TitaniumChallengeFormMetaResponse response = api.challengeServiceChallengeFormMeta(body);
        // TODO: test validations
    }

    /**
     * ChallengeFreezeStatus returns StatusResponse that contains string that represents freeze status of challenges if the challenge process is stopped and nothing if the one is not. Challenge can be stopped by operator.Dealer can see the freeze status using this method. Need to specify consensus(where outliers exists) run timestamp.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void challengeServiceChallengeFreezeStatusTest() throws ApiException {
        TitaniumChallengeFreezeStatusRequest body = null;
        TitaniumStatusResponse response = api.challengeServiceChallengeFreezeStatus(body);
        // TODO: test validations
    }

    /**
     * GetChallengeAttachmentUploadUrl returns string that represents s3 URL that can be used to upload attachment for the challenge. The file in attachment can be any file that provides additional information about the disputable outlier. Need to specify asset ID, submitted ID and file name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void challengeServiceGetChallengeAttachmentUploadUrlTest() throws ApiException {
        TitaniumGetAttachmentUploadUrlRequest body = null;
        TitaniumGetAttachmentUploadUrlResponse response = api.challengeServiceGetChallengeAttachmentUploadUrl(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void challengeServiceGetChallengeDetailsTest() throws ApiException {
        TitaniumGetChallengeDetailsRequest body = null;
        TitaniumGetChallengeDetailsResponse response = api.challengeServiceGetChallengeDetails(body);
        // TODO: test validations
    }

}