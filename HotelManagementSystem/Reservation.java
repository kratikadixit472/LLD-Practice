package HotelManagementSystem;

public class Reservation {
    String id;
    Room room;
    Customer customer;
    String startDate;
    String endDate;

    public Reservation(String id, Room room, Customer customer, String startDate, String endDate) {
        this.id = id;
        this.room = room;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }
}
