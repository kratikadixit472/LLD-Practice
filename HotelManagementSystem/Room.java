package HotelManagementSystem;

public class Room {
    int id;
    int beds;
    boolean isBooked;
    double price;

    public Room(int id, int beds) {
        this.id = id;
        this.beds = beds;
        isBooked = false;
        this.price = 10;
    }

    public void bookRoom() {
        isBooked = true;
    }

    public void checkOutRoom() {
        isBooked = false;
    }

    public boolean getRoomStatus() {
        return isBooked;
    }

    public double getPrice() {
        return price;
    }
}
