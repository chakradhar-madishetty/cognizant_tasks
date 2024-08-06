package Week_2.Java_8.OrderProcessing;

@FunctionalInterface
public interface OrderFilter {
    boolean filter(Order order);
}
