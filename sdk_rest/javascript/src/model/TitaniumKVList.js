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
import TitaniumKVListAsset from './TitaniumKVListAsset';

/**
 * The TitaniumKVList model module.
 * @module model/TitaniumKVList
 * @version 1.0.0
 */
class TitaniumKVList {
    /**
     * Constructs a new <code>TitaniumKVList</code>.
     * @alias module:model/TitaniumKVList
     */
    constructor() { 
        
        TitaniumKVList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumKVList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumKVList} obj Optional instance to populate.
     * @return {module:model/TitaniumKVList} The populated <code>TitaniumKVList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumKVList();

            if (data.hasOwnProperty('results')) {
                obj['results'] = ApiClient.convertToType(data['results'], [TitaniumKVListAsset]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TitaniumKVListAsset>} results
 */
TitaniumKVList.prototype['results'] = undefined;






export default TitaniumKVList;

