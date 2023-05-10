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
import TitaniumDescriptorPairBasedIdentifier from './TitaniumDescriptorPairBasedIdentifier';

/**
 * The TitaniumDescriptorPairBasedResultsList model module.
 * @module model/TitaniumDescriptorPairBasedResultsList
 * @version 1.0.0
 */
class TitaniumDescriptorPairBasedResultsList {
    /**
     * Constructs a new <code>TitaniumDescriptorPairBasedResultsList</code>.
     * @alias module:model/TitaniumDescriptorPairBasedResultsList
     */
    constructor() { 
        
        TitaniumDescriptorPairBasedResultsList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumDescriptorPairBasedResultsList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumDescriptorPairBasedResultsList} obj Optional instance to populate.
     * @return {module:model/TitaniumDescriptorPairBasedResultsList} The populated <code>TitaniumDescriptorPairBasedResultsList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumDescriptorPairBasedResultsList();

            if (data.hasOwnProperty('results')) {
                obj['results'] = ApiClient.convertToType(data['results'], [TitaniumDescriptorPairBasedIdentifier]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TitaniumDescriptorPairBasedIdentifier>} results
 */
TitaniumDescriptorPairBasedResultsList.prototype['results'] = undefined;






export default TitaniumDescriptorPairBasedResultsList;

