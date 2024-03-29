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
import TitaniumExpertiseScoreWithDate from './TitaniumExpertiseScoreWithDate';

/**
 * The TitaniumExpertiseScore model module.
 * @module model/TitaniumExpertiseScore
 * @version 1.0.0
 */
class TitaniumExpertiseScore {
    /**
     * Constructs a new <code>TitaniumExpertiseScore</code>.
     * @alias module:model/TitaniumExpertiseScore
     */
    constructor() { 
        
        TitaniumExpertiseScore.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumExpertiseScore</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumExpertiseScore} obj Optional instance to populate.
     * @return {module:model/TitaniumExpertiseScore} The populated <code>TitaniumExpertiseScore</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumExpertiseScore();

            if (data.hasOwnProperty('challengeScore')) {
                obj['challengeScore'] = ApiClient.convertToType(data['challengeScore'], Object);
            }
            if (data.hasOwnProperty('consensusDistanceScore')) {
                obj['consensusDistanceScore'] = ApiClient.convertToType(data['consensusDistanceScore'], Object);
            }
            if (data.hasOwnProperty('consensusScore')) {
                obj['consensusScore'] = ApiClient.convertToType(data['consensusScore'], Object);
            }
            if (data.hasOwnProperty('dimensionCreditScore')) {
                obj['dimensionCreditScore'] = ApiClient.convertToType(data['dimensionCreditScore'], Object);
            }
            if (data.hasOwnProperty('expertiseRank')) {
                obj['expertiseRank'] = ApiClient.convertToType(data['expertiseRank'], Object);
            }
            if (data.hasOwnProperty('expertsCount')) {
                obj['expertsCount'] = ApiClient.convertToType(data['expertsCount'], Object);
            }
            if (data.hasOwnProperty('history')) {
                obj['history'] = ApiClient.convertToType(data['history'], [TitaniumExpertiseScoreWithDate]);
            }
            if (data.hasOwnProperty('proximityToPostChallengeConsensusMean')) {
                obj['proximityToPostChallengeConsensusMean'] = ApiClient.convertToType(data['proximityToPostChallengeConsensusMean'], Object);
            }
            if (data.hasOwnProperty('score')) {
                obj['score'] = ApiClient.convertToType(data['score'], Object);
            }
            if (data.hasOwnProperty('submittedScore')) {
                obj['submittedScore'] = ApiClient.convertToType(data['submittedScore'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} challengeScore
 */
TitaniumExpertiseScore.prototype['challengeScore'] = undefined;

/**
 * @member {Object} consensusDistanceScore
 */
TitaniumExpertiseScore.prototype['consensusDistanceScore'] = undefined;

/**
 * @member {Object} consensusScore
 */
TitaniumExpertiseScore.prototype['consensusScore'] = undefined;

/**
 * @member {Object} dimensionCreditScore
 */
TitaniumExpertiseScore.prototype['dimensionCreditScore'] = undefined;

/**
 * @member {Object} expertiseRank
 */
TitaniumExpertiseScore.prototype['expertiseRank'] = undefined;

/**
 * @member {Object} expertsCount
 */
TitaniumExpertiseScore.prototype['expertsCount'] = undefined;

/**
 * @member {Array.<module:model/TitaniumExpertiseScoreWithDate>} history
 */
TitaniumExpertiseScore.prototype['history'] = undefined;

/**
 * @member {Object} proximityToPostChallengeConsensusMean
 */
TitaniumExpertiseScore.prototype['proximityToPostChallengeConsensusMean'] = undefined;

/**
 * @member {Object} score
 */
TitaniumExpertiseScore.prototype['score'] = undefined;

/**
 * @member {Object} submittedScore
 */
TitaniumExpertiseScore.prototype['submittedScore'] = undefined;






export default TitaniumExpertiseScore;

