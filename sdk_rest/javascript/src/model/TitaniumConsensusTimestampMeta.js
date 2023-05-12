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
 * The TitaniumConsensusTimestampMeta model module.
 * @module model/TitaniumConsensusTimestampMeta
 * @version 1.0.0
 */
class TitaniumConsensusTimestampMeta {
    /**
     * Constructs a new <code>TitaniumConsensusTimestampMeta</code>.
     * @alias module:model/TitaniumConsensusTimestampMeta
     */
    constructor() { 
        
        TitaniumConsensusTimestampMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusTimestampMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusTimestampMeta} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusTimestampMeta} The populated <code>TitaniumConsensusTimestampMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusTimestampMeta();

            if (data.hasOwnProperty('consensusRunTimestamp')) {
                obj['consensusRunTimestamp'] = ApiClient.convertToType(data['consensusRunTimestamp'], 'String');
            }
            if (data.hasOwnProperty('submittedDates')) {
                obj['submittedDates'] = ApiClient.convertToType(data['submittedDates'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} consensusRunTimestamp
 */
TitaniumConsensusTimestampMeta.prototype['consensusRunTimestamp'] = undefined;

/**
 * @member {Array.<String>} submittedDates
 */
TitaniumConsensusTimestampMeta.prototype['submittedDates'] = undefined;






export default TitaniumConsensusTimestampMeta;
