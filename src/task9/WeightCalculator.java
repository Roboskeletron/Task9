package task9;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class WeightCalculator {
    public static List<List<Integer>> getVariants(Integer[] weights, int weightSum) {
        if (!isInputValid(weights))
            throw new InvalidParameterException("You have more than 10 weights or 2 or more same weights");

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

    public static boolean isInputValid(Integer[] weights){
        if (weights.length > 10)
            return false;

        Dictionary<Integer, Integer> weightsStatistics = new Hashtable<>();

        for (var weight : weights){
            if (weightsStatistics.get(weight) == null)
                weightsStatistics.put(weight, 1);
            else return false;
        }

        return true;
    }
}
