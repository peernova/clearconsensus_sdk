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
 * The TitaniumSubmissionExplorerTableColumn model module.
 * @module model/TitaniumSubmissionExplorerTableColumn
 * @version 1.0.0
 */
class TitaniumSubmissionExplorerTableColumn {
    /**
     * Constructs a new <code>TitaniumSubmissionExplorerTableColumn</code>.
     * @alias module:model/TitaniumSubmissionExplorerTableColumn
     */
    constructor() { 
        
        TitaniumSubmissionExplorerTableColumn.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSubmissionExplorerTableColumn</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSubmissionExplorerTableColumn} obj Optional instance to populate.
     * @return {module:model/TitaniumSubmissionExplorerTableColumn} The populated <code>TitaniumSubmissionExplorerTableColumn</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSubmissionExplorerTableColumn();

            if (data.hasOwnProperty('submissionPrice')) {
                obj['submissionPrice'] = ApiClient.convertToType(data['submissionPrice'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} submissionPrice
 */
TitaniumSubmissionExplorerTableColumn.prototype['submissionPrice'] = undefined;






export default TitaniumSubmissionExplorerTableColumn;

