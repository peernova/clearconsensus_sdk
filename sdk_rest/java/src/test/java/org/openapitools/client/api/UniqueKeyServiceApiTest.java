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
import org.openapitools.client.model.TitaniumListUniqueKeysResponse;
import org.openapitools.client.model.TitaniumListVersionResponse;
import org.openapitools.client.model.TitaniumUniqueKeyDefinition;
import org.openapitools.client.model.TitaniumUniqueKeyDefinitionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UniqueKeyServiceApi
 */
@Disabled
public class UniqueKeyServiceApiTest {

    private final UniqueKeyServiceApi api = new UniqueKeyServiceApi();

    /**
     * AddUniqueKey is used to add a new unique key definition to the system.
     *
     * Example of request : {   \&quot;name\&quot;:\&quot;foreign_exchange-vanilla-forwards\&quot;,   \&quot;scope\&quot;:\&quot;global\&quot;,   \&quot;uniqueKey\&quot;:[      \&quot;snap_date\&quot;,      \&quot;asset\&quot;,      \&quot;service\&quot;,      \&quot;client\&quot;,      \&quot;service\&quot;,      \&quot;tenor\&quot;,      \&quot;snap_time\&quot;,      \&quot;instrument_type\&quot;,      \&quot;spot_reference_price\&quot;,      \&quot;mid_fwrd_outright\&quot;,      \&quot;mid_fwrd_points\&quot;,      \&quot;onshore_offshore_curr_1\&quot;,      \&quot;onshore_offshore_curr_2\&quot;   ] }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniqueKeyServiceAddUniqueKeyTest() throws ApiException {
        TitaniumUniqueKeyDefinition body = null;
        TitaniumAcknowledgeResponse response = api.uniqueKeyServiceAddUniqueKey(body);
        // TODO: test validations
    }

    /**
     * GetUniqueKey is used to retrieve a unique key definition by its scope and name. Request: {   \&quot;identifier\&quot;:{      \&quot;name\&quot;:\&quot;foreign_exchange-vanilla-forwards\&quot;   },   \&quot;scope\&quot;:\&quot;global\&quot; }
     *
     * Response: {    \&quot;data\&quot;: {        \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;,        \&quot;scope\&quot;: \&quot;global\&quot;,        \&quot;uniqueKey\&quot;: [            \&quot;snap_date\&quot;,            \&quot;asset\&quot;,            \&quot;service\&quot;,            \&quot;client\&quot;,            \&quot;service\&quot;,            \&quot;tenor\&quot;,            \&quot;snap_time\&quot;,            \&quot;instrument_type\&quot;,            \&quot;spot_reference_price\&quot;,            \&quot;mid_fwrd_outright\&quot;,            \&quot;mid_fwrd_points\&quot;,            \&quot;onshore_offshore_curr_1\&quot;,            \&quot;onshore_offshore_curr_2\&quot;        ],        \&quot;orderBy\&quot;: [            \&quot;__input_row_num\&quot;        ],        \&quot;order\&quot;: \&quot;ASC\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniqueKeyServiceGetUniqueKeyTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumUniqueKeyDefinitionResponse response = api.uniqueKeyServiceGetUniqueKey(body);
        // TODO: test validations
    }

    /**
     * GetUniqueKeyVersion is used to retrieve a specific version of a unique key definition by its scope, name, and version ID. Response: {    \&quot;data\&quot;: {        \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;,        \&quot;scope\&quot;: \&quot;global\&quot;,        \&quot;uniqueKey\&quot;: [            \&quot;asset\&quot;,            \&quot;service\&quot;,            \&quot;sub-asset\&quot;,            \&quot;instrument_type\&quot;,            \&quot;tenor\&quot;,            \&quot;snap_date\&quot;,            \&quot;snap_time\&quot;,            \&quot;curr_1\&quot;,            \&quot;curr_2\&quot;,            \&quot;onshore_offshore_curr_1\&quot;,            \&quot;onshore_offshore_curr_2\&quot;        ],        \&quot;orderBy\&quot;: [            \&quot;__input_row_num\&quot;        ],        \&quot;order\&quot;: \&quot;ASC\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniqueKeyServiceGetUniqueKeyVersionTest() throws ApiException {
        String scope = null;
        String name = null;
        String versionId = null;
        String descriptorName = null;
        TitaniumUniqueKeyDefinitionResponse response = api.uniqueKeyServiceGetUniqueKeyVersion(scope, name, versionId, descriptorName);
        // TODO: test validations
    }

    /**
     * ListUniqueKeyVersions is used to retrieve a list of all versions of a specific unique key definition by its scope and name. Request: {   \&quot;scope\&quot;:\&quot;global\&quot;,   \&quot;identifier\&quot;: {        \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;    } }
     *
     * Response: {    \&quot;data\&quot;: {        \&quot;versions\&quot;: [            {                \&quot;versionId\&quot;:\&quot;0bmhRR-7hISwkb_H2MvIqafpJCAoy3YgEySZjntZF9o&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-08-22 15:23:44.0\&quot;            }        ]    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniqueKeyServiceListUniqueKeyVersionsTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumListVersionResponse response = api.uniqueKeyServiceListUniqueKeyVersions(body);
        // TODO: test validations
    }

    /**
     * ListUniqueKeys is used to retrieve a list of all unique key definitions in the system. Request: {   \&quot;scope\&quot;:\&quot;global\&quot; }
     *
     * Response: {    \&quot;data\&quot;: {        \&quot;results\&quot;: [            {                \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;,                \&quot;scope\&quot;: \&quot;global\&quot;,                \&quot;uniqueKey\&quot;: [                    \&quot;asset\&quot;,                    \&quot;service\&quot;,                    \&quot;sub-asset\&quot;,                    \&quot;instrument_type\&quot;,                    \&quot;tenor\&quot;,                    \&quot;snap_date\&quot;,                    \&quot;snap_time\&quot;,                    \&quot;curr_1\&quot;,                    \&quot;curr_2\&quot;,                    \&quot;onshore_offshore_curr_1\&quot;,                    \&quot;onshore_offshore_curr_2\&quot;                ],                \&quot;orderBy\&quot;: [                    \&quot;__input_row_num\&quot;                ],                \&quot;order\&quot;: \&quot;ASC\&quot;            },            {                \&quot;name\&quot;: \&quot;foreign_exchange-vanilla-options\&quot;,                \&quot;scope\&quot;: \&quot;global\&quot;,                \&quot;uniqueKey\&quot;: [                    \&quot;snap_date\&quot;,                    \&quot;asset\&quot;,                    \&quot;service\&quot;,                    \&quot;snap_time\&quot;,                    \&quot;instrument_type\&quot;,                    \&quot;option_instrument_parameter\&quot;,                    \&quot;exercise_style\&quot;,                    \&quot;option_execution_cut_time\&quot;,                    \&quot;curr_1\&quot;,                    \&quot;curr_2\&quot;,                    \&quot;tenor\&quot;,                    \&quot;delta\&quot;,                    \&quot;vol_format\&quot;,                    \&quot;instrument_convention\&quot;,                    \&quot;delta_convention\&quot;,                    \&quot;premium_currency\&quot;,                    \&quot;settlement_convention\&quot;                ],                \&quot;orderBy\&quot;: [                    \&quot;__input_row_num\&quot;                ],                \&quot;order\&quot;: \&quot;ASC\&quot;            }        ]    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uniqueKeyServiceListUniqueKeysTest() throws ApiException {
        TitaniumListRequest body = null;
        TitaniumListUniqueKeysResponse response = api.uniqueKeyServiceListUniqueKeys(body);
        // TODO: test validations
    }

}
