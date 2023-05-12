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
    instance = new ClearconsensusSdk.TitaniumExpertiseScore();
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

  describe('TitaniumExpertiseScore', function() {
    it('should create an instance of TitaniumExpertiseScore', function() {
      // uncomment below and update the code to test TitaniumExpertiseScore
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be.a(ClearconsensusSdk.TitaniumExpertiseScore);
    });

    it('should have the property challengeScore (base name: "challengeScore")', function() {
      // uncomment below and update the code to test the property challengeScore
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

    it('should have the property consensusDistanceScore (base name: "consensusDistanceScore")', function() {
      // uncomment below and update the code to test the property consensusDistanceScore
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

    it('should have the property consensusScore (base name: "consensusScore")', function() {
      // uncomment below and update the code to test the property consensusScore
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

    it('should have the property dimensionCreditScore (base name: "dimensionCreditScore")', function() {
      // uncomment below and update the code to test the property dimensionCreditScore
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

    it('should have the property expertiseRank (base name: "expertiseRank")', function() {
      // uncomment below and update the code to test the property expertiseRank
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

    it('should have the property expertsCount (base name: "expertsCount")', function() {
      // uncomment below and update the code to test the property expertsCount
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

    it('should have the property proximityToPostChallengeConsensusMean (base name: "proximityToPostChallengeConsensusMean")', function() {
      // uncomment below and update the code to test the property proximityToPostChallengeConsensusMean
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

    it('should have the property score (base name: "score")', function() {
      // uncomment below and update the code to test the property score
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

    it('should have the property submittedScore (base name: "submittedScore")', function() {
      // uncomment below and update the code to test the property submittedScore
      //var instance = new ClearconsensusSdk.TitaniumExpertiseScore();
      //expect(instance).to.be();
    });

  });

}));