describe("The Car", function() {
    it("engine should be not working when new car", function() {
        var car = new Car();
        expect(car.isEngineWorking()).toBe(false);
    });
    it("engine should be working when start engine", function() {
        var car = new Car();
        car.startEngine();
        expect(car.isEngineWorking()).toBe(true);
    });
    it("engine should be not working when stop engine", function() {
        var car = new Car();
        car.startEngine();
        car.stopEngine();
        expect(car.isEngineWorking()).toBe(false);
    });
});

describe("The Car (style 2)", function() {
    it("engine should be not working when new car", function() {
        var car = new CarStyle2();
        expect(car.isEngineWorking()).toBe(false);
    });
    it("engine should be working when start engine", function() {
        var car = new CarStyle2();
        car.startEngine();
        expect(car.isEngineWorking()).toBe(true);
    });
    it("engine should be not working when stop engine", function() {
        var car = new CarStyle2();
        car.startEngine();
        car.stopEngine();
        expect(car.isEngineWorking()).toBe(false);
    });
});

describe("The Car (style 3)", function() {
    it("engine should be not working when new car", function() {
        var car = new CarStyle3();
        expect(car.isEngineWorking()).toBe(false);
    });
    it("engine should be working when start engine", function() {
        var car = new CarStyle3();
        car.startEngine();
        expect(car.isEngineWorking()).toBe(true);
    });
    it("engine should be not working when stop engine", function() {
        var car = new CarStyle3();
        car.startEngine();
        car.stopEngine();
        expect(car.isEngineWorking()).toBe(false);
    });
});
