package VendingMachineSystem;

public class DispenseState implements VendingMachineState{
    VendingMachineSystem vendingMachine;

    public DispenseState(VendingMachineSystem system) {
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
        vendingMachine.getInventory().removeProduct(vendingMachine.getProduct());
        if(vendingMachine.totalAmount > vendingMachine.getProduct().price) {
            vendingMachine.setCurrentState(new ReturnChangeState(vendingMachine));
        }
    }

    @Override
    public double returnChange() {

    }
}
