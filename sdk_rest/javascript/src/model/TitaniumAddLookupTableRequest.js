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
import TitaniumLookupTableDefinition from './TitaniumLookupTableDefinition';

/**
 * The TitaniumAddLookupTableRequest model module.
 * @module model/TitaniumAddLookupTableRequest
 * @version 1.0.0
 */
class TitaniumAddLookupTableRequest {
    /**
     * Constructs a new <code>TitaniumAddLookupTableRequest</code>.
     * @alias module:model/TitaniumAddLookupTableRequest
     */
    constructor() { 
        
        TitaniumAddLookupTableRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumAddLookupTableRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumAddLookupTableRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumAddLookupTableRequest} The populated <code>TitaniumAddLookupTableRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumAddLookupTableRequest();

            if (data.hasOwnProperty('lookuptable')) {
                obj['lookuptable'] = TitaniumLookupTableDefinition.constructFromObject(data['lookuptable']);
            }
            if (data.hasOwnProperty('scope')) {
                obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumLookupTableDefinition} lookuptable
 */
TitaniumAddLookupTableRequest.prototype['lookuptable'] = undefined;

/**
 * @member {String} scope
 */
TitaniumAddLookupTableRequest.prototype['scope'] = undefined;






export default TitaniumAddLookupTableRequest;

