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
import TitaniumValuesRow from './TitaniumValuesRow';

/**
 * The TitaniumChallengeConsensusMetadata model module.
 * @module model/TitaniumChallengeConsensusMetadata
 * @version 1.0.0
 */
class TitaniumChallengeConsensusMetadata {
    /**
     * Constructs a new <code>TitaniumChallengeConsensusMetadata</code>.
     * @alias module:model/TitaniumChallengeConsensusMetadata
     */
    constructor() { 
        
        TitaniumChallengeConsensusMetadata.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeConsensusMetadata</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeConsensusMetadata} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeConsensusMetadata} The populated <code>TitaniumChallengeConsensusMetadata</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeConsensusMetadata();

            if (data.hasOwnProperty('challenges')) {
                obj['challenges'] = ApiClient.convertToType(data['challenges'], [TitaniumValuesRow]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TitaniumValuesRow>} challenges
 */
TitaniumChallengeConsensusMetadata.prototype['challenges'] = undefined;






export default TitaniumChallengeConsensusMetadata;
