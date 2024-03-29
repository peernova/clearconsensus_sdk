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
import TitaniumConsensusExplorerRangeData from './TitaniumConsensusExplorerRangeData';
import TitaniumError from './TitaniumError';

/**
 * The TitaniumConsensusExplorerRangeResponse model module.
 * @module model/TitaniumConsensusExplorerRangeResponse
 * @version 1.0.0
 */
class TitaniumConsensusExplorerRangeResponse {
    /**
     * Constructs a new <code>TitaniumConsensusExplorerRangeResponse</code>.
     * @alias module:model/TitaniumConsensusExplorerRangeResponse
     */
    constructor() { 
        
        TitaniumConsensusExplorerRangeResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusExplorerRangeResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusExplorerRangeResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusExplorerRangeResponse} The populated <code>TitaniumConsensusExplorerRangeResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusExplorerRangeResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumConsensusExplorerRangeData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumConsensusExplorerRangeData} data
 */
TitaniumConsensusExplorerRangeResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumConsensusExplorerRangeResponse.prototype['error'] = undefined;






export default TitaniumConsensusExplorerRangeResponse;

