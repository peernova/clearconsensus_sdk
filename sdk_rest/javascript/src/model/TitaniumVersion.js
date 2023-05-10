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
 * The TitaniumVersion model module.
 * @module model/TitaniumVersion
 * @version 1.0.0
 */
class TitaniumVersion {
    /**
     * Constructs a new <code>TitaniumVersion</code>.
     * @alias module:model/TitaniumVersion
     */
    constructor() { 
        
        TitaniumVersion.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumVersion</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumVersion} obj Optional instance to populate.
     * @return {module:model/TitaniumVersion} The populated <code>TitaniumVersion</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumVersion();

            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'String');
            }
            if (data.hasOwnProperty('versionId')) {
                obj['versionId'] = ApiClient.convertToType(data['versionId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} createdAt
 */
TitaniumVersion.prototype['createdAt'] = undefined;

/**
 * @member {String} versionId
 */
TitaniumVersion.prototype['versionId'] = undefined;






export default TitaniumVersion;

