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
import TitaniumFileDelimiterSetting from './TitaniumFileDelimiterSetting';
import TitaniumFileIdentifier from './TitaniumFileIdentifier';

/**
 * The TitaniumSetFileDelimiterRequest model module.
 * @module model/TitaniumSetFileDelimiterRequest
 * @version 1.0.0
 */
class TitaniumSetFileDelimiterRequest {
    /**
     * Constructs a new <code>TitaniumSetFileDelimiterRequest</code>.
     * @alias module:model/TitaniumSetFileDelimiterRequest
     */
    constructor() { 
        
        TitaniumSetFileDelimiterRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSetFileDelimiterRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSetFileDelimiterRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumSetFileDelimiterRequest} The populated <code>TitaniumSetFileDelimiterRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSetFileDelimiterRequest();

            if (data.hasOwnProperty('delimiterSetting')) {
                obj['delimiterSetting'] = TitaniumFileDelimiterSetting.constructFromObject(data['delimiterSetting']);
            }
            if (data.hasOwnProperty('fileIdentifier')) {
                obj['fileIdentifier'] = TitaniumFileIdentifier.constructFromObject(data['fileIdentifier']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumFileDelimiterSetting} delimiterSetting
 */
TitaniumSetFileDelimiterRequest.prototype['delimiterSetting'] = undefined;

/**
 * @member {module:model/TitaniumFileIdentifier} fileIdentifier
 */
TitaniumSetFileDelimiterRequest.prototype['fileIdentifier'] = undefined;






export default TitaniumSetFileDelimiterRequest;

