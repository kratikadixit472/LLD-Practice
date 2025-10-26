package VendingMachineSystem;

public class ReturnChangeState implements VendingMachineState{
    VendingMachineSystem vendingMachine;

    public ReturnChangeState(VendingMachineSystem system) {
        vendingMachine = system;
    }

    @Override
    public void selectProduct(Product product) {

    }

    @Override
    public void insertCoin(Coin coin) {

    }

    @Override
    public void insertNote(Note note) {

    }

    @Override
    public void dispenceProduct() {

    }

    @Override
    public double returnChange() {
        if(vendingMachine.totalAmount > vendingMachine.getProduct().price) {
            return vendingMachine.totalAmount - vendingMachine.getProduct().price;
        }
        return 0.0;
    }
}
