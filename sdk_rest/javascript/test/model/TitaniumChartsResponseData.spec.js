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
    instance = new ClearconsensusSdk.TitaniumChartsResponseData();
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

  describe('TitaniumChartsResponseData', function() {
    it('should create an instance of TitaniumChartsResponseData', function() {
      // uncomment below and update the code to test TitaniumChartsResponseData
      //var instance = new ClearconsensusSdk.TitaniumChartsResponseData();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumChartsResponseData);
    });

    it('should have the property benchmark (base name: "benchmark")', function() {
      // uncomment below and update the code to test the property benchmark
      //var instance = new ClearconsensusSdk.TitaniumChartsResponseData();
      //expect(instance).to.be();
    });

    it('should have the property chartSources (base name: "chartSources")', function() {
      // uncomment below and update the code to test the property chartSources
      //var instance = new ClearconsensusSdk.TitaniumChartsResponseData();
      //expect(instance).to.be();
    });

    it('should have the property outliers (base name: "outliers")', function() {
      // uncomment below and update the code to test the property outliers
      //var instance = new ClearconsensusSdk.TitaniumChartsResponseData();
      //expect(instance).to.be();
    });

    it('should have the property tenors (base name: "tenors")', function() {
      // uncomment below and update the code to test the property tenors
      //var instance = new ClearconsensusSdk.TitaniumChartsResponseData();
      //expect(instance).to.be();
    });

  });

}));