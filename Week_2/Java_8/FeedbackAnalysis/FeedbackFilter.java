package Week_2_Java_8.FeedbackAnalysis;

@FunctionalInterface
public interface FeedbackFilter {
    boolean filter(Feedback feedback);
}

