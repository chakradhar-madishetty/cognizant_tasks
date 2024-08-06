// InventoryManagementTest.java
package InventoryManagement;

public class InventoryManagementTest {
    public static void main(String[] args) {
        InventoryManagement management = new InventoryManagement();
        
        // Add products
        Product product1 = new Product(1, "Laptop", 10);
        Product product2 = new Product(2, "Smartphone", 20);
        Product product3 = new Product(3, "Tablet", 15);
        
        management.addProduct(product1);
        management.addProduct(product2);
        management.addProduct(product3);
        
        // Display products
        System.out.println("Products in the inventory:");
        management.displayProducts();
        
        // Update product quantity
        management.updateProductQuantity(2, 25);
        
        // Display products after update
        System.out.println("Products in the inventory after updating quantity:");
        management.displayProducts();
        
        // Remove a product
        management.removeProduct(1);
        
        // Display products after removal
        System.out.println("Products in the inventory after removing a product:");
        management.displayProducts();
    }
}
