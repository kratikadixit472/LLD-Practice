package RideSharingSystem;

public class Location {
    int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private double calculateDistance(Location location) {
        int dx = x - location.x;
        int dy = y - location.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}