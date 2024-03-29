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
 * The TitaniumConsensusToPublishRequest model module.
 * @module model/TitaniumConsensusToPublishRequest
 * @version 1.0.0
 */
class TitaniumConsensusToPublishRequest {
    /**
     * Constructs a new <code>TitaniumConsensusToPublishRequest</code>.
     * @alias module:model/TitaniumConsensusToPublishRequest
     */
    constructor() { 
        
        TitaniumConsensusToPublishRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusToPublishRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusToPublishRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusToPublishRequest} The populated <code>TitaniumConsensusToPublishRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusToPublishRequest();

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
TitaniumConsensusToPublishRequest.prototype['filter'] = undefined;

/**
 * @member {module:model/TitaniumLimit} limit
 */
TitaniumConsensusToPublishRequest.prototype['limit'] = undefined;

/**
 * @member {Number} offset
 */
TitaniumConsensusToPublishRequest.prototype['offset'] = undefined;

/**
 * @member {module:model/TitaniumOrderBy} orderBy
 */
TitaniumConsensusToPublishRequest.prototype['orderBy'] = undefined;






export default TitaniumConsensusToPublishRequest;

