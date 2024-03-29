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
 * The TitaniumDescriptorBasedIdentifier model module.
 * @module model/TitaniumDescriptorBasedIdentifier
 * @version 1.0.0
 */
class TitaniumDescriptorBasedIdentifier {
    /**
     * Constructs a new <code>TitaniumDescriptorBasedIdentifier</code>.
     * @alias module:model/TitaniumDescriptorBasedIdentifier
     */
    constructor() { 
        
        TitaniumDescriptorBasedIdentifier.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumDescriptorBasedIdentifier</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumDescriptorBasedIdentifier} obj Optional instance to populate.
     * @return {module:model/TitaniumDescriptorBasedIdentifier} The populated <code>TitaniumDescriptorBasedIdentifier</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumDescriptorBasedIdentifier();

            if (data.hasOwnProperty('descriptorName')) {
                obj['descriptorName'] = ApiClient.convertToType(data['descriptorName'], 'String');
            }
            if (data.hasOwnProperty('uid')) {
                obj['uid'] = ApiClient.convertToType(data['uid'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} descriptorName
 */
TitaniumDescriptorBasedIdentifier.prototype['descriptorName'] = undefined;

/**
 * @member {String} uid
 */
TitaniumDescriptorBasedIdentifier.prototype['uid'] = undefined;






export default TitaniumDescriptorBasedIdentifier;

