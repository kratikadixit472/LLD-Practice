package ParkingLotSystem;

public class CardPayment implements PaymentStrategy{
    public PaymentInfo pay(Ticket ticket) {
        return new PaymentInfo(0, 0, 0, ticket);
    }
}
