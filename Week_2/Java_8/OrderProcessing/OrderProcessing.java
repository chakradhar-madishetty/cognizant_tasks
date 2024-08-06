package Week_2.Java_8.OrderProcessing;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessing {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Alice", 150.0, "Pending"));
        orders.add(new Order(2, "Bob", 250.0, "Completed"));
        orders.add(new Order(3, "Charlie", 50.0, "Pending"));
        orders.add(new Order(4, "David", 450.0, "Pending"));
        orders.add(new Order(5, "Eve", 100.0, "Completed"));

        OrderFilter amountGreaterThan100 = order -> order.getOrderAmount() > 100;

        OrderProcessor processOrder = order -> order.setStatus("Processed");

        filterAndProcessOrders(orders, amountGreaterThan100, processOrder);

        orders.forEach(System.out::println);
    }

    public static void filterAndProcessOrders(List<Order> orders, OrderFilter filter, OrderProcessor processor) {
        for (Order order : orders) {
            if (filter.filter(order)) {
                processor.process(order);
            }
        }
    }
}

