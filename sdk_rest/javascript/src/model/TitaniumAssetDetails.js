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

/**
 * The TitaniumAssetDetails model module.
 * @module model/TitaniumAssetDetails
 * @version 1.0.0
 */
class TitaniumAssetDetails {
    /**
     * Constructs a new <code>TitaniumAssetDetails</code>.
     * @alias module:model/TitaniumAssetDetails
     */
    constructor() { 
        
        TitaniumAssetDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumAssetDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumAssetDetails} obj Optional instance to populate.
     * @return {module:model/TitaniumAssetDetails} The populated <code>TitaniumAssetDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumAssetDetails();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('service')) {
                obj['service'] = ApiClient.convertToType(data['service'], 'String');
            }
            if (data.hasOwnProperty('snapTime')) {
                obj['snapTime'] = ApiClient.convertToType(data['snapTime'], 'String');
            }
            if (data.hasOwnProperty('subAsset')) {
                obj['subAsset'] = ApiClient.convertToType(data['subAsset'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} assetId
 */
TitaniumAssetDetails.prototype['assetId'] = undefined;

/**
 * @member {String} date
 */
TitaniumAssetDetails.prototype['date'] = undefined;

/**
 * @member {String} name
 */
TitaniumAssetDetails.prototype['name'] = undefined;

/**
 * @member {String} service
 */
TitaniumAssetDetails.prototype['service'] = undefined;

/**
 * @member {String} snapTime
 */
TitaniumAssetDetails.prototype['snapTime'] = undefined;

/**
 * @member {String} subAsset
 */
TitaniumAssetDetails.prototype['subAsset'] = undefined;






export default TitaniumAssetDetails;

