package Week_2.File_IO.LogManagementSystem;

public class LogApp {
    public static void main(String[] args) {
        LogWriter logWriter = new LogWriter();
        LogReader logReader = new LogReader();
        
        String fileName = "logs.txt";
        
        logWriter.writeLog(fileName, "Log message 1");
        logWriter.writeLog(fileName, "Log message 2");
        logWriter.writeLog(fileName, "Log message 3");
        
        System.out.println("Reading logs from the file:");
        logReader.readLogs(fileName);
        
        System.out.println("Attempting to read from a non-existent file:");
        logReader.readLogs("non_existent_file.txt");
    }
}
