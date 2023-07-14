package collections.exercise;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DirectoryReader {
    private List<String> findFilesWithPattern(List<Path> filePaths, String pattern) {
        List<String> filesWithPattern = new ArrayList<>();
        for (Path filePath : filePaths) {
            if (filePath.getFileName().toString().contains(pattern)) {
                filesWithPattern.add(filePath.toString());
            }
        }
        return filesWithPattern;
    }
}
