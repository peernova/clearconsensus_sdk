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
import TitaniumFilterPack from './TitaniumFilterPack';
import TitaniumOrderBy from './TitaniumOrderBy';
import TitaniumPage from './TitaniumPage';

/**
 * The TitaniumDQErrorsRequest model module.
 * @module model/TitaniumDQErrorsRequest
 * @version 1.0.0
 */
class TitaniumDQErrorsRequest {
    /**
     * Constructs a new <code>TitaniumDQErrorsRequest</code>.
     * @alias module:model/TitaniumDQErrorsRequest
     */
    constructor() { 
        
        TitaniumDQErrorsRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumDQErrorsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumDQErrorsRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumDQErrorsRequest} The populated <code>TitaniumDQErrorsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumDQErrorsRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = ApiClient.convertToType(data['filter'], 'String');
            }
            if (data.hasOwnProperty('filterPack')) {
                obj['filterPack'] = TitaniumFilterPack.constructFromObject(data['filterPack']);
            }
            if (data.hasOwnProperty('orderBy')) {
                obj['orderBy'] = TitaniumOrderBy.constructFromObject(data['orderBy']);
            }
            if (data.hasOwnProperty('page')) {
                obj['page'] = TitaniumPage.constructFromObject(data['page']);
            }
            if (data.hasOwnProperty('submittedDate')) {
                obj['submittedDate'] = ApiClient.convertToType(data['submittedDate'], 'String');
            }
            if (data.hasOwnProperty('submittedId')) {
                obj['submittedId'] = ApiClient.convertToType(data['submittedId'], 'String');
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
TitaniumDQErrorsRequest.prototype['assetId'] = undefined;

/**
 * @member {String} filter
 */
TitaniumDQErrorsRequest.prototype['filter'] = undefined;

/**
 * @member {module:model/TitaniumFilterPack} filterPack
 */
TitaniumDQErrorsRequest.prototype['filterPack'] = undefined;

/**
 * @member {module:model/TitaniumOrderBy} orderBy
 */
TitaniumDQErrorsRequest.prototype['orderBy'] = undefined;

/**
 * @member {module:model/TitaniumPage} page
 */
TitaniumDQErrorsRequest.prototype['page'] = undefined;

/**
 * @member {String} submittedDate
 */
TitaniumDQErrorsRequest.prototype['submittedDate'] = undefined;

/**
 * @member {String} submittedId
 */
TitaniumDQErrorsRequest.prototype['submittedId'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumDQErrorsRequest.prototype['traceName'] = undefined;






export default TitaniumDQErrorsRequest;

