/**
 * clearconsensus-sdk
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The TitaniumGetWorkflowActionResponse model module.
 * @module model/TitaniumGetWorkflowActionResponse
 * @version 1.0.0
 */
class TitaniumGetWorkflowActionResponse {
    /**
     * Constructs a new <code>TitaniumGetWorkflowActionResponse</code>.
     * @alias module:model/TitaniumGetWorkflowActionResponse
     */
    constructor() { 
        
        TitaniumGetWorkflowActionResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumGetWorkflowActionResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumGetWorkflowActionResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumGetWorkflowActionResponse} The populated <code>TitaniumGetWorkflowActionResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumGetWorkflowActionResponse();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('inputArguments')) {
                obj['inputArguments'] = ApiClient.convertToType(data['inputArguments'], ['String']);
            }
            if (data.hasOwnProperty('outputArgument')) {
                obj['outputArgument'] = ApiClient.convertToType(data['outputArgument'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} description
 */
TitaniumGetWorkflowActionResponse.prototype['description'] = undefined;

/**
 * @member {Array.<String>} inputArguments
 */
TitaniumGetWorkflowActionResponse.prototype['inputArguments'] = undefined;

/**
 * @member {String} outputArgument
 */
TitaniumGetWorkflowActionResponse.prototype['outputArgument'] = undefined;






export default TitaniumGetWorkflowActionResponse;

