package Week_2.File_IO.LargeFileProcessor;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessorApp {
    public static void main(String[] args) {
        LargeFileReader fileReader = new LargeFileReader();
        LargeFileWriter fileWriter = new LargeFileWriter();
        
        String inputFileName = "large_sales_data.txt";  
        String outputFileName = "processed_sales_data.txt";
        
        System.out.println("Reading large sales data file:");
        List<String> salesData = fileReader.readLargeFile(inputFileName);
        
        if (salesData.isEmpty()) {
            System.out.println("No data to process.");
        } else {
            List<String> processedData = salesData.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            
            System.out.println("Writing processed data to a new file:");
            fileWriter.writeProcessedData(outputFileName, processedData);
        }
        
        System.out.println("Attempting to read from a non-existent file:");
        fileReader.readLargeFile("E:/Vs Code/Chakri-Cognizant/car_sales_data.txt");

        
        System.out.println("Attempting to write to a restricted directory:");
        fileWriter.writeProcessedData("E:/Vs Code/Chakri-Cognizant/processed_sales_data.txt", salesData);
    }
}
