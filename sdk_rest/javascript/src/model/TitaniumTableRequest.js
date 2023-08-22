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
import TitaniumFilter from './TitaniumFilter';
import TitaniumFilterPack from './TitaniumFilterPack';
import TitaniumOrderBy from './TitaniumOrderBy';
import TitaniumPage from './TitaniumPage';

/**
 * The TitaniumTableRequest model module.
 * @module model/TitaniumTableRequest
 * @version 1.0.0
 */
class TitaniumTableRequest {
    /**
     * Constructs a new <code>TitaniumTableRequest</code>.
     * @alias module:model/TitaniumTableRequest
     */
    constructor() { 
        
        TitaniumTableRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumTableRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumTableRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumTableRequest} The populated <code>TitaniumTableRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumTableRequest();

            if (data.hasOwnProperty('filterPack')) {
                obj['filterPack'] = TitaniumFilterPack.constructFromObject(data['filterPack']);
            }
            if (data.hasOwnProperty('filters')) {
                obj['filters'] = ApiClient.convertToType(data['filters'], [TitaniumFilter]);
            }
            if (data.hasOwnProperty('orderBy')) {
                obj['orderBy'] = TitaniumOrderBy.constructFromObject(data['orderBy']);
            }
            if (data.hasOwnProperty('page')) {
                obj['page'] = TitaniumPage.constructFromObject(data['page']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumFilterPack} filterPack
 */
TitaniumTableRequest.prototype['filterPack'] = undefined;

/**
 * @member {Array.<module:model/TitaniumFilter>} filters
 */
TitaniumTableRequest.prototype['filters'] = undefined;

/**
 * @member {module:model/TitaniumOrderBy} orderBy
 */
TitaniumTableRequest.prototype['orderBy'] = undefined;

/**
 * @member {module:model/TitaniumPage} page
 */
TitaniumTableRequest.prototype['page'] = undefined;






export default TitaniumTableRequest;
