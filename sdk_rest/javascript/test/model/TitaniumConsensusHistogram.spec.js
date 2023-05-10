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
    instance = new ClearconsensusSdk.TitaniumConsensusHistogram();
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

  describe('TitaniumConsensusHistogram', function() {
    it('should create an instance of TitaniumConsensusHistogram', function() {
      // uncomment below and update the code to test TitaniumConsensusHistogram
      //var instance = new ClearconsensusSdk.TitaniumConsensusHistogram();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumConsensusHistogram);
    });

    it('should have the property highSeverity (base name: "highSeverity")', function() {
      // uncomment below and update the code to test the property highSeverity
      //var instance = new ClearconsensusSdk.TitaniumConsensusHistogram();
      //expect(instance).to.be();
    });

    it('should have the property noConsensus (base name: "noConsensus")', function() {
      // uncomment below and update the code to test the property noConsensus
      //var instance = new ClearconsensusSdk.TitaniumConsensusHistogram();
      //expect(instance).to.be();
    });

    it('should have the property nonOutliers (base name: "nonOutliers")', function() {
      // uncomment below and update the code to test the property nonOutliers
      //var instance = new ClearconsensusSdk.TitaniumConsensusHistogram();
      //expect(instance).to.be();
    });

    it('should have the property outliers (base name: "outliers")', function() {
      // uncomment below and update the code to test the property outliers
      //var instance = new ClearconsensusSdk.TitaniumConsensusHistogram();
      //expect(instance).to.be();
    });

    it('should have the property rows (base name: "rows")', function() {
      // uncomment below and update the code to test the property rows
      //var instance = new ClearconsensusSdk.TitaniumConsensusHistogram();
      //expect(instance).to.be();
    });

    it('should have the property totalParseErrors (base name: "totalParseErrors")', function() {
      // uncomment below and update the code to test the property totalParseErrors
      //var instance = new ClearconsensusSdk.TitaniumConsensusHistogram();
      //expect(instance).to.be();
    });

  });

}));
