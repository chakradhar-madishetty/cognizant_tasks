package Week_2.File_IO.BackupSystem;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileCopy {
    public void copyFile(Path source, Path target) {
        try {
            Files.copy(source, target);
            System.out.println("File copied from " + source + " to " + target);
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
