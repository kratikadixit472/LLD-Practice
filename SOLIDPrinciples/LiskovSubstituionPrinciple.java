package SOLIDPrinciples;

public class LiskovSubstituionPrinciple {
    public void startEngine() {

    }
}

class Car extends LiskovSubstituionPrinciple {
    public void startEngine() {
        System.out.println("Starting the car engine");
    }
}

class Bicyle extends LiskovSubstituionPrinciple {
    public void startEngine() {
        System.out.println("Bicyle doesn't have engine");
    }
}


// ============Principle======================


interface LiskovInterface {

}

interface EngineVehicle extends LiskovInterface {
    public void startEngine();
}

interface NoEngineVehicle extends LiskovInterface {
    public void start();
}

class CarVehicle implements EngineVehicle {
    public void startEngine() {
        System.out.println("Starting the car engine");
    }
}

class BicyleVehicle implements NoEngineVehicle {
    public void start() {
        System.out.println("Starting the car engine");
    }
}