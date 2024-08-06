package Week_2.File_IO.LargeFileProcessor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeFileReader {
    public List<String> readLargeFile(String inputFileName) {
        List<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
                System.out.println(line); 
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + inputFileName + " (" + e.getMessage() + ")");
        }
        return data;
    }
}
