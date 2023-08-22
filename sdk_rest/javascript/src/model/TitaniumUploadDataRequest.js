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
import TitaniumAssetDetails from './TitaniumAssetDetails';

/**
 * The TitaniumUploadDataRequest model module.
 * @module model/TitaniumUploadDataRequest
 * @version 1.0.0
 */
class TitaniumUploadDataRequest {
    /**
     * Constructs a new <code>TitaniumUploadDataRequest</code>.
     * @alias module:model/TitaniumUploadDataRequest
     */
    constructor() { 
        
        TitaniumUploadDataRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumUploadDataRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumUploadDataRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumUploadDataRequest} The populated <code>TitaniumUploadDataRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumUploadDataRequest();

            if (data.hasOwnProperty('annotation')) {
                obj['annotation'] = ApiClient.convertToType(data['annotation'], Object);
            }
            if (data.hasOwnProperty('asset')) {
                obj['asset'] = TitaniumAssetDetails.constructFromObject(data['asset']);
            }
            if (data.hasOwnProperty('client')) {
                obj['client'] = ApiClient.convertToType(data['client'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('mode')) {
                obj['mode'] = ApiClient.convertToType(data['mode'], 'String');
            }
            if (data.hasOwnProperty('protocol')) {
                obj['protocol'] = ApiClient.convertToType(data['protocol'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Object} annotation
 */
TitaniumUploadDataRequest.prototype['annotation'] = undefined;

/**
 * @member {module:model/TitaniumAssetDetails} asset
 */
TitaniumUploadDataRequest.prototype['asset'] = undefined;

/**
 * @member {String} client
 */
TitaniumUploadDataRequest.prototype['client'] = undefined;

/**
 * @member {String} description
 */
TitaniumUploadDataRequest.prototype['description'] = undefined;

/**
 * @member {String} fileName
 */
TitaniumUploadDataRequest.prototype['fileName'] = undefined;

/**
 * @member {String} mode
 */
TitaniumUploadDataRequest.prototype['mode'] = undefined;

/**
 * @member {String} protocol
 */
TitaniumUploadDataRequest.prototype['protocol'] = undefined;






export default TitaniumUploadDataRequest;

