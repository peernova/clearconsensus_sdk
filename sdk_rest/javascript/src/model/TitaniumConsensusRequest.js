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
import TitaniumLimit from './TitaniumLimit';
import TitaniumOrderBy from './TitaniumOrderBy';

/**
 * The TitaniumConsensusRequest model module.
 * @module model/TitaniumConsensusRequest
 * @version 1.0.0
 */
class TitaniumConsensusRequest {
    /**
     * Constructs a new <code>TitaniumConsensusRequest</code>.
     * @alias module:model/TitaniumConsensusRequest
     */
    constructor() { 
        
        TitaniumConsensusRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusRequest} The populated <code>TitaniumConsensusRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('consensusRunTimestamp')) {
                obj['consensusRunTimestamp'] = ApiClient.convertToType(data['consensusRunTimestamp'], 'String');
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = ApiClient.convertToType(data['filter'], 'String');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = TitaniumLimit.constructFromObject(data['limit']);
            }
            if (data.hasOwnProperty('offset')) {
                obj['offset'] = ApiClient.convertToType(data['offset'], 'Number');
            }
            if (data.hasOwnProperty('orderBy')) {
                obj['orderBy'] = TitaniumOrderBy.constructFromObject(data['orderBy']);
            }
            if (data.hasOwnProperty('submittedDate')) {
                obj['submittedDate'] = ApiClient.convertToType(data['submittedDate'], 'String');
            }
            if (data.hasOwnProperty('traceName')) {
                obj['traceName'] = ApiClient.convertToType(data['traceName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} assetId
 */
TitaniumConsensusRequest.prototype['assetId'] = undefined;

/**
 * @member {String} consensusRunTimestamp
 */
TitaniumConsensusRequest.prototype['consensusRunTimestamp'] = undefined;

/**
 * @member {String} filter
 */
TitaniumConsensusRequest.prototype['filter'] = undefined;

/**
 * @member {module:model/TitaniumLimit} limit
 */
TitaniumConsensusRequest.prototype['limit'] = undefined;

/**
 * @member {Number} offset
 */
TitaniumConsensusRequest.prototype['offset'] = undefined;

/**
 * @member {module:model/TitaniumOrderBy} orderBy
 */
TitaniumConsensusRequest.prototype['orderBy'] = undefined;

/**
 * @member {String} submittedDate
 */
TitaniumConsensusRequest.prototype['submittedDate'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumConsensusRequest.prototype['traceName'] = undefined;






export default TitaniumConsensusRequest;

