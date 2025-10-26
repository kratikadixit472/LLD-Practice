package VendingMachineSystem;

public class ReadyState implements VendingMachineState{
    VendingMachineSystem vendingMachine;

    public ReadyState(VendingMachineSystem system) {
        vendingMachine = system;
    }

    @Override
    public void selectProduct(Product product) {

    }

    @Override
    public void insertCoin(Coin coin) {
        vendingMachine.addCoin(coin.price);
        checkPaymentStatus();
    }

    @Override
    public void insertNote(Note note) {
        vendingMachine.addNote(note.price);
        checkPaymentStatus();
    }

    @Override
    public void dispenceProduct() {

    }

    @Override
    public double returnChange() {

    }

    public void checkPaymentStatus() {
        if(vendingMachine.totalAmount >= vendingMachine.getProduct().price) {
            vendingMachine.setCurrentState(new DispenseState(vendingMachine));
        }
    }
}
