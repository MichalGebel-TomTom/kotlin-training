package classes.exercise;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public record Settings(Path path, boolean showHiddenFile, int depth, String filterPattern, List<String> extensions) {
    Settings(Path path) {
        this(path, false, 1, null, Collections.emptyList());
    }

    Settings(Path path, boolean showHiddenFile) {
        this(path, showHiddenFile, 1, null, Collections.emptyList());

    }

    Settings(Path path, boolean showHiddenFile, int depth) {
        this(path, showHiddenFile, depth, null, Collections.emptyList());
    }

    Settings(Path path, boolean showHiddenFile, int depth, String filterPattern) {
        this(path, showHiddenFile, depth, filterPattern, Collections.emptyList());
    }

}
