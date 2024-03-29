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
    instance = new ClearconsensusSdk.TitaniumTradeAnchorDetails();
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

  describe('TitaniumTradeAnchorDetails', function() {
    it('should create an instance of TitaniumTradeAnchorDetails', function() {
      // uncomment below and update the code to test TitaniumTradeAnchorDetails
      //var instance = new ClearconsensusSdk.TitaniumTradeAnchorDetails();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumTradeAnchorDetails);
    });

    it('should have the property distanceToConsensus (base name: "distanceToConsensus")', function() {
      // uncomment below and update the code to test the property distanceToConsensus
      //var instance = new ClearconsensusSdk.TitaniumTradeAnchorDetails();
      //expect(instance).to.be();
    });

    it('should have the property latestTradePrice (base name: "latestTradePrice")', function() {
      // uncomment below and update the code to test the property latestTradePrice
      //var instance = new ClearconsensusSdk.TitaniumTradeAnchorDetails();
      //expect(instance).to.be();
    });

    it('should have the property notional (base name: "notional")', function() {
      // uncomment below and update the code to test the property notional
      //var instance = new ClearconsensusSdk.TitaniumTradeAnchorDetails();
      //expect(instance).to.be();
    });

    it('should have the property pricingAge (base name: "pricingAge")', function() {
      // uncomment below and update the code to test the property pricingAge
      //var instance = new ClearconsensusSdk.TitaniumTradeAnchorDetails();
      //expect(instance).to.be();
    });

    it('should have the property source (base name: "source")', function() {
      // uncomment below and update the code to test the property source
      //var instance = new ClearconsensusSdk.TitaniumTradeAnchorDetails();
      //expect(instance).to.be();
    });

    it('should have the property tradeExecutionTime (base name: "tradeExecutionTime")', function() {
      // uncomment below and update the code to test the property tradeExecutionTime
      //var instance = new ClearconsensusSdk.TitaniumTradeAnchorDetails();
      //expect(instance).to.be();
    });

  });

}));
