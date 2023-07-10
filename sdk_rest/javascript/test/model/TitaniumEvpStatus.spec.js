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
    instance = new ClearconsensusSdk.TitaniumEvpStatus();
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

  describe('TitaniumEvpStatus', function() {
    it('should create an instance of TitaniumEvpStatus', function() {
      // uncomment below and update the code to test TitaniumEvpStatus
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumEvpStatus);
    });

    it('should have the property added (base name: "added")', function() {
      // uncomment below and update the code to test the property added
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property asset (base name: "asset")', function() {
      // uncomment below and update the code to test the property asset
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property date (base name: "date")', function() {
      // uncomment below and update the code to test the property date
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property dealer (base name: "dealer")', function() {
      // uncomment below and update the code to test the property dealer
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property instrumentType (base name: "instrumentType")', function() {
      // uncomment below and update the code to test the property instrumentType
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property logPath (base name: "logPath")', function() {
      // uncomment below and update the code to test the property logPath
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property s3path (base name: "s3path")', function() {
      // uncomment below and update the code to test the property s3path
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property snapTime (base name: "snapTime")', function() {
      // uncomment below and update the code to test the property snapTime
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

    it('should have the property userEmail (base name: "userEmail")', function() {
      // uncomment below and update the code to test the property userEmail
      //var instance = new ClearconsensusSdk.TitaniumEvpStatus();
      //expect(instance).to.be();
    });

  });

}));
