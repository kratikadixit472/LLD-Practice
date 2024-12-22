package RideSharingSystem;

enum RideStatus {
    BOOKED;
}

public class Ride {
    private Passenger passenger;
    private Driver driver;
    private double distance;
    private double fare;
    private FareStrategy fareStrategy;
    private RideStatus status;

    public Ride(Passenger passenger, Driver driver, double diatnce, FareStrategy strategy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStrategy = strategy;
    }

    public void calculateFare() {
        fare = fareStrategy.calculateStrategy(distance, driver.getVehicle());
    }

    public double getFare() {
        return fare;
    }

    public void notifyUsers() {
        driver.notify(null);
        passenger.notify(null);
    }

}
