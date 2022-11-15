package task9;

import java.util.ArrayList;
import java.util.List;

public class WeightCalculator {
    public static List<List<Integer>> getVariants(Integer[] weights, int weightSum) {
        List<List<Integer>> variants = new ArrayList<>();

        for (int variant = 0; variant < Math.pow(2, weights.length); variant++) {
            var weightList = generateVariant(weights, variant);

            var sum = (Integer) weightList.stream().mapToInt(i -> i).sum();

            if (sum == weightSum)
                variants.add(weightList);
        }

        return variants;
    }

    public static List<Integer> generateVariant(Integer[] weights, int variantNum) {
        List<Integer> variant = new ArrayList<>();

        for (int i = 0; i < weights.length; i++) {
            int weightComponent = (int) Math.pow(2, i);

            int hasComponent = weightComponent & variantNum;

            if (hasComponent == weightComponent)
                variant.add(weights[i]);
        }

        return variant;
    }
}
