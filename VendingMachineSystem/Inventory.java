package VendingMachineSystem;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<Product, Integer> map;

    public Inventory() {
        map = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        map.put(product, map.getOrDefault(product, 0) + quantity);
    }

    public boolean isAvailable(Product product) {
        return map.containsKey(product);
    }

    public void removeProduct(Product product) {
        map.put(product, map.get(product) - 1);
        if(map.get(product) == 0) map.remove(product);
    }
}
