/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    var toBe = function(num){
        if(val === num){
            return true;
        }else {
            throw "Not Equal";
        }
    }

    var notToBe = function(num){
        if(val !== num){
            return true;
        }else {
            throw "Equal";
        }
    }

    return {toBe, notToBe};
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */