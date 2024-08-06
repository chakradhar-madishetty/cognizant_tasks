package Week_2_Java_8.OrderProcessing;

@FunctionalInterface
public interface OrderFilter {
    boolean filter(Order order);
}
