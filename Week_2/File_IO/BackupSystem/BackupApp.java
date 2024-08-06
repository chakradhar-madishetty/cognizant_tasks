package Week_2.File_IO.BackupSystem;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BackupApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter source directory: ");
        String sourceDirPath = scanner.nextLine();
        Path sourceDir = Paths.get(sourceDirPath);
        
        System.out.print("Enter target directory: ");
        String targetDirPath = scanner.nextLine();
        Path targetDir = Paths.get(targetDirPath);
        
        DirectoryCopy directoryCopy = new DirectoryCopy();
        directoryCopy.copyDirectory(sourceDir, targetDir);
        
        System.out.println("Attempting to copy to a read-only directory:");
        Path readOnlyDir = Paths.get("/path/to/read-only-directory"); 
        directoryCopy.copyDirectory(sourceDir, readOnlyDir);
        
        System.out.println("Attempting to copy to a directory with insufficient space:");
        Path noSpaceDir = Paths.get("/path/to/no-space-directory"); 
        directoryCopy.copyDirectory(sourceDir, noSpaceDir);

        scanner.close();
    }
}
