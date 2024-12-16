package ParkingLotSystem;

public interface PaymentStrategy {
    public PaymentInfo pay(Ticket ticket);
}
