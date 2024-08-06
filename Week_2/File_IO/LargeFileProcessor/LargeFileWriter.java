package Week_2.File_IO.LargeFileProcessor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LargeFileWriter {
    public void writeProcessedData(String outputFileName, List<String> processedData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String line : processedData) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Processed data written to " + outputFileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + outputFileName + " (" + e.getMessage() + ")");
        }
    }
}
