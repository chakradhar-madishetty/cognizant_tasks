package Week_2.File_IO.NoteTakingApp;
import java.util.Scanner;

public class NoteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        FileReaderDemo fileReaderDemo = new FileReaderDemo();
        
        System.out.println("Enter your note: ");
        String note = scanner.nextLine();
        
        String fileName = "note.txt";
        
        fileWriterDemo.saveNoteToFile(fileName, note);
        
        System.out.println("Reading the note from the file:");
        fileReaderDemo.readNoteFromFile(fileName);
        
        scanner.close();
    }
}
