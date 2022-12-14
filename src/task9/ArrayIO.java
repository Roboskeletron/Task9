package task9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayIO {
    public static Integer[] getArray(InputStream stream) throws IOException {
        List<Integer> data = new ArrayList<>();
        Scanner scanner = new Scanner(stream);

        scanner.useLocale(Locale.ROOT);

        while (scanner.hasNextDouble())
            data.add(scanner.nextInt());

        stream.close();

        Integer[] array = new Integer[data.size()];

        for (int i = 0; i < data.size(); i++) {
            array[i] = data.get(i);
        }

        return array;
    }

    public static String saveArray(OutputStream stream, List<List<Integer>> array, boolean writeFile) throws IOException {
        StringBuilder builder = new StringBuilder();

        for (var row : array) {
            for (var item : row) {
                builder.append(item).append(" ");
            }
            builder.append("\n");
        }

        var data = builder.toString();

        if (writeFile) {
            stream.write(data.getBytes(StandardCharsets.UTF_8));
            stream.close();
        }

        return data;
    }
}
