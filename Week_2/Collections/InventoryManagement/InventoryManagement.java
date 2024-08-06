package Week_2.Collections.InventoryManagement;



import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<Integer, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    public boolean removeProduct(int productId) {
        return inventory.remove(productId) != null;
    }

    public boolean updateProductQuantity(int productId, int newQuantity) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            return true;
        }
        return false;
    }

    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
