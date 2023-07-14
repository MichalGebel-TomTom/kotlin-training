package extensions.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAffix {
    private static final String dirMarker = "[dir] ";

    private FileAffix() {
    }

    public static String getFileSuffix(File file) throws IOException {
        if (!file.isDirectory()) {
            long bytes = getFileSize(file);
            if (bytes / 1024 == 0) {
                return String.format(" (%,d bytes)", bytes);
            }
            return String.format(" (%,d kB)", bytes / 1024);
        }
        return "";
    }

    public static long getFileSize(File file) throws IOException {
        long bytes = Files.size(Path.of(file.getPath()));
        return bytes;
    }
}
