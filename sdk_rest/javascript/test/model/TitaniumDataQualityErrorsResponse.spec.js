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
    instance = new ClearconsensusSdk.TitaniumDataQualityErrorsResponse();
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

  describe('TitaniumDataQualityErrorsResponse', function() {
    it('should create an instance of TitaniumDataQualityErrorsResponse', function() {
      // uncomment below and update the code to test TitaniumDataQualityErrorsResponse
      //var instance = new ClearconsensusSdk.TitaniumDataQualityErrorsResponse();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumDataQualityErrorsResponse);
    });

    it('should have the property dataQualityErrors (base name: "dataQualityErrors")', function() {
      // uncomment below and update the code to test the property dataQualityErrors
      //var instance = new ClearconsensusSdk.TitaniumDataQualityErrorsResponse();
      //expect(instance).to.be();
    });

    it('should have the property submittedData (base name: "submittedData")', function() {
      // uncomment below and update the code to test the property submittedData
      //var instance = new ClearconsensusSdk.TitaniumDataQualityErrorsResponse();
      //expect(instance).to.be();
    });

    it('should have the property totalRows (base name: "totalRows")', function() {
      // uncomment below and update the code to test the property totalRows
      //var instance = new ClearconsensusSdk.TitaniumDataQualityErrorsResponse();
      //expect(instance).to.be();
    });

  });

}));
