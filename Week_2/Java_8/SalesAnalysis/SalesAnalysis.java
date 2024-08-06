package Week_2.Java_8.SalesAnalysis;
import java.time.LocalDate;
import java.util.*;

public class SalesAnalysis {
    public static void main(String[] args) {
        List<SalesRecord> salesRecords = Arrays.asList(
            new SalesRecord(1, "Alice", "North", 1200.00, LocalDate.of(2024, 1, 15), "Electronics", 10),
            new SalesRecord(2, "Bob", "South", 850.00, LocalDate.of(2024, 2, 20), "Furniture", 5),
            new SalesRecord(3, "Alice", "North", 2200.00, LocalDate.of(2024, 3, 5), "Electronics", 20),
            new SalesRecord(4, "Charlie", "East", 1500.00, LocalDate.of(2024, 1, 30), "Books", 15),
            new SalesRecord(5, "Bob", "South", 1900.00, LocalDate.of(2024, 2, 10), "Furniture", 8),
            new SalesRecord(6, "Charlie", "East", 1300.00, LocalDate.of(2024, 3, 15), "Books", 12)
        );

        String targetCategory = "Electronics";
        System.out.println("Filtered and sorted records for category '" + targetCategory + "':");

        long startTime = System.nanoTime();
        salesRecords.stream()
            .filter(record -> record.getProductCategory().equals(targetCategory))
            .sorted(Comparator.comparing(SalesRecord::getDate))
            .forEach(System.out::println);
        long endTime = System.nanoTime();
        System.out.println("Time taken (sequential): " + (endTime - startTime) + " ns");

        System.out.println("\nFiltered and sorted records for category '" + targetCategory + "' (parallel):");
        startTime = System.nanoTime();
        salesRecords.parallelStream()
            .filter(record -> record.getProductCategory().equals(targetCategory))
            .sorted(Comparator.comparing(SalesRecord::getDate))
            .forEach(System.out::println);
        endTime = System.nanoTime();
        System.out.println("Time taken (parallel): " + (endTime - startTime) + " ns");

        String targetRegion = "North";
        double averageSales = salesRecords.stream()
            .filter(record -> record.getRegion().equals(targetRegion))
            .mapToDouble(SalesRecord::getAmount)
            .average()
            .orElse(0.0);
        System.out.println("\nAverage sales for region '" + targetRegion + "': " + averageSales);

        SalesRecord topRecord = salesRecords.stream()
            .max(Comparator.comparing(SalesRecord::getAmount))
            .orElse(null);
        System.out.println("\nTop sales record:");
        System.out.println(topRecord);

        startTime = System.nanoTime();
        SalesRecord topRecordParallel = salesRecords.parallelStream()
            .max(Comparator.comparing(SalesRecord::getAmount))
            .orElse(null);
        endTime = System.nanoTime();
        System.out.println("\nTop sales record (parallel):");
        System.out.println(topRecordParallel);
        System.out.println("Time taken (parallel): " + (endTime - startTime) + " ns");
    }
}
