package ParkingLotSystem;

public class CashPayment implements PaymentStrategy{
    public PaymentInfo pay(Ticket ticket) {
        return new PaymentInfo(0, 0, 0, ticket);
    }
}
