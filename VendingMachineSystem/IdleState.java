package VendingMachineSystem;

public class IdleState implements VendingMachineState{
    VendingMachineSystem vendingMachine;

    public IdleState(VendingMachineSystem system) {
        vendingMachine = system;
    }

    @Override
    public void selectProduct(Product product) {
        if(vendingMachine.getInventory().isAvailable(product)) {
            vendingMachine.selectProduct(product);
            vendingMachine.setCurrentState(new ReadyState(vendingMachine));
        }
        else {
            return;
        }
    }

    @Override
    public void insertCoin(Coin coin) {
        //
    }

    @Override
    public void insertNote(Note note) {
        //
    }

    @Override
    public void dispenceProduct() {
        //
    }

    @Override
    public double returnChange() {
        //
    }
}
