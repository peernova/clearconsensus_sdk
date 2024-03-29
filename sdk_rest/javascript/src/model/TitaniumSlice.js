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
 * The TitaniumSlice model module.
 * @module model/TitaniumSlice
 * @version 1.0.0
 */
class TitaniumSlice {
    /**
     * Constructs a new <code>TitaniumSlice</code>.
     * @alias module:model/TitaniumSlice
     */
    constructor() { 
        
        TitaniumSlice.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSlice</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSlice} obj Optional instance to populate.
     * @return {module:model/TitaniumSlice} The populated <code>TitaniumSlice</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSlice();

            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} total
 */
TitaniumSlice.prototype['total'] = undefined;






export default TitaniumSlice;

