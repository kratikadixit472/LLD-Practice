package SOLIDPrinciples;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        
    }

    public static boolean compareVersion(String v1, String v2) {
		//System.out.println(" version is "+v1+" compare against "+v2);
	    String s1 = normalisedVersion(v1);
	    String s2 = normalisedVersion(v2);
	    int cmp = s1.compareTo(s2);
	    boolean str = cmp < 0 ? false : cmp > 0 ? true : true;
	    //System.out.println(" is supported ? "+str);
	    return str;
	}
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