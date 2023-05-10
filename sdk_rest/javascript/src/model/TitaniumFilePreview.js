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
import TitaniumDescriptorDefinition from './TitaniumDescriptorDefinition';
import TitaniumFileDelimiterSetting from './TitaniumFileDelimiterSetting';

/**
 * The TitaniumFilePreview model module.
 * @module model/TitaniumFilePreview
 * @version 1.0.0
 */
class TitaniumFilePreview {
    /**
     * Constructs a new <code>TitaniumFilePreview</code>.
     * @alias module:model/TitaniumFilePreview
     */
    constructor() { 
        
        TitaniumFilePreview.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumFilePreview</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumFilePreview} obj Optional instance to populate.
     * @return {module:model/TitaniumFilePreview} The populated <code>TitaniumFilePreview</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumFilePreview();

            if (data.hasOwnProperty('delimiterSetting')) {
                obj['delimiterSetting'] = TitaniumFileDelimiterSetting.constructFromObject(data['delimiterSetting']);
            }
            if (data.hasOwnProperty('descriptorDefinition')) {
                obj['descriptorDefinition'] = TitaniumDescriptorDefinition.constructFromObject(data['descriptorDefinition']);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumFileDelimiterSetting} delimiterSetting
 */
TitaniumFilePreview.prototype['delimiterSetting'] = undefined;

/**
 * @member {module:model/TitaniumDescriptorDefinition} descriptorDefinition
 */
TitaniumFilePreview.prototype['descriptorDefinition'] = undefined;

/**
 * @member {Array.<Object>} rows
 */
TitaniumFilePreview.prototype['rows'] = undefined;






export default TitaniumFilePreview;

