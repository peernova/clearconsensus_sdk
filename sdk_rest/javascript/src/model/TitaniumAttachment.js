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
 * The TitaniumAttachment model module.
 * @module model/TitaniumAttachment
 * @version 1.0.0
 */
class TitaniumAttachment {
    /**
     * Constructs a new <code>TitaniumAttachment</code>.
     * @alias module:model/TitaniumAttachment
     */
    constructor() { 
        
        TitaniumAttachment.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumAttachment</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumAttachment} obj Optional instance to populate.
     * @return {module:model/TitaniumAttachment} The populated <code>TitaniumAttachment</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumAttachment();

            if (data.hasOwnProperty('attachmentId')) {
                obj['attachmentId'] = ApiClient.convertToType(data['attachmentId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} attachmentId
 */
TitaniumAttachment.prototype['attachmentId'] = undefined;

/**
 * @member {String} name
 */
TitaniumAttachment.prototype['name'] = undefined;

/**
 * @member {String} url
 */
TitaniumAttachment.prototype['url'] = undefined;






export default TitaniumAttachment;

