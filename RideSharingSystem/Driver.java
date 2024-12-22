package RideSharingSystem;

public class Driver extends Person{
    
    private Vehicle vehicle;

    public Driver(String name, String email, Vehicle vehicle, Location location) {
        super(name, email, location);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void notify(String msg) {
        System.out.println(msg);
    }
}
