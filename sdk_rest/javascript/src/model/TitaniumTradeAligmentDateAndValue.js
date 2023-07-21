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
 * The TitaniumTradeAligmentDateAndValue model module.
 * @module model/TitaniumTradeAligmentDateAndValue
 * @version 1.0.0
 */
class TitaniumTradeAligmentDateAndValue {
    /**
     * Constructs a new <code>TitaniumTradeAligmentDateAndValue</code>.
     * @alias module:model/TitaniumTradeAligmentDateAndValue
     */
    constructor() { 
        
        TitaniumTradeAligmentDateAndValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumTradeAligmentDateAndValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumTradeAligmentDateAndValue} obj Optional instance to populate.
     * @return {module:model/TitaniumTradeAligmentDateAndValue} The populated <code>TitaniumTradeAligmentDateAndValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumTradeAligmentDateAndValue();

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('score')) {
                obj['score'] = ApiClient.convertToType(data['score'], Object);
            }
            if (data.hasOwnProperty('scoreStatus')) {
                obj['scoreStatus'] = ApiClient.convertToType(data['scoreStatus'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} date
 */
TitaniumTradeAligmentDateAndValue.prototype['date'] = undefined;

/**
 * @member {Object} score
 */
TitaniumTradeAligmentDateAndValue.prototype['score'] = undefined;

/**
 * @member {String} scoreStatus
 */
TitaniumTradeAligmentDateAndValue.prototype['scoreStatus'] = undefined;






export default TitaniumTradeAligmentDateAndValue;
