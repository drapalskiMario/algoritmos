package src.backtracking_guloso;

import java.util.ArrayList;
import java.util.List;

//Dado um conjunto S de elementos únicos, calcule todos os seus subconjuntos de n elementos.
//Exemplos:
//Entrada: S = [1, 2, 3], n = 2
//Saída: [1, 2], [1, 3], [2, 3]
//Entrada: S= [1, 2, 3, 4], n = 1
//Saída: [1], [2], [3] e [4]

public class SubsetsOfN {

    public static void backtrackSubsets(int[] nums, int n, int start, List<Integer> currentSubset, List<List<Integer>> result) {
        if (currentSubset.size() == n) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            backtrackSubsets(nums, n, i + 1, currentSubset, result);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public static List<List<Integer>> findSubsetsOfN(int[] nums, int n) {
        var subsets = new ArrayList<List<Integer>>();
        backtrackSubsets(nums, n, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    public static void main(String[] args) {
        var S1 = new int[]{1, 2, 3};
        var n1 = 2;
        List<List<Integer>> output1 = findSubsetsOfN(S1, n1);
        System.out.println(output1);

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        List<List<Integer>> output2 = findSubsetsOfN(S2, n2);
        System.out.println(output2);
    }
}

