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
    instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
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

  describe('TitaniumPopUpViewResponseData', function() {
    it('should create an instance of TitaniumPopUpViewResponseData', function() {
      // uncomment below and update the code to test TitaniumPopUpViewResponseData
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumPopUpViewResponseData);
    });

    it('should have the property benchmark (base name: "benchmark")', function() {
      // uncomment below and update the code to test the property benchmark
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property consensus (base name: "consensus")', function() {
      // uncomment below and update the code to test the property consensus
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property consensusDetails (base name: "consensusDetails")', function() {
      // uncomment below and update the code to test the property consensusDetails
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property dataQualityErrors (base name: "dataQualityErrors")', function() {
      // uncomment below and update the code to test the property dataQualityErrors
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property evaluatedPrice (base name: "evaluatedPrice")', function() {
      // uncomment below and update the code to test the property evaluatedPrice
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property groupingKeys (base name: "groupingKeys")', function() {
      // uncomment below and update the code to test the property groupingKeys
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property outlier (base name: "outlier")', function() {
      // uncomment below and update the code to test the property outlier
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property rangesChart (base name: "rangesChart")', function() {
      // uncomment below and update the code to test the property rangesChart
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property submission (base name: "submission")', function() {
      // uncomment below and update the code to test the property submission
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

    it('should have the property validationErrors (base name: "validationErrors")', function() {
      // uncomment below and update the code to test the property validationErrors
      //var instance = new ClearconsensusSdk.TitaniumPopUpViewResponseData();
      //expect(instance).to.be();
    });

  });

}));
