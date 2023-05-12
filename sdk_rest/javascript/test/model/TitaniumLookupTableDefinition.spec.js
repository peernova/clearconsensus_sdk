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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ClearconsensusSdk);
  }
}(this, function(expect, ClearconsensusSdk) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new ClearconsensusSdk.TitaniumLookupTableDefinition();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('TitaniumLookupTableDefinition', function() {
    it('should create an instance of TitaniumLookupTableDefinition', function() {
      // uncomment below and update the code to test TitaniumLookupTableDefinition
      //var instance = new ClearconsensusSdk.TitaniumLookupTableDefinition();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumLookupTableDefinition);
    });

    it('should have the property fields (base name: "fields")', function() {
      // uncomment below and update the code to test the property fields
      //var instance = new ClearconsensusSdk.TitaniumLookupTableDefinition();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new ClearconsensusSdk.TitaniumLookupTableDefinition();
      //expect(instance).to.be();
    });

    it('should have the property rows (base name: "rows")', function() {
      // uncomment below and update the code to test the property rows
      //var instance = new ClearconsensusSdk.TitaniumLookupTableDefinition();
      //expect(instance).to.be();
    });

    it('should have the property totalRecords (base name: "totalRecords")', function() {
      // uncomment below and update the code to test the property totalRecords
      //var instance = new ClearconsensusSdk.TitaniumLookupTableDefinition();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new ClearconsensusSdk.TitaniumLookupTableDefinition();
      //expect(instance).to.be();
    });

  });

}));