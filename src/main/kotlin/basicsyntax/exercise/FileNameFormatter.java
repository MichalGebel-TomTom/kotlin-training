package basicsyntax.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileNameFormatter {
    private FileNameFormatter() {
    }

    private static String typeOf(File file) throws Exception {
        String fileType;
        try {
            fileType = Files.probeContentType(file.toPath());
            if (fileType == null) {
                fileType = "file";
            }

            return fileType;
        } catch (IOException e) {
            throw new Exception("Cant resolve file type");
        }
    }
}
