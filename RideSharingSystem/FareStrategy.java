package RideSharingSystem;

public interface FareStrategy {
    public double calculateStrategy(double distance, Vehicle vehicle);
}

class StandardStrategy implements FareStrategy {
    public double calculateStrategy(double distance, Vehicle vehicle) {
        return vehicle.getFare() * distance * 100;
    }
}
