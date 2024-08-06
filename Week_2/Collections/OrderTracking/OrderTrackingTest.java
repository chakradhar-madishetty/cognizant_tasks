package Week_2.Collections.OrderTracking;



public class OrderTrackingTest {
    public static void main(String[] args) {
        OrderTracking tracking = new OrderTracking();
        
        Order order1 = new Order(1, "Pizza");
        Order order2 = new Order(2, "Burger");
        Order order3 = new Order(3, "Pasta");
        
        tracking.addOrder(order1);
        tracking.addOrder(order2);
        tracking.addOrder(order3);
        
        System.out.println("Orders in the queue:");
        tracking.displayOrders();
        
        System.out.println("Processing an order...");
        Order processedOrder = tracking.processOrder();
        System.out.println("Processed order: " + processedOrder);
        
        System.out.println("Remaining orders in the queue:");
        tracking.displayOrders();
    }
}
