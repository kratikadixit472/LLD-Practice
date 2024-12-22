package RideSharingSystem;

public class Passenger extends Person{

    public Passenger(String name, String email, Location location) {
        super(name, email, location);
    }
    
    public void notify(String msg) {
        System.out.println(msg);
    }
}
