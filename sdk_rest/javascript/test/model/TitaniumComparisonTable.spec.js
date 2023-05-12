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
    instance = new ClearconsensusSdk.TitaniumComparisonTable();
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

  describe('TitaniumComparisonTable', function() {
    it('should create an instance of TitaniumComparisonTable', function() {
      // uncomment below and update the code to test TitaniumComparisonTable
      //var instance = new ClearconsensusSdk.TitaniumComparisonTable();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumComparisonTable);
    });

    it('should have the property allParticipantCohortConsensus (base name: "allParticipantCohortConsensus")', function() {
      // uncomment below and update the code to test the property allParticipantCohortConsensus
      //var instance = new ClearconsensusSdk.TitaniumComparisonTable();
      //expect(instance).to.be();
    });

    it('should have the property evaluatedPrice (base name: "evaluatedPrice")', function() {
      // uncomment below and update the code to test the property evaluatedPrice
      //var instance = new ClearconsensusSdk.TitaniumComparisonTable();
      //expect(instance).to.be();
    });

    it('should have the property expertCohortConsensus (base name: "expertCohortConsensus")', function() {
      // uncomment below and update the code to test the property expertCohortConsensus
      //var instance = new ClearconsensusSdk.TitaniumComparisonTable();
      //expect(instance).to.be();
    });

    it('should have the property submission (base name: "submission")', function() {
      // uncomment below and update the code to test the property submission
      //var instance = new ClearconsensusSdk.TitaniumComparisonTable();
      //expect(instance).to.be();
    });

    it('should have the property submissionStatistics (base name: "submissionStatistics")', function() {
      // uncomment below and update the code to test the property submissionStatistics
      //var instance = new ClearconsensusSdk.TitaniumComparisonTable();
      //expect(instance).to.be();
    });

  });

}));