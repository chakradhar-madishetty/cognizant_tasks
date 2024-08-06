package Week_2_Java_8.OrderProcessing;

@FunctionalInterface
public interface OrderProcessor {
    void process(Order order);
}

