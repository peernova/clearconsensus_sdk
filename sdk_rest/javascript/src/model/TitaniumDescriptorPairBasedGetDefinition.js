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
import TitaniumIdentifier from './TitaniumIdentifier';

/**
 * The TitaniumDescriptorPairBasedGetDefinition model module.
 * @module model/TitaniumDescriptorPairBasedGetDefinition
 * @version 1.0.0
 */
class TitaniumDescriptorPairBasedGetDefinition {
    /**
     * Constructs a new <code>TitaniumDescriptorPairBasedGetDefinition</code>.
     * @alias module:model/TitaniumDescriptorPairBasedGetDefinition
     */
    constructor() { 
        
        TitaniumDescriptorPairBasedGetDefinition.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumDescriptorPairBasedGetDefinition</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumDescriptorPairBasedGetDefinition} obj Optional instance to populate.
     * @return {module:model/TitaniumDescriptorPairBasedGetDefinition} The populated <code>TitaniumDescriptorPairBasedGetDefinition</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumDescriptorPairBasedGetDefinition();

            if (data.hasOwnProperty('destDescriptor')) {
                obj['destDescriptor'] = ApiClient.convertToType(data['destDescriptor'], 'String');
            }
            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = TitaniumIdentifier.constructFromObject(data['identifier']);
            }
            if (data.hasOwnProperty('scope')) {
                obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
            }
            if (data.hasOwnProperty('srcDescriptor')) {
                obj['srcDescriptor'] = ApiClient.convertToType(data['srcDescriptor'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} destDescriptor
 */
TitaniumDescriptorPairBasedGetDefinition.prototype['destDescriptor'] = undefined;

/**
 * @member {module:model/TitaniumIdentifier} identifier
 */
TitaniumDescriptorPairBasedGetDefinition.prototype['identifier'] = undefined;

/**
 * @member {String} scope
 */
TitaniumDescriptorPairBasedGetDefinition.prototype['scope'] = undefined;

/**
 * @member {String} srcDescriptor
 */
TitaniumDescriptorPairBasedGetDefinition.prototype['srcDescriptor'] = undefined;






export default TitaniumDescriptorPairBasedGetDefinition;

