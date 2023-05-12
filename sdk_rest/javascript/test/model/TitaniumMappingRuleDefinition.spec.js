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
    instance = new ClearconsensusSdk.TitaniumMappingRuleDefinition();
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

  describe('TitaniumMappingRuleDefinition', function() {
    it('should create an instance of TitaniumMappingRuleDefinition', function() {
      // uncomment below and update the code to test TitaniumMappingRuleDefinition
      //var instance = new ClearconsensusSdk.TitaniumMappingRuleDefinition();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumMappingRuleDefinition);
    });

    it('should have the property destDescriptor (base name: "destDescriptor")', function() {
      // uncomment below and update the code to test the property destDescriptor
      //var instance = new ClearconsensusSdk.TitaniumMappingRuleDefinition();
      //expect(instance).to.be();
    });

    it('should have the property scope (base name: "scope")', function() {
      // uncomment below and update the code to test the property scope
      //var instance = new ClearconsensusSdk.TitaniumMappingRuleDefinition();
      //expect(instance).to.be();
    });

    it('should have the property srcDescriptor (base name: "srcDescriptor")', function() {
      // uncomment below and update the code to test the property srcDescriptor
      //var instance = new ClearconsensusSdk.TitaniumMappingRuleDefinition();
      //expect(instance).to.be();
    });

    it('should have the property transformations (base name: "transformations")', function() {
      // uncomment below and update the code to test the property transformations
      //var instance = new ClearconsensusSdk.TitaniumMappingRuleDefinition();
      //expect(instance).to.be();
    });

    it('should have the property uid (base name: "uid")', function() {
      // uncomment below and update the code to test the property uid
      //var instance = new ClearconsensusSdk.TitaniumMappingRuleDefinition();
      //expect(instance).to.be();
    });

  });

}));