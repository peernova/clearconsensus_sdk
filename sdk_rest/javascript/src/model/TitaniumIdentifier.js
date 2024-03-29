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
 * The TitaniumIdentifier model module.
 * @module model/TitaniumIdentifier
 * @version 1.0.0
 */
class TitaniumIdentifier {
    /**
     * Constructs a new <code>TitaniumIdentifier</code>.
     * @alias module:model/TitaniumIdentifier
     */
    constructor() { 
        
        TitaniumIdentifier.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumIdentifier</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumIdentifier} obj Optional instance to populate.
     * @return {module:model/TitaniumIdentifier} The populated <code>TitaniumIdentifier</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumIdentifier();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('uid')) {
                obj['uid'] = ApiClient.convertToType(data['uid'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
TitaniumIdentifier.prototype['name'] = undefined;

/**
 * @member {String} uid
 */
TitaniumIdentifier.prototype['uid'] = undefined;






export default TitaniumIdentifier;

