package ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    List<ParkingSlot> slots;
    int id;


    public ParkingFloor(int id) {
        this.id = id;
        slots = new ArrayList<>();
    }

    public Ticket assignVehicle(Vehicle vehicle) {
        for(ParkingSlot slot : slots) {
            if(slot.assignVehicle(vehicle)) {
                return new Ticket(123, vehicle, 0.0, slot);
            }
        }
        return null;
    }
}
