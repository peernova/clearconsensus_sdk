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
import TitaniumDateAndValue from './TitaniumDateAndValue';

/**
 * The TitaniumConsensusDensityScore model module.
 * @module model/TitaniumConsensusDensityScore
 * @version 1.0.0
 */
class TitaniumConsensusDensityScore {
    /**
     * Constructs a new <code>TitaniumConsensusDensityScore</code>.
     * @alias module:model/TitaniumConsensusDensityScore
     */
    constructor() { 
        
        TitaniumConsensusDensityScore.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusDensityScore</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusDensityScore} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusDensityScore} The populated <code>TitaniumConsensusDensityScore</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusDensityScore();

            if (data.hasOwnProperty('bimodalityScore')) {
                obj['bimodalityScore'] = ApiClient.convertToType(data['bimodalityScore'], Object);
            }
            if (data.hasOwnProperty('dispersion')) {
                obj['dispersion'] = ApiClient.convertToType(data['dispersion'], Object);
            }
            if (data.hasOwnProperty('evpAlignmentScore')) {
                obj['evpAlignmentScore'] = ApiClient.convertToType(data['evpAlignmentScore'], Object);
            }
            if (data.hasOwnProperty('history')) {
                obj['history'] = ApiClient.convertToType(data['history'], [TitaniumDateAndValue]);
            }
            if (data.hasOwnProperty('score')) {
                obj['score'] = ApiClient.convertToType(data['score'], Object);
            }
            if (data.hasOwnProperty('tradeAlignmentScore')) {
                obj['tradeAlignmentScore'] = ApiClient.convertToType(data['tradeAlignmentScore'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} bimodalityScore
 */
TitaniumConsensusDensityScore.prototype['bimodalityScore'] = undefined;

/**
 * @member {Object} dispersion
 */
TitaniumConsensusDensityScore.prototype['dispersion'] = undefined;

/**
 * @member {Object} evpAlignmentScore
 */
TitaniumConsensusDensityScore.prototype['evpAlignmentScore'] = undefined;

/**
 * @member {Array.<module:model/TitaniumDateAndValue>} history
 */
TitaniumConsensusDensityScore.prototype['history'] = undefined;

/**
 * @member {Object} score
 */
TitaniumConsensusDensityScore.prototype['score'] = undefined;

/**
 * @member {Object} tradeAlignmentScore
 */
TitaniumConsensusDensityScore.prototype['tradeAlignmentScore'] = undefined;






export default TitaniumConsensusDensityScore;

