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
    instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
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

  describe('TitaniumConsensusResultSetInfo', function() {
    it('should create an instance of TitaniumConsensusResultSetInfo', function() {
      // uncomment below and update the code to test TitaniumConsensusResultSetInfo
      //var instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumConsensusResultSetInfo);
    });

    it('should have the property cohortName (base name: "cohortName")', function() {
      // uncomment below and update the code to test the property cohortName
      //var instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
      //expect(instance).to.be();
    });

    it('should have the property consensusResultSetId (base name: "consensusResultSetId")', function() {
      // uncomment below and update the code to test the property consensusResultSetId
      //var instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
      //expect(instance).to.be();
    });

    it('should have the property consensusRunTimestamp (base name: "consensusRunTimestamp")', function() {
      // uncomment below and update the code to test the property consensusRunTimestamp
      //var instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
      //expect(instance).to.be();
    });

    it('should have the property dataContent (base name: "dataContent")', function() {
      // uncomment below and update the code to test the property dataContent
      //var instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new ClearconsensusSdk.TitaniumConsensusResultSetInfo();
      //expect(instance).to.be();
    });

  });

}));