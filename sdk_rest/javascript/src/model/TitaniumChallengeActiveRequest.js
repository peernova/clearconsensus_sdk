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
 * The TitaniumChallengeActiveRequest model module.
 * @module model/TitaniumChallengeActiveRequest
 * @version 1.0.0
 */
class TitaniumChallengeActiveRequest {
    /**
     * Constructs a new <code>TitaniumChallengeActiveRequest</code>.
     * @alias module:model/TitaniumChallengeActiveRequest
     */
    constructor() { 
        
        TitaniumChallengeActiveRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeActiveRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeActiveRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeActiveRequest} The populated <code>TitaniumChallengeActiveRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeActiveRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
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
TitaniumChallengeActiveRequest.prototype['assetId'] = undefined;

/**
 * @member {String} filter
 */
TitaniumChallengeActiveRequest.prototype['filter'] = undefined;

/**
 * @member {module:model/TitaniumLimit} limit
 */
TitaniumChallengeActiveRequest.prototype['limit'] = undefined;

/**
 * @member {Number} offset
 */
TitaniumChallengeActiveRequest.prototype['offset'] = undefined;

/**
 * @member {module:model/TitaniumOrderBy} orderBy
 */
TitaniumChallengeActiveRequest.prototype['orderBy'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumChallengeActiveRequest.prototype['traceName'] = undefined;






export default TitaniumChallengeActiveRequest;

