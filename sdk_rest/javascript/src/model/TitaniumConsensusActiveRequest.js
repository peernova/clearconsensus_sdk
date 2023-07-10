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
 * The TitaniumConsensusActiveRequest model module.
 * @module model/TitaniumConsensusActiveRequest
 * @version 1.0.0
 */
class TitaniumConsensusActiveRequest {
    /**
     * Constructs a new <code>TitaniumConsensusActiveRequest</code>.
     * @alias module:model/TitaniumConsensusActiveRequest
     */
    constructor() { 
        
        TitaniumConsensusActiveRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusActiveRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusActiveRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusActiveRequest} The populated <code>TitaniumConsensusActiveRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusActiveRequest();

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
        }
        return obj;
    }


}

/**
 * @member {String} filter
 */
TitaniumConsensusActiveRequest.prototype['filter'] = undefined;

/**
 * @member {module:model/TitaniumLimit} limit
 */
TitaniumConsensusActiveRequest.prototype['limit'] = undefined;

/**
 * @member {Number} offset
 */
TitaniumConsensusActiveRequest.prototype['offset'] = undefined;

/**
 * @member {module:model/TitaniumOrderBy} orderBy
 */
TitaniumConsensusActiveRequest.prototype['orderBy'] = undefined;






export default TitaniumConsensusActiveRequest;

