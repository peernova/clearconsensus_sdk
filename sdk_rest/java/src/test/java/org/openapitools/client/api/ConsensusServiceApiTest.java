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
import org.openapitools.client.model.TitaniumConsensusActiveResponse;
import org.openapitools.client.model.TitaniumConsensusExplorerInstrumentDetailsResponse;
import org.openapitools.client.model.TitaniumConsensusExplorerRangeResponse;
import org.openapitools.client.model.TitaniumConsensusExplorerTableResponse;
import org.openapitools.client.model.TitaniumConsensusRequest;
import org.openapitools.client.model.TitaniumConsensusResponse;
import org.openapitools.client.model.TitaniumConsensusResultSetValuesRequest;
import org.openapitools.client.model.TitaniumConsensusResultSetValuesResponse;
import org.openapitools.client.model.TitaniumConsensusTimestampsRequest;
import org.openapitools.client.model.TitaniumConsensusTimestampsResponse;
import org.openapitools.client.model.TitaniumEVPRequest;
import org.openapitools.client.model.TitaniumEVPResponse;
import org.openapitools.client.model.TitaniumGetConsensusRunsRequest;
import org.openapitools.client.model.TitaniumGetConsensusRunsResponse;
import org.openapitools.client.model.TitaniumOutliersListRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConsensusServiceApi
 */
@Disabled
public class ConsensusServiceApiTest {

    private final ConsensusServiceApi api = new ConsensusServiceApi();

    /**
     * Consensus return information about consensus according to request. Need to specify consensus run timestamp, asset ID and etc.(See ConsensusRequest definition) Returns ConsensusResponse that contains information about column and rows related to consensus.
     *
     * This is a test of a different commenting type: Below we will be shown a placeholder for the Consensus RPC request. *sample input**  &gt;&#x60;{&#x60;&lt;br&gt; &gt;&#x60;   \&quot;asset_id\&quot;: \&quot;238917-2131-341ff\&quot;,&#x60;&lt;br&gt; &gt;&#x60;   \&quot;trace_name\&quot;: \&quot;placeholder value\&quot;,&#x60;&lt;br&gt; &gt;&#x60;   \&quot;submitted_date\&quot;: \&quot;238472301213\&quot;&#x60;&lt;br&gt; &gt;&#x60;}&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceConsensusTest() throws ApiException {
        TitaniumConsensusRequest body = null;
        TitaniumConsensusResponse response = api.consensusServiceConsensus(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceConsensusExplorerInstrumentDetailsTest() throws ApiException {
        TitaniumConsensusExplorerInstrumentDetailsResponse response = api.consensusServiceConsensusExplorerInstrumentDetails();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceConsensusExplorerRangesTest() throws ApiException {
        TitaniumConsensusExplorerRangeResponse response = api.consensusServiceConsensusExplorerRanges();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceConsensusExplorerTableTest() throws ApiException {
        TitaniumConsensusExplorerTableResponse response = api.consensusServiceConsensusExplorerTable();
        // TODO: test validations
    }

    /**
     * ConsensusOutliers return list of outliers according to specified consensus. Need to identify consensus tun timestamp and etc.(Described in OutliersListRequest) Return ConsensusActiveResponse that contains active consensuses with specified run timestamp.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceConsensusOutliersTest() throws ApiException {
        TitaniumOutliersListRequest body = null;
        TitaniumConsensusActiveResponse response = api.consensusServiceConsensusOutliers(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceConsensusResultSetValuesTest() throws ApiException {
        TitaniumConsensusResultSetValuesRequest body = null;
        TitaniumConsensusResultSetValuesResponse response = api.consensusServiceConsensusResultSetValues(body);
        // TODO: test validations
    }

    /**
     * ConsensusTimestamps returns timestamps when it was submitted. Need to specify asset ID and trace name. Returns ConsensusTimestampsResponse that contains all the timestamps related to specified asset ID.
     *
     * This is a test to see how detailed we can make a RPC method&#39;s documentation using this commenting type: Below we will be shown sample input for the ConsensusTimestamps endpoint. **sample input**  &gt;&#x60;{&#x60;&lt;br&gt; &gt;&#x60;   \&quot;asset_id\&quot;: \&quot;238917-2131-341ff\&quot;,&#x60;&lt;br&gt; &gt;&#x60;   \&quot;trace_name\&quot;: \&quot;placeholder value\&quot;&#x60;&lt;br&gt; &gt;&#x60;}&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceConsensusTimestampsTest() throws ApiException {
        TitaniumConsensusTimestampsRequest body = null;
        TitaniumConsensusTimestampsResponse response = api.consensusServiceConsensusTimestamps(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceEvaluatedPriceTest() throws ApiException {
        TitaniumEVPRequest body = null;
        TitaniumEVPResponse response = api.consensusServiceEvaluatedPrice(body);
        // TODO: test validations
    }

    /**
     * Get Consensus Run&#39;s consensus result sets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consensusServiceGetConsensusRunsTest() throws ApiException {
        TitaniumGetConsensusRunsRequest body = null;
        TitaniumGetConsensusRunsResponse response = api.consensusServiceGetConsensusRuns(body);
        // TODO: test validations
    }

}