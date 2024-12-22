package RideSharingSystem;

public abstract class Person {
    String name, email;
    Location location;

    public Person(String name, String email, Location location) {
        this.name =name;
        this.email = email;
        this.location = location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public abstract void notify(String msg);
}
