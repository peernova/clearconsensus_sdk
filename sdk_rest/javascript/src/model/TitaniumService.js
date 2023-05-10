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
import TitaniumSubAsset from './TitaniumSubAsset';

/**
 * The TitaniumService model module.
 * @module model/TitaniumService
 * @version 1.0.0
 */
class TitaniumService {
    /**
     * Constructs a new <code>TitaniumService</code>.
     * @alias module:model/TitaniumService
     */
    constructor() { 
        
        TitaniumService.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumService</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumService} obj Optional instance to populate.
     * @return {module:model/TitaniumService} The populated <code>TitaniumService</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumService();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('subAssets')) {
                obj['subAssets'] = ApiClient.convertToType(data['subAssets'], [TitaniumSubAsset]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
TitaniumService.prototype['name'] = undefined;

/**
 * @member {Array.<module:model/TitaniumSubAsset>} subAssets
 */
TitaniumService.prototype['subAssets'] = undefined;






export default TitaniumService;

