package VendingMachineSystem;

public class VendingMachineSystem {
    VendingMachineSystem vendingMachine;
    IdleState idleState;
    ReadyState readyState;
    DispenseState dispenseState;
    ReturnChangeState returnChangeState;
    VendingMachineState currentState;
    double totalAmount;
    Product product;
    Inventory inventory;

    public VendingMachineSystem() {
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
        totalAmount = 0;
        product = null;
        inventory = new Inventory();
    }

    public synchronized VendingMachineSystem getInstance() {
        if(vendingMachine == null) {
            vendingMachine = new VendingMachineSystem();
        }
        return vendingMachine;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingMachineState state) {
        currentState = state;
    }

    public Product getProduct() {
        return product;
    }

    public void selectProduct(Product product) {
        this.product = product;
    }

    public Product addProduct(String name, double price, int quantity) {
        Product product1 = new Product(name, price);
        getInventory().addProduct(product1, quantity);
        return product1;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void insertCoin(Coin coin) {
        getCurrentState().insertCoin(coin);
    }

    public void insertNote(Note note) {
        getCurrentState().insertNote(note);
    }

    public void dispenseProduct() {
        getCurrentState().dispenceProduct();
    }

    public void returnChange() {
        getCurrentState().returnChange();
    }

    public void addCoin(double price) {
        totalAmount += price;
    }

    public void addNote(double note) {
        totalAmount += price;
    }

}
