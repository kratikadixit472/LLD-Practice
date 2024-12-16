package HotelManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManagementSystem {
    
    Map<String, Reservation> reservationList = new HashMap<>();
    List<Room> bookedRoom = new ArrayList<>();

    public Reservation createBooking(Room room, Customer customer, String startDate, String endDate) {
        if(!room.getRoomStatus()) {
            room.bookRoom();
            Reservation reservation = new Reservation("123", room, customer, startDate, endDate);
            reservationList.put(reservation.getId(), reservation);
            bookedRoom.add(room);
            return reservation;
        }
        return null;
    }

    public void cancelBooking(String id) { 
        Reservation reservation = reservationList.get(id);
        Room room = reservation.getRoom();
        room.checkOutRoom(); 
        reservationList.remove(id);
    }

    public void checkIn(String id) {

    }

    public boolean checkOut(String id, Payment payment) {
        Reservation reservation = reservationList.get(id);
        Room room = reservation.getRoom();
    
        double amount = room.getPrice();
        if(payment.pay(amount)) {
            room.checkOutRoom(); 
            reservationList.remove(id);
        }
        return true;
    }
}
