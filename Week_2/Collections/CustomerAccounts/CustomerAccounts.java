package Week_2.Collections.CustomerAccounts;



import java.util.TreeMap;

public class CustomerAccounts {
    private TreeMap<Integer, Customer> customerMap;

    public CustomerAccounts() {
        customerMap = new TreeMap<>();
    }

    public void addCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    public boolean removeCustomer(int customerId) {
        return customerMap.remove(customerId) != null;
    }

    public void displayCustomers() {
        for (Customer customer : customerMap.values()) {
            System.out.println(customer);
        }
    }
}
