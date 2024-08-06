// OrderTrackingTest.java
package OrderTracking;

public class OrderTrackingTest {
    public static void main(String[] args) {
        OrderTracking tracking = new OrderTracking();
        
        // Add orders
        Order order1 = new Order(1, "Pizza");
        Order order2 = new Order(2, "Burger");
        Order order3 = new Order(3, "Pasta");
        
        tracking.addOrder(order1);
        tracking.addOrder(order2);
        tracking.addOrder(order3);
        
        // Display orders
        System.out.println("Orders in the queue:");
        tracking.displayOrders();
        
        // Process an order
        System.out.println("Processing an order...");
        Order processedOrder = tracking.processOrder();
        System.out.println("Processed order: " + processedOrder);
        
        // Display remaining orders
        System.out.println("Remaining orders in the queue:");
        tracking.displayOrders();
    }
}
