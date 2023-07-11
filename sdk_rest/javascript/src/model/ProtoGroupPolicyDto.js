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
 * The ProtoGroupPolicyDto model module.
 * @module model/ProtoGroupPolicyDto
 * @version 1.0.0
 */
class ProtoGroupPolicyDto {
    /**
     * Constructs a new <code>ProtoGroupPolicyDto</code>.
     * @alias module:model/ProtoGroupPolicyDto
     */
    constructor() { 
        
        ProtoGroupPolicyDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProtoGroupPolicyDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProtoGroupPolicyDto} obj Optional instance to populate.
     * @return {module:model/ProtoGroupPolicyDto} The populated <code>ProtoGroupPolicyDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProtoGroupPolicyDto();

            if (data.hasOwnProperty('group')) {
                obj['group'] = ApiClient.convertToType(data['group'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('username')) {
                obj['username'] = ApiClient.convertToType(data['username'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} group
 */
ProtoGroupPolicyDto.prototype['group'] = undefined;

/**
 * @member {String} type
 */
ProtoGroupPolicyDto.prototype['type'] = undefined;

/**
 * @member {String} username
 */
ProtoGroupPolicyDto.prototype['username'] = undefined;






export default ProtoGroupPolicyDto;
