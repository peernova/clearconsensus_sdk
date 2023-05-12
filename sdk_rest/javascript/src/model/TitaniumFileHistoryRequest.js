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
 * The TitaniumFileHistoryRequest model module.
 * @module model/TitaniumFileHistoryRequest
 * @version 1.0.0
 */
class TitaniumFileHistoryRequest {
    /**
     * Constructs a new <code>TitaniumFileHistoryRequest</code>.
     * @alias module:model/TitaniumFileHistoryRequest
     */
    constructor() { 
        
        TitaniumFileHistoryRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumFileHistoryRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumFileHistoryRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumFileHistoryRequest} The populated <code>TitaniumFileHistoryRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumFileHistoryRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('client')) {
                obj['client'] = ApiClient.convertToType(data['client'], 'String');
            }
            if (data.hasOwnProperty('fileDate')) {
                obj['fileDate'] = ApiClient.convertToType(data['fileDate'], 'String');
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
TitaniumFileHistoryRequest.prototype['assetId'] = undefined;

/**
 * @member {String} client
 */
TitaniumFileHistoryRequest.prototype['client'] = undefined;

/**
 * @member {String} fileDate
 */
TitaniumFileHistoryRequest.prototype['fileDate'] = undefined;

/**
 * @member {String} filter
 */
TitaniumFileHistoryRequest.prototype['filter'] = undefined;

/**
 * @member {module:model/TitaniumLimit} limit
 */
TitaniumFileHistoryRequest.prototype['limit'] = undefined;

/**
 * @member {Number} offset
 */
TitaniumFileHistoryRequest.prototype['offset'] = undefined;

/**
 * @member {module:model/TitaniumOrderBy} orderBy
 */
TitaniumFileHistoryRequest.prototype['orderBy'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumFileHistoryRequest.prototype['traceName'] = undefined;






export default TitaniumFileHistoryRequest;
