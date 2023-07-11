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
    instance = new ClearconsensusSdk.ProtoPolicyDto();
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

  describe('ProtoPolicyDto', function() {
    it('should create an instance of ProtoPolicyDto', function() {
      // uncomment below and update the code to test ProtoPolicyDto
      //var instance = new ClearconsensusSdk.ProtoPolicyDto();
      //expect(instance).to.be.a(ClearconsensusSdk.ProtoPolicyDto);
    });

    it('should have the property addon (base name: "addon")', function() {
      // uncomment below and update the code to test the property addon
      //var instance = new ClearconsensusSdk.ProtoPolicyDto();
      //expect(instance).to.be();
    });

    it('should have the property api (base name: "api")', function() {
      // uncomment below and update the code to test the property api
      //var instance = new ClearconsensusSdk.ProtoPolicyDto();
      //expect(instance).to.be();
    });

    it('should have the property apiPermission (base name: "apiPermission")', function() {
      // uncomment below and update the code to test the property apiPermission
      //var instance = new ClearconsensusSdk.ProtoPolicyDto();
      //expect(instance).to.be();
    });

    it('should have the property asset (base name: "asset")', function() {
      // uncomment below and update the code to test the property asset
      //var instance = new ClearconsensusSdk.ProtoPolicyDto();
      //expect(instance).to.be();
    });

    it('should have the property assetPermission (base name: "assetPermission")', function() {
      // uncomment below and update the code to test the property assetPermission
      //var instance = new ClearconsensusSdk.ProtoPolicyDto();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new ClearconsensusSdk.ProtoPolicyDto();
      //expect(instance).to.be();
    });

    it('should have the property username (base name: "username")', function() {
      // uncomment below and update the code to test the property username
      //var instance = new ClearconsensusSdk.ProtoPolicyDto();
      //expect(instance).to.be();
    });

  });

}));