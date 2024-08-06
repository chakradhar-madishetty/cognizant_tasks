package Week_2.Collections.CustomerAccounts;



public class CustomerAccountsTest {
    public static void main(String[] args) {
        CustomerAccounts accounts = new CustomerAccounts();
        
        Customer customer1 = new Customer(101, "Alice", "alice@example.com");
        Customer customer2 = new Customer(102, "Bob", "bob@example.com");
        Customer customer3 = new Customer(100, "Charlie", "charlie@example.com");
        
        accounts.addCustomer(customer1);
        accounts.addCustomer(customer2);
        accounts.addCustomer(customer3);
        
        System.out.println("Customers in the system:");
        accounts.displayCustomers();
        
        accounts.removeCustomer(101);
        
        System.out.println("Customers in the system after removal:");
        accounts.displayCustomers();
    }
}
