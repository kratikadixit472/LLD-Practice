package SOLIDPrinciples;

public class DependencyInversionPrinciple {
    
}

class Monitor {
    // High level module should not depend on low level module
    Switchable switchable;

    // It should depend on abstraction
    public Monitor(Switchable swichable) {
        this.switchable = switchable;
    }

    public void turnOn() {
        switchable.turnOn();
    }
}

interface Switchable {
    public void turnOn();
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Switching on the fan");
    }
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Switching on the light");
    }
}