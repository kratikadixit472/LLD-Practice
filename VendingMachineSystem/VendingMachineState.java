package VendingMachineSystem;

public interface VendingMachineState {
    public void selectProduct(Product product);
    public void insertCoin(Coin coin);
    public void insertNote(Note note);
    public void dispenceProduct();
    public double returnChange();
}
