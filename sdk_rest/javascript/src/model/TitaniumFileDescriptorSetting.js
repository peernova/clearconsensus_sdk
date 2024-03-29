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
 * The TitaniumFileDescriptorSetting model module.
 * @module model/TitaniumFileDescriptorSetting
 * @version 1.0.0
 */
class TitaniumFileDescriptorSetting {
    /**
     * Constructs a new <code>TitaniumFileDescriptorSetting</code>.
     * @alias module:model/TitaniumFileDescriptorSetting
     */
    constructor() { 
        
        TitaniumFileDescriptorSetting.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumFileDescriptorSetting</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumFileDescriptorSetting} obj Optional instance to populate.
     * @return {module:model/TitaniumFileDescriptorSetting} The populated <code>TitaniumFileDescriptorSetting</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumFileDescriptorSetting();

            if (data.hasOwnProperty('descriptorName')) {
                obj['descriptorName'] = ApiClient.convertToType(data['descriptorName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} descriptorName
 */
TitaniumFileDescriptorSetting.prototype['descriptorName'] = undefined;






export default TitaniumFileDescriptorSetting;

