package algoexpert.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbers {
    public static void main(String[] args) {
// input =[1,4,3] output=[2,5]
    }


    //Time O(n) | space O(1)
    public int[] missingNumbers(int[] nums) {
        Set<Integer> includedNums = new HashSet<Integer>();
        for (int num : nums) {
            includedNums.add(num);
        }
        int[] solution = new int[]{-1, -1};
        for (int num = 1; num < nums.length + 3; num++) {
            if (!includedNums.contains(num)) {
                if (solution[0] == -1) {
                    solution[0] = num;
                } else {
                    solution[1] = num;
                }
            }
        }
        return solution;
    }
}
