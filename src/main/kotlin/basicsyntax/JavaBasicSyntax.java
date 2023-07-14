package basicsyntax;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JavaBasicSyntax {
    private JavaBasicSyntax() {
    }

    static int number = 1;
    static String text = "hello";
    static double factor = 0.1;

    final static int immutableNumber = 2;
    final static double immutableFactor = 0.2;

    int sum(int a, int b) {
        return a + b;
    }

    void printSum(int a, int b) {
        System.out.println(sum(a, b));
    }

    int chooseMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    void checkedExceptions(Path path) throws IOException {
        Files.isHidden(path);
    }
}
