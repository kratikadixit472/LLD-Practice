package ParkingLotSystem;

public class Ticket {
    int id;
    Vehicle vehicle;
    double entryTime;
    ParkingSlot slot;

    public Ticket(int id, Vehicle vehicle, double time, ParkingSlot slot) {
        this.id = id;
        this.vehicle = vehicle;
        this.entryTime = time;
        this.slot = slot;
    }

    public int getId() {
        return id;
    }
}
