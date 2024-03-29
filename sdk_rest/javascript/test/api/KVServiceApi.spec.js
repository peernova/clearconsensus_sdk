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
    instance = new ClearconsensusSdk.KVServiceApi();
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

  describe('KVServiceApi', function() {
    describe('kVServiceAddKey', function() {
      it('should call kVServiceAddKey successfully', function(done) {
        //uncomment below and update the code to test kVServiceAddKey
        //instance.kVServiceAddKey(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('kVServiceDeleteKey', function() {
      it('should call kVServiceDeleteKey successfully', function(done) {
        //uncomment below and update the code to test kVServiceDeleteKey
        //instance.kVServiceDeleteKey(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('kVServiceGetKey', function() {
      it('should call kVServiceGetKey successfully', function(done) {
        //uncomment below and update the code to test kVServiceGetKey
        //instance.kVServiceGetKey(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('kVServiceListKeys', function() {
      it('should call kVServiceListKeys successfully', function(done) {
        //uncomment below and update the code to test kVServiceListKeys
        //instance.kVServiceListKeys(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('kVServiceUpdateKey', function() {
      it('should call kVServiceUpdateKey successfully', function(done) {
        //uncomment below and update the code to test kVServiceUpdateKey
        //instance.kVServiceUpdateKey(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
