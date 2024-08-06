package Week_2.File_IO.BackupSystem;
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class DirectoryCopy {
    public void copyDirectory(Path sourceDir, Path targetDir) {
        try (Stream<Path> stream = Files.walk(sourceDir)) {
            stream.forEach(source -> {
                Path target = targetDir.resolve(sourceDir.relativize(source));
                try {
                    if (Files.isDirectory(source)) {
                        if (!Files.exists(target)) {
                            Files.createDirectory(target);
                        }
                    } else {
                        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
                    }
                } catch (IOException e) {
                    System.err.println("Error copying directory: " + e.getMessage());
                }
            });
            System.out.println("Directory copied from " + sourceDir + " to " + targetDir);
        } catch (IOException e) {
            System.err.println("Error walking source directory: " + e.getMessage());
        }
    }
}
