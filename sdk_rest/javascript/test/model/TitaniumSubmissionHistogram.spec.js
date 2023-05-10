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
    instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
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

  describe('TitaniumSubmissionHistogram', function() {
    it('should create an instance of TitaniumSubmissionHistogram', function() {
      // uncomment below and update the code to test TitaniumSubmissionHistogram
      //var instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumSubmissionHistogram);
    });

    it('should have the property highSeverity (base name: "highSeverity")', function() {
      // uncomment below and update the code to test the property highSeverity
      //var instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
      //expect(instance).to.be();
    });

    it('should have the property lowSeverity (base name: "lowSeverity")', function() {
      // uncomment below and update the code to test the property lowSeverity
      //var instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
      //expect(instance).to.be();
    });

    it('should have the property mediumSeverity (base name: "mediumSeverity")', function() {
      // uncomment below and update the code to test the property mediumSeverity
      //var instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
      //expect(instance).to.be();
    });

    it('should have the property totalInvalidRows (base name: "totalInvalidRows")', function() {
      // uncomment below and update the code to test the property totalInvalidRows
      //var instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
      //expect(instance).to.be();
    });

    it('should have the property totalParseErrors (base name: "totalParseErrors")', function() {
      // uncomment below and update the code to test the property totalParseErrors
      //var instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
      //expect(instance).to.be();
    });

    it('should have the property totalRows (base name: "totalRows")', function() {
      // uncomment below and update the code to test the property totalRows
      //var instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
      //expect(instance).to.be();
    });

    it('should have the property valid (base name: "valid")', function() {
      // uncomment below and update the code to test the property valid
      //var instance = new ClearconsensusSdk.TitaniumSubmissionHistogram();
      //expect(instance).to.be();
    });

  });

}));
