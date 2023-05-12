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
import TitaniumRangePoint from './TitaniumRangePoint';

/**
 * The TitaniumRange model module.
 * @module model/TitaniumRange
 * @version 1.0.0
 */
class TitaniumRange {
    /**
     * Constructs a new <code>TitaniumRange</code>.
     * @alias module:model/TitaniumRange
     */
    constructor() { 
        
        TitaniumRange.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumRange</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumRange} obj Optional instance to populate.
     * @return {module:model/TitaniumRange} The populated <code>TitaniumRange</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumRange();

            if (data.hasOwnProperty('max')) {
                obj['max'] = TitaniumRangePoint.constructFromObject(data['max']);
            }
            if (data.hasOwnProperty('min')) {
                obj['min'] = TitaniumRangePoint.constructFromObject(data['min']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumRangePoint} max
 */
TitaniumRange.prototype['max'] = undefined;

/**
 * @member {module:model/TitaniumRangePoint} min
 */
TitaniumRange.prototype['min'] = undefined;






export default TitaniumRange;
