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
 * The ProtoSearchCriteriaOrderBy model module.
 * @module model/ProtoSearchCriteriaOrderBy
 * @version 1.0.0
 */
class ProtoSearchCriteriaOrderBy {
    /**
     * Constructs a new <code>ProtoSearchCriteriaOrderBy</code>.
     * @alias module:model/ProtoSearchCriteriaOrderBy
     */
    constructor() { 
        
        ProtoSearchCriteriaOrderBy.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProtoSearchCriteriaOrderBy</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProtoSearchCriteriaOrderBy} obj Optional instance to populate.
     * @return {module:model/ProtoSearchCriteriaOrderBy} The populated <code>ProtoSearchCriteriaOrderBy</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProtoSearchCriteriaOrderBy();

            if (data.hasOwnProperty('column')) {
                obj['column'] = ApiClient.convertToType(data['column'], 'String');
            }
            if (data.hasOwnProperty('order')) {
                obj['order'] = ApiClient.convertToType(data['order'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} column
 */
ProtoSearchCriteriaOrderBy.prototype['column'] = undefined;

/**
 * @member {String} order
 */
ProtoSearchCriteriaOrderBy.prototype['order'] = undefined;






export default ProtoSearchCriteriaOrderBy;

