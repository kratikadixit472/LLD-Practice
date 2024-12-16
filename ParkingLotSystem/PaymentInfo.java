package ParkingLotSystem;

public class PaymentInfo {
    double amount;
    double date;
    int id;
    Ticket ticket;
    
    public PaymentInfo(double amount, double date, int id, Ticket ticket) {
        this.amount = amount;
        this.date = date;
        this.id = id;
        this.ticket = ticket;
    }
}
