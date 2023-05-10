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
    instance = new ClearconsensusSdk.TitaniumGetChallengeDetailsRequest();
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

  describe('TitaniumGetChallengeDetailsRequest', function() {
    it('should create an instance of TitaniumGetChallengeDetailsRequest', function() {
      // uncomment below and update the code to test TitaniumGetChallengeDetailsRequest
      //var instance = new ClearconsensusSdk.TitaniumGetChallengeDetailsRequest();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumGetChallengeDetailsRequest);
    });

    it('should have the property assetId (base name: "assetId")', function() {
      // uncomment below and update the code to test the property assetId
      //var instance = new ClearconsensusSdk.TitaniumGetChallengeDetailsRequest();
      //expect(instance).to.be();
    });

    it('should have the property consensusRunId (base name: "consensusRunId")', function() {
      // uncomment below and update the code to test the property consensusRunId
      //var instance = new ClearconsensusSdk.TitaniumGetChallengeDetailsRequest();
      //expect(instance).to.be();
    });

    it('should have the property submissionId (base name: "submissionId")', function() {
      // uncomment below and update the code to test the property submissionId
      //var instance = new ClearconsensusSdk.TitaniumGetChallengeDetailsRequest();
      //expect(instance).to.be();
    });

    it('should have the property submittedDate (base name: "submittedDate")', function() {
      // uncomment below and update the code to test the property submittedDate
      //var instance = new ClearconsensusSdk.TitaniumGetChallengeDetailsRequest();
      //expect(instance).to.be();
    });

    it('should have the property traceName (base name: "traceName")', function() {
      // uncomment below and update the code to test the property traceName
      //var instance = new ClearconsensusSdk.TitaniumGetChallengeDetailsRequest();
      //expect(instance).to.be();
    });

  });

}));
