// CustomerAccountsTest.java
package CustomerAccounts;

public class CustomerAccountsTest {
    public static void main(String[] args) {
        CustomerAccounts accounts = new CustomerAccounts();
        
        // Add customers
        Customer customer1 = new Customer(101, "Alice", "alice@example.com");
        Customer customer2 = new Customer(102, "Bob", "bob@example.com");
        Customer customer3 = new Customer(100, "Charlie", "charlie@example.com");
        
        accounts.addCustomer(customer1);
        accounts.addCustomer(customer2);
        accounts.addCustomer(customer3);
        
        // Display customers
        System.out.println("Customers in the system:");
        accounts.displayCustomers();
        
        // Remove a customer
        accounts.removeCustomer(101);
        
        // Display customers after removal
        System.out.println("Customers in the system after removal:");
        accounts.displayCustomers();
    }
}
