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
 * The TitaniumSubmissionEvidenceAnchorDetails model module.
 * @module model/TitaniumSubmissionEvidenceAnchorDetails
 * @version 1.0.0
 */
class TitaniumSubmissionEvidenceAnchorDetails {
    /**
     * Constructs a new <code>TitaniumSubmissionEvidenceAnchorDetails</code>.
     * @alias module:model/TitaniumSubmissionEvidenceAnchorDetails
     */
    constructor() { 
        
        TitaniumSubmissionEvidenceAnchorDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSubmissionEvidenceAnchorDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSubmissionEvidenceAnchorDetails} obj Optional instance to populate.
     * @return {module:model/TitaniumSubmissionEvidenceAnchorDetails} The populated <code>TitaniumSubmissionEvidenceAnchorDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSubmissionEvidenceAnchorDetails();

            if (data.hasOwnProperty('distanceToConsensus')) {
                obj['distanceToConsensus'] = ApiClient.convertToType(data['distanceToConsensus'], 'Number');
            }
            if (data.hasOwnProperty('submissionEvidence')) {
                obj['submissionEvidence'] = ApiClient.convertToType(data['submissionEvidence'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} distanceToConsensus
 */
TitaniumSubmissionEvidenceAnchorDetails.prototype['distanceToConsensus'] = undefined;

/**
 * @member {Number} submissionEvidence
 */
TitaniumSubmissionEvidenceAnchorDetails.prototype['submissionEvidence'] = undefined;






export default TitaniumSubmissionEvidenceAnchorDetails;

