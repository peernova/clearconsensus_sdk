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
import GrpcprotoTableColumn from './GrpcprotoTableColumn';
import GrpcprotoTableRow from './GrpcprotoTableRow';

/**
 * The GrpcprotoTable model module.
 * @module model/GrpcprotoTable
 * @version 1.0.0
 */
class GrpcprotoTable {
    /**
     * Constructs a new <code>GrpcprotoTable</code>.
     * @alias module:model/GrpcprotoTable
     */
    constructor() { 
        
        GrpcprotoTable.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GrpcprotoTable</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GrpcprotoTable} obj Optional instance to populate.
     * @return {module:model/GrpcprotoTable} The populated <code>GrpcprotoTable</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GrpcprotoTable();

            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [GrpcprotoTableColumn]);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [GrpcprotoTableRow]);
            }
            if (data.hasOwnProperty('totalRows')) {
                obj['totalRows'] = ApiClient.convertToType(data['totalRows'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/GrpcprotoTableColumn>} columns
 */
GrpcprotoTable.prototype['columns'] = undefined;

/**
 * @member {Array.<module:model/GrpcprotoTableRow>} rows
 */
GrpcprotoTable.prototype['rows'] = undefined;

/**
 * @member {String} totalRows
 */
GrpcprotoTable.prototype['totalRows'] = undefined;






export default GrpcprotoTable;
