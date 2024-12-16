package ParkingLotSystem;

public class ParkingSlot {
    int id;
    boolean isAssigned;
    Vehicle vehicle;

    public ParkingSlot(int id) {
        this.id = id;
        isAssigned = false;
    }
    
    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAssigned;
    }
    
    public void markSpot(boolean isAssigned) {
        this.isAssigned = isAssigned;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isAssigned = true;
        return true;
    }

    public boolean unAssignVehicle() {
        vehicle = null;
        isAssigned = false;
        return true;
    }
}
