/* Object declaration style 1 */
var Car = function() {
    this.engineWorking = false;
};

Car.prototype.startEngine = function() {
    this.engineWorking = true;
};

Car.prototype.stopEngine = function() {
    this.engineWorking = false;
};

Car.prototype.isEngineWorking = function() {
    return this.engineWorking;
};

/* Objectg declaration style 2 */
var CarStyle2 = function() {
    this.engineWorking = false;
};

CarStyle2.prototype = {
    startEngine: function() {
        this.engineWorking = true;
    },
    stopEngine: function() {
        this.engineWorking = false;
    },
    isEngineWorking: function() {
        return this.engineWorking;
    }
};

/* Object declaration style 3 */
Function.prototype.method = function(name, fn) { 
    this.prototype[name] = fn; 
};

var CarStyle3 = function() {
    this.engineWorking = false;
};

CarStyle3.method('startEngine', function() {
    this.engineWorking = true;
});

CarStyle3.method('stopEngine', function() {
    this.engineWorking = false;
});

CarStyle3.method('isEngineWorking', function() {
    return this.engineWorking;
});
