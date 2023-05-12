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
import org.openapitools.client.model.TitaniumGetGeneratedValidationRuleResponse;
import org.openapitools.client.model.TitaniumGetValidationRuleResponse;
import org.openapitools.client.model.TitaniumListRequest;
import org.openapitools.client.model.TitaniumListRuleResponse;
import org.openapitools.client.model.TitaniumListVersionResponse;
import org.openapitools.client.model.TitaniumMessageResponse;
import org.openapitools.client.model.TitaniumRdlCheckRequest;
import org.openapitools.client.model.TitaniumValidationRuleDefinition;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValidatorServiceApi
 */
@Disabled
public class ValidatorServiceApiTest {

    private final ValidatorServiceApi api = new ValidatorServiceApi();

    /**
     * AddValidationRule is a method used to add a validation rule to the system. Backoffice users can create a new validation ruleset in the &#39;global&#39; scope, for each asset class. Participant users can create a new validation ruleset in its own scope, for each asset class. Backoffice users can represent any participant and create a new validation ruleset in that participant&#39;s scope. The default scope is used if no scope is given in the request (&#39;global&#39; for the operator, participant scope for that participant user). The authorization will be fetched from the user&#39;s token. It will do an update if a validation rule with the same name already exists.
     *
     * Request for backoffice user: { \&quot;definition\&quot;: {   \&quot;descriptor_name\&quot;:\&quot;foreign_exchange-vanilla-options\&quot;,   \&quot;criteria\&quot;:[     {       \&quot;name\&quot;:\&quot;FX-V-FXO: Option Instrument Parameter: Forward Points\&quot;,       \&quot;description\&quot;:\&quot;This criteria element contains validation rules that will be applied to all fx-vanilla-options data submission rows where option_instrument_parameter equals \\\&quot;Forward Points\\\&quot;.\&quot;,       \&quot;tags\&quot;:[         \&quot;forward points\&quot;       ],       \&quot;metadata\&quot;:[        ],       \&quot;rule\&quot;:\&quot;[\\\&quot;foreign_exchange-vanilla-options.option_instrument_parameter\\\&quot;,\\\&quot;$eq_case_insensitive\\\&quot;,\\\&quot;Forward Points\\\&quot;]\&quot;,       \&quot;validations\&quot;:[         {           \&quot;name\&quot;:\&quot;FX-V-FXO: Forward Points: Forward Conversion Factor: Exiting Value Check\&quot;,           \&quot;severity\&quot;:1,           \&quot;rule_type\&quot;:\&quot;input_data\&quot;,           \&quot;tags\&quot;:[            ],           \&quot;description\&quot;:\&quot;Compare the fwrd_conversion_factor for a given underlying against the expected values.\&quot;,           \&quot;rule\&quot;:\&quot;[ { \\\&quot;$lut_name\\\&quot;: \\\&quot;conversion_factor\\\&quot;, \\\&quot;$get\\\&quot;: [ \\\&quot;foreign_exchange-vanilla-options.underlying\\\&quot; ] }, \\\&quot;$eq\\\&quot;, \\\&quot;foreign_exchange-vanilla-options.fwrd_conversion_factor\\\&quot; ]\&quot;,           \&quot;error\&quot;:{             \&quot;message\&quot;:\&quot;[%s] is not a conversion factor used in consensus. Please update the conversion factor for this underlying -- [%s].\&quot;,             \&quot;message_args\&quot;:[               \&quot;foreign_exchange-vanilla-options.fwrd_conversion_factor\&quot;,               \&quot;foreign_exchange-vanilla-options.underlying\&quot;             ]           }         }       ]     }   ] }, \&quot;scope\&quot;: \&quot;global\&quot;, \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-vanilla-options\&quot; }  Response: {    \&quot;data\&quot;: {        \&quot;uid\&quot;: \&quot;ac49453d-cc9c-11ec-8bac-5314d58ea570\&quot;,        \&quot;descriptor_name\&quot;: \&quot;fx_forward\&quot;    } }  Error response:  Push to non ‘global’ scope : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Invalid argument: only support &#39;global&#39; scope\&quot;    } }  Unauthorized user : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Invalid auth token - only operator is allowed to add validation rules\&quot;    } }  Missing argument : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Missing argument: descriptor_name\&quot;    } }  Invalid rule definition - rule col mismatch with descriptor : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Rule [fx_fwd] compile failed, details: Column [submission_clienttt] not found in schema [fx_forward]\&quot;    } }  Invalid rule definition - RDL syntax error : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Rule [fx_fwd] compile failed, details: line 1:14 no viable alternative at input &#39;[{\\\&quot;$lower\\\&quot;:\\\&quot;fx_forward.submission_service\\\&quot;&#39;\&quot;    } }  Dependencies not found - dependencies could be: descriptor, named lut, custom function : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Rule [fx_fwd] compile failed, details: Invalid rule expression [ { \\\&quot;$lut_name\\\&quot; : \\\&quot;tenor\\\&quot;, \\\&quot;$exist\\\&quot; : [\\\&quot;fx_forward.submission_tenor\\\&quot;] } ]\\n\\terr: com.peernova.api.searchmetadata.metadata.exceptions.MetadataNotFoundException: No Look Up Table by name [tenor] found in scope [global]\&quot;    } }  Ruleset with same name already exist : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Validation rule for descriptor [fx_fwd] already exist\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceAddValidationRuleTest() throws ApiException {
        TitaniumValidationRuleDefinition body = null;
        TitaniumAcknowledgeResponse response = api.validatorServiceAddValidationRule(body);
        // TODO: test validations
    }

    /**
     * DisableValidationRule method disables a validation rule in the system. The request includes the descriptor name and scope of the rule. Example of Request: { \&quot;descriptor_name\&quot; : \&quot;foreign_exchange-vanilla-forwards\&quot;, \&quot;scope\&quot;: \&quot;global\&quot; }
     *
     * Example of Response: {    \&quot;data\&quot;: {        \&quot;uid\&quot;: \&quot;\&quot;,        \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceDisableValidationRuleTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumAcknowledgeResponse response = api.validatorServiceDisableValidationRule(body);
        // TODO: test validations
    }

    /**
     * EnableValidationRule method enables a validation rule that has been previously disabled. The request includes the descriptor name and scope of the rule. Example of Request: { \&quot;descriptor_name\&quot; : \&quot;foreign_exchange-vanilla-forwards\&quot;, \&quot;scope\&quot;: \&quot;global\&quot; }
     *
     * Example of Response: {    \&quot;data\&quot;: {        \&quot;uid\&quot;: \&quot;\&quot;,        \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceEnableValidationRuleTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumAcknowledgeResponse response = api.validatorServiceEnableValidationRule(body);
        // TODO: test validations
    }

    /**
     * GetGeneratedValidationRule method allows back office users to view all generated validation rulesets, including Java rulesets. Participant users can only view global generated validation rulesets and rulesets within their own scope. If no scope is given in the request, the default scope is used (\&quot;global\&quot; for operators and participant scope for the participant user). Authorization is fetched from the user&#39;s token. This method returns the latest version of the generated ruleset if multiple versions exist.
     *
     * Example of Request: {  \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot; }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceGetGeneratedValidationRuleTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumGetGeneratedValidationRuleResponse response = api.validatorServiceGetGeneratedValidationRule(body);
        // TODO: test validations
    }

    /**
     * GetGeneratedValidationRuleVersion method allows the user to view a particular version of a generated ruleset. The request requires a descriptor name and a version ID. If the requested ruleset version is not found, an error response is returned.
     *
     * Example of Request: GET /api/v1/validation/rule/generated/version/foreign_exchange-vanilla-forwards /QHF5uuOTjGprb3FRsI7ybBnU6-Ub32Xq8Q399PtQWeQ&#x3D; {  \&quot;scope\&quot;: \&quot;global\&quot; }  Example of Response: {     \&quot;data\&quot;: {          \&quot;versions\&quot;: [              {                 \&quot;versionId\&quot;: \&quot;teTYb9Fs_lIOoPQJukM6dY3aJdiMqT-SdBPdvYfJAjk&#x3D;\&quot;,                 \&quot;createdAt\&quot;: \&quot;2022-05-04 16:20:58.0\&quot;              },              {                  \&quot;versionId\&quot;: \&quot;mwpGZcWNc2zFgweB5rcNmAbcxqekM_zUCdpVrl_V6BM&#x3D;\&quot;,                  \&quot;createdAt\&quot;: \&quot;2022-05-04 16:17:19.0\&quot;              },              {                  \&quot;versionId\&quot;: \&quot;6pfCXN2rFnIAMoDHy7VIFh6HmoyDu3njXkpwzeTp2nc&#x3D;\&quot;,                  \&quot;createdAt\&quot;: \&quot;2022-05-04 15:02:00.0\&quot;              }          ]      }  }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceGetGeneratedValidationRuleVersionTest() throws ApiException {
        String descriptorName = null;
        String versionId = null;
        String name = null;
        String scope = null;
        TitaniumGetGeneratedValidationRuleResponse response = api.validatorServiceGetGeneratedValidationRuleVersion(descriptorName, versionId, name, scope);
        // TODO: test validations
    }

    /**
     * GetValidationRule method retrieves information about a validation rule. Both back office users and participant users can view validation rulesets. The default scope is used if no scope is given in the request. Authorization is fetched from the user&#39;s token. The rule can be retrieved by either descriptor name or UID. If multiple versions of the rule exist, this method returns the latest version.
     *
     * Example of Request: {  \&quot;descriptor_name\&quot;: \&quot;fx_fwd\&quot; }   Or: {  \&quot;uid\&quot;: \&quot;ac49453d-cc9c-11ec-8bac-5314d58ea570\&quot; }    Example of Response: {    \&quot;data\&quot;: {        \&quot;uid\&quot;: \&quot;\&quot;,        \&quot;definition\&quot;: {            \&quot;descriptorName\&quot;: \&quot;foreign_exchange-vanilla-options\&quot;,            \&quot;criteria\&quot;: [                {                    \&quot;name\&quot;: \&quot;FX-V-FXO: Option Instrument Parameter: Forward Points\&quot;,                    \&quot;description\&quot;: \&quot;This criteria element contains validation rules that will be applied to all fx-vanilla-options data submission rows where option_instrument_parameter equals \\\&quot;Forward Points\\\&quot;.\&quot;,                    \&quot;rule\&quot;: \&quot;[\\\&quot;foreign_exchange-vanilla-options.option_instrument_parameter\\\&quot;,\\\&quot;$eq_case_insensitive\\\&quot;,\\\&quot;Forward Points\\\&quot;]\&quot;,                    \&quot;tags\&quot;: [                        \&quot;forward points\&quot;                    ],                    \&quot;metadata\&quot;: [],                    \&quot;validations\&quot;: [                        {                            \&quot;name\&quot;: \&quot;FX-V-FXO: Forward Points: Forward Conversion Factor: Exiting Value Check\&quot;,                            \&quot;description\&quot;: \&quot;Compare the fwrd_conversion_factor for a given underlying against the expected values.\&quot;,                            \&quot;rule\&quot;: \&quot;[ { \\\&quot;$lut_name\\\&quot;: \\\&quot;conversion_factor\\\&quot;, \\\&quot;$get\\\&quot;: [ \\\&quot;foreign_exchange-vanilla-options.underlying\\\&quot; ] }, \\\&quot;$eq\\\&quot;, \\\&quot;foreign_exchange-vanilla-options.fwrd_conversion_factor\\\&quot; ]\&quot;,                            \&quot;ruleType\&quot;: \&quot;INPUT_DATA\&quot;,                            \&quot;severity\&quot;: 1,                            \&quot;tags\&quot;: [],                            \&quot;error\&quot;: {                                \&quot;message\&quot;: \&quot;[%s] is not a conversion factor used in consensus. Please update the conversion factor for this underlying -- [%s].\&quot;,                                \&quot;messageArgs\&quot;: [                                    \&quot;foreign_exchange-vanilla-options.fwrd_conversion_factor\&quot;,                                    \&quot;foreign_exchange-vanilla-options.underlying\&quot;                                ]                            },                            \&quot;filter\&quot;: \&quot;\&quot;                        }                    ]                }            ]        },        \&quot;scope\&quot;: \&quot;global\&quot;,        \&quot;descriptorName\&quot;: \&quot;foreign_exchange-vanilla-options\&quot;    } }  Example of Error response:  Missing argument: {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Missing argument: need either descriptor name or uid to get validation rule\&quot;    } }  Resource not found : {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Rule [fx_fwd] not found, details: [fx_fwd] of service [VALIDATIONRULESET] does not exist in namespace [global]\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceGetValidationRuleTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumGetValidationRuleResponse response = api.validatorServiceGetValidationRule(body);
        // TODO: test validations
    }

    /**
     * This is a method that allows both back office users and regular users to retrieve a specific version of a ruleset given the descriptor name and version ID. The ruleset is used for validation purposes and contains criteria and rules for validating data submissions. Back office users can retrieve a particular version of a ruleset from any scope, while participant users can only retrieve a version of a ruleset from either the global scope or their own scope.
     *
     * Example of Request: GET /api/v1/validation/rule/version/fx_fwd_May04/teTYb9Fs_lIOoPQJukM6dY3aJdiMqT-SdBPdvYfJAjk&#x3D;  Example of Response: {    \&quot;data\&quot;: {        \&quot;uid\&quot;: \&quot;\&quot;,        \&quot;definition\&quot;: {            \&quot;descriptorName\&quot;: \&quot;foreign_exchange-vanilla-options\&quot;,            \&quot;criteria\&quot;: [                {                    \&quot;name\&quot;: \&quot;FX-V-FXO: Option Instrument Parameter: Forward Points\&quot;,                    \&quot;description\&quot;: \&quot;This criteria element contains validation rules that will be applied to all fx-vanilla-options data submission rows where option_instrument_parameter equals \\\&quot;Forward Points\\\&quot;.\&quot;,                    \&quot;rule\&quot;: \&quot;[\\\&quot;foreign_exchange-vanilla-options.option_instrument_parameter\\\&quot;,\\\&quot;$eq_case_insensitive\\\&quot;,\\\&quot;Forward Points\\\&quot;]\&quot;,                    \&quot;tags\&quot;: [                        \&quot;forward points\&quot;                    ],                    \&quot;metadata\&quot;: [],                    \&quot;validations\&quot;: [                        {                            \&quot;name\&quot;: \&quot;FX-V-FXO: Forward Points: Forward Conversion Factor: Exiting Value Check\&quot;,                            \&quot;description\&quot;: \&quot;Compare the fwrd_conversion_factor for a given underlying against the expected values.\&quot;,                            \&quot;rule\&quot;: \&quot;[ { \\\&quot;$lut_name\\\&quot;: \\\&quot;conversion_factor\\\&quot;, \\\&quot;$get\\\&quot;: [ \\\&quot;foreign_exchange-vanilla-options.underlying\\\&quot; ] }, \\\&quot;$eq\\\&quot;, \\\&quot;foreign_exchange-vanilla-options.fwrd_conversion_factor\\\&quot; ]\&quot;,                            \&quot;ruleType\&quot;: \&quot;INPUT_DATA\&quot;,                            \&quot;severity\&quot;: 1,                            \&quot;tags\&quot;: [],                            \&quot;error\&quot;: {                                \&quot;message\&quot;: \&quot;[%s] is not a conversion factor used in consensus. Please update the conversion factor for this underlying -- [%s].\&quot;,                                \&quot;messageArgs\&quot;: [                                    \&quot;foreign_exchange-vanilla-options.fwrd_conversion_factor\&quot;,                                    \&quot;foreign_exchange-vanilla-options.underlying\&quot;                                ]                            },                            \&quot;filter\&quot;: \&quot;\&quot;                        }                    ]                }            ]        },        \&quot;scope\&quot;: \&quot;global\&quot;,        \&quot;descriptorName\&quot;: \&quot;foreign_exchange-vanilla-options\&quot;    } }  Example of Error response: Resource not found: {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Failed to get rule [fx_fwd_May04], details: MetaData entity not found: name [fx_fwd_May04] version: [teTYb9Fs_lIOoPQJukM6dY3aJdiMqT-SdBPdvYfJAjk] in namespace: [global]\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceGetValidationRuleVersionTest() throws ApiException {
        String descriptorName = null;
        String versionId = null;
        String name = null;
        String scope = null;
        TitaniumGetValidationRuleResponse response = api.validatorServiceGetValidationRuleVersion(descriptorName, versionId, name, scope);
        // TODO: test validations
    }

    /**
     * ListGeneratedValidationRuleVersions method returns a list of generated ruleset version IDs along with their creation timestamps. The request requires a descriptor name. If the requested ruleset is not found, an error response is returned.
     *
     * Example of Request: {  \&quot;descriptor_name\&quot;: \&quot;fx_fwd\&quot; }   Example of Response: {    \&quot;data\&quot;: {        \&quot;versions\&quot;: [            {                \&quot;versionId\&quot;: \&quot;teTYb9Fs_lIOoPQJukM6dY3aJdiMqT-SdBPdvYfJAjk&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-05-04 16:20:58.0\&quot;            },            {                \&quot;versionId\&quot;: \&quot;mwpGZcWNc2zFgweB5rcNmAbcxqekM_zUCdpVrl_V6BM&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-05-04 16:17:19.0\&quot;            },            {                \&quot;versionId\&quot;: \&quot;6pfCXN2rFnIAMoDHy7VIFh6HmoyDu3njXkpwzeTp2nc&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-05-04 15:02:00.0\&quot;            }        ]    } }  Example of Error response: Resource not found: {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Failed to get rule [fx_fwd] versions, details: Rule [fx_fwd] not found\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceListGeneratedValidationRuleVersionsTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumListVersionResponse response = api.validatorServiceListGeneratedValidationRuleVersions(body);
        // TODO: test validations
    }

    /**
     * ListValidationRuleVersions method is used to retrieve a list of versions for a given validation rule. Both back office users and participant users can retrieve versions of validation rulesets, but the scope will depend on the user. The request must specify the descriptor name for the validation rule. The response will include a list of versions and their created timestamp. If the requested rule is not found, an error response will be returned.
     *
     * Example of Request: {  \&quot;descriptor_name\&quot;: \&quot;fx_fwd\&quot; }  Example of Response: {    \&quot;data\&quot;: {        \&quot;versions\&quot;: [            {                \&quot;versionId\&quot;: \&quot;teTYb9Fs_lIOoPQJukM6dY3aJdiMqT-SdBPdvYfJAjk&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-05-04 16:20:58.0\&quot;            },            {                \&quot;versionId\&quot;: \&quot;mwpGZcWNc2zFgweB5rcNmAbcxqekM_zUCdpVrl_V6BM&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-05-04 16:17:19.0\&quot;            },            {                \&quot;versionId\&quot;: \&quot;6pfCXN2rFnIAMoDHy7VIFh6HmoyDu3njXkpwzeTp2nc&#x3D;\&quot;,                \&quot;createdAt\&quot;: \&quot;2022-05-04 15:02:00.0\&quot;            }        ]    } }  Example of Error response: Resource not found: {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Failed to get rule [fx_fwd] versions, details: Rule [fx_fwd_validation] not found\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceListValidationRuleVersionsTest() throws ApiException {
        TitaniumGetDefinition body = null;
        TitaniumListVersionResponse response = api.validatorServiceListValidationRuleVersions(body);
        // TODO: test validations
    }

    /**
     * ListValidationRules method is used to retrieve a list of validation rule names. Both back office users and participant users can retrieve validation rulesets, but the scope and authorization will depend on the user. The default scope is used if no scope is specified in the request. The request may include an optional filter and orderBy parameter to refine the search results. Pagination is also supported. The response will include a list of rule names matching the filter criteria.
     *
     * Example of Request: {  \&quot;scope\&quot;: \&quot;global\&quot;,  \&quot;filter\&quot;: \&quot;.*exchange.*\&quot;,  \&quot;orderBy\&quot;: {   \&quot;order\&quot;: \&quot;DESC\&quot;  } }  Example of Response: {    \&quot;data\&quot;: {        \&quot;results\&quot;: [            {                \&quot;uid\&quot;: \&quot;\&quot;,                \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-vanilla-options\&quot;            },            {                \&quot;uid\&quot;: \&quot;\&quot;,                \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;            },            {                \&quot;uid\&quot;: \&quot;\&quot;,                \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-exotics-tarfs\&quot;            }        ]    } }  Example of Request with pagination: {  \&quot;scope\&quot;: \&quot;global\&quot;,  \&quot;filter\&quot;: \&quot;.*exchange.*\&quot;,  \&quot;orderBy\&quot;: {   \&quot;order\&quot;: \&quot;DESC\&quot;  },  \&quot;limit\&quot;: {   \&quot;value\&quot;: 2  },  \&quot;offset\&quot;: 1 }  Example of Response: {    \&quot;data\&quot;: {        \&quot;results\&quot;: [            {                \&quot;uid\&quot;: \&quot;\&quot;,                \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-vanilla-forwards\&quot;            },            {                \&quot;uid\&quot;: \&quot;\&quot;,                \&quot;descriptor_name\&quot;: \&quot;foreign_exchange-exotics-tarfs\&quot;            }        ]    } }  Example of Error response: not ‘global’ scope: {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Invalid argument: only support &#39;global&#39; scope\&quot;    } }  Invalid filter/regex: {    \&quot;error\&quot;: {        \&quot;code\&quot;: 70,        \&quot;message\&quot;: \&quot;Failed to list rules: Dangling meta character &#39;*&#39; near index 0\\n*May*\\n^\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceListValidationRulesTest() throws ApiException {
        TitaniumListRequest body = null;
        TitaniumListRuleResponse response = api.validatorServiceListValidationRules(body);
        // TODO: test validations
    }

    /**
     * RdlCheck method checks the syntax of a given RDL (Rule Description Language) expression. It takes a RdlCheckRequest message as input and returns a MessageResponse message.
     *
     * Example of Request: {  \&quot;rdl\&quot;: \&quot;[\\\&quot;a\\\&quot;, \\\&quot;$eq\\\&quot;, \\\&quot;b\\\&quot;\&quot; }  Example of Response: {    \&quot;data\&quot;: {        \&quot;message\&quot;: \&quot;success\&quot;    } }  Example of Error response: Resource not found: {    \&quot;error\&quot;: {        \&quot;code\&quot;: 69,        \&quot;message\&quot;: \&quot;rdl [[\\\&quot;a\\\&quot;, \\\&quot;$eq\\\&quot;, \\\&quot;b\\\&quot;] cannot be parsed. Error: line 1:16 missing &#39;]&#39; at &#39;&lt;EOF&gt;&#39;\&quot;    } }
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validatorServiceRdlCheckTest() throws ApiException {
        TitaniumRdlCheckRequest body = null;
        TitaniumMessageResponse response = api.validatorServiceRdlCheck(body);
        // TODO: test validations
    }

}