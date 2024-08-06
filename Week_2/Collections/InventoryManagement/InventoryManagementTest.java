package Week_2.Collections.InventoryManagement;



public class InventoryManagementTest {
    public static void main(String[] args) {
        InventoryManagement management = new InventoryManagement();
        
        Product product1 = new Product(1, "Laptop", 10);
        Product product2 = new Product(2, "Smartphone", 20);
        Product product3 = new Product(3, "Tablet", 15);
        
        management.addProduct(product1);
        management.addProduct(product2);
        management.addProduct(product3);
        
        System.out.println("Products in the inventory:");
        management.displayProducts();
        
        management.updateProductQuantity(2, 25);
        
        System.out.println("Products in the inventory after updating quantity:");
        management.displayProducts();
        
        management.removeProduct(1);
        
        System.out.println("Products in the inventory after removing a product:");
        management.displayProducts();
    }
}
