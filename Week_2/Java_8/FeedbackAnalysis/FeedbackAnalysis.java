package Week_2.Java_8.FeedbackAnalysis;

import java.util.*;
import java.util.stream.Collectors;

public class FeedbackAnalysis {
    public static void main(String[] args) {
        List<Feedback> feedbackList = Arrays.asList(
            new Feedback(1, "Alice", 5, "Excellent service!"),
            new Feedback(2, "Bob", 3, "Average experience."),
            new Feedback(3, "Charlie", 2, "Very disappointed."),
            new Feedback(4, "David", 4, "Good service, but room for improvement."),
            new Feedback(5, "Eve", 1, "Terrible experience, will not return.")
        );

        FeedbackFilter positiveFilter = feedback -> feedback.getRating() >= 4;
        FeedbackFilter negativeFilter = feedback -> feedback.getRating() <= 2;
        FeedbackProcessor printProcessor = feedback -> System.out.println(feedback);

        System.out.println("Positive Feedback:");
        feedbackList.stream()
            .filter(positiveFilter::filter)
            .forEach(printProcessor::process);

        System.out.println("\nNegative Feedback:");
        feedbackList.stream()
            .filter(negativeFilter::filter)
            .forEach(printProcessor::process);

        List<String> customerNamesAndComments = processFeedback(
            feedbackList,
            feedback -> feedback.getRating() >= 3, 
            feedback -> System.out.println(feedback.getCustomerName() + ": " + feedback.getComments()) 
        );

        System.out.println("\nCustomer Names and Comments:");
        customerNamesAndComments.forEach(System.out::println);

        long positiveCount = feedbackList.stream()
            .filter(positiveFilter::filter)
            .count();
        long negativeCount = feedbackList.stream()
            .filter(negativeFilter::filter)
            .count();

        System.out.println("\nCount of Positive Feedback: " + positiveCount);
        System.out.println("Count of Negative Feedback: " + negativeCount);
    }

    private static List<String> processFeedback(List<Feedback> feedbackList,
                                                FeedbackFilter filter,
                                                FeedbackProcessor processor) {
        return feedbackList.stream()
            .filter(filter::filter)
            .map(feedback -> {
                processor.process(feedback);
                return feedback.getCustomerName() + ": " + feedback.getComments();
            })
            .collect(Collectors.toList());
    }
}

