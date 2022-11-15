package task9.console;

import task9.ArrayIO;
import task9.WeightCalculator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        FileOutputStream outputStream = new FileOutputStream(args[1]);
        int weightSum = Integer.parseInt(args[2]);

        var weights = ArrayIO.getArray(inputStream);

        var variants = WeightCalculator.getVariants(weights, weightSum);

        System.out.println(ArrayIO.saveArray(outputStream, variants, true));
    }
}