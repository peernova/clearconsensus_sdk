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
    instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
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

  describe('TitaniumCohortConsensusColumn', function() {
    it('should create an instance of TitaniumCohortConsensusColumn', function() {
      // uncomment below and update the code to test TitaniumCohortConsensusColumn
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumCohortConsensusColumn);
    });

    it('should have the property absDiffFromConsensus (base name: "absDiffFromConsensus")', function() {
      // uncomment below and update the code to test the property absDiffFromConsensus
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property cohortConsensusPrice (base name: "cohortConsensusPrice")', function() {
      // uncomment below and update the code to test the property cohortConsensusPrice
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property consAbsDiffFromAnchorEvpMid (base name: "consAbsDiffFromAnchorEvpMid")', function() {
      // uncomment below and update the code to test the property consAbsDiffFromAnchorEvpMid
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property consAbsDiffFromAnchorEvpMidCalc (base name: "consAbsDiffFromAnchorEvpMidCalc")', function() {
      // uncomment below and update the code to test the property consAbsDiffFromAnchorEvpMidCalc
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property consAbsDiffFromAnchorSub (base name: "consAbsDiffFromAnchorSub")', function() {
      // uncomment below and update the code to test the property consAbsDiffFromAnchorSub
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property consAbsDiffFromAnchorTrade (base name: "consAbsDiffFromAnchorTrade")', function() {
      // uncomment below and update the code to test the property consAbsDiffFromAnchorTrade
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property lowerBoundary (base name: "lowerBoundary")', function() {
      // uncomment below and update the code to test the property lowerBoundary
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property numberOfInstruments (base name: "numberOfInstruments")', function() {
      // uncomment below and update the code to test the property numberOfInstruments
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property stdDev (base name: "stdDev")', function() {
      // uncomment below and update the code to test the property stdDev
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property subPriceDiff (base name: "subPriceDiff")', function() {
      // uncomment below and update the code to test the property subPriceDiff
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

    it('should have the property upperBoundary (base name: "upperBoundary")', function() {
      // uncomment below and update the code to test the property upperBoundary
      //var instance = new ClearconsensusSdk.TitaniumCohortConsensusColumn();
      //expect(instance).to.be();
    });

  });

}));