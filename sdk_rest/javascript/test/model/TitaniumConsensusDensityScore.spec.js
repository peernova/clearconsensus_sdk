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
    instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
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

  describe('TitaniumConsensusDensityScore', function() {
    it('should create an instance of TitaniumConsensusDensityScore', function() {
      // uncomment below and update the code to test TitaniumConsensusDensityScore
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumConsensusDensityScore);
    });

    it('should have the property bimodality (base name: "bimodality")', function() {
      // uncomment below and update the code to test the property bimodality
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be();
    });

    it('should have the property challengeQuality (base name: "challengeQuality")', function() {
      // uncomment below and update the code to test the property challengeQuality
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be();
    });

    it('should have the property dispersion (base name: "dispersion")', function() {
      // uncomment below and update the code to test the property dispersion
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be();
    });

    it('should have the property evpAlignmentScore (base name: "evpAlignmentScore")', function() {
      // uncomment below and update the code to test the property evpAlignmentScore
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be();
    });

    it('should have the property evpQuality (base name: "evpQuality")', function() {
      // uncomment below and update the code to test the property evpQuality
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be();
    });

    it('should have the property numberOfParticipants (base name: "numberOfParticipants")', function() {
      // uncomment below and update the code to test the property numberOfParticipants
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be();
    });

    it('should have the property outlierVolume (base name: "outlierVolume")', function() {
      // uncomment below and update the code to test the property outlierVolume
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be();
    });

    it('should have the property score (base name: "score")', function() {
      // uncomment below and update the code to test the property score
      //var instance = new ClearconsensusSdk.TitaniumConsensusDensityScore();
      //expect(instance).to.be();
    });

  });

}));
