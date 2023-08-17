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
 * The TitaniumAnnotation model module.
 * @module model/TitaniumAnnotation
 * @version 1.0.0
 */
class TitaniumAnnotation {
    /**
     * Constructs a new <code>TitaniumAnnotation</code>.
     * @alias module:model/TitaniumAnnotation
     */
    constructor() { 
        
        TitaniumAnnotation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumAnnotation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumAnnotation} obj Optional instance to populate.
     * @return {module:model/TitaniumAnnotation} The populated <code>TitaniumAnnotation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumAnnotation();

            if (data.hasOwnProperty('annotations')) {
                obj['annotations'] = ApiClient.convertToType(data['annotations'], Object);
            }
            if (data.hasOwnProperty('asset')) {
                obj['asset'] = ApiClient.convertToType(data['asset'], 'String');
            }
            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('mode')) {
                obj['mode'] = ApiClient.convertToType(data['mode'], 'String');
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
 * @member {Object} annotations
 */
TitaniumAnnotation.prototype['annotations'] = undefined;

/**
 * @member {String} asset
 */
TitaniumAnnotation.prototype['asset'] = undefined;

/**
 * @member {String} assetId
 */
TitaniumAnnotation.prototype['assetId'] = undefined;

/**
 * @member {String} date
 */
TitaniumAnnotation.prototype['date'] = undefined;

/**
 * @member {String} description
 */
TitaniumAnnotation.prototype['description'] = undefined;

/**
 * @member {String} mode
 */
TitaniumAnnotation.prototype['mode'] = undefined;

/**
 * @member {String} service
 */
TitaniumAnnotation.prototype['service'] = undefined;

/**
 * @member {String} snapTime
 */
TitaniumAnnotation.prototype['snapTime'] = undefined;

/**
 * @member {String} subAsset
 */
TitaniumAnnotation.prototype['subAsset'] = undefined;






export default TitaniumAnnotation;
