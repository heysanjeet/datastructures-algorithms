package algoexpert.arrays.easy;

import java.util.*;

public class TwoSum {

    //input=[3,5,-4,8,11,1,-1,6] target=10;
    //sample op= [-1,11]
    public static void main(String[] args) {
        int[] input = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] output = twoNumberSumSolution2(input, 10);//[-1,11]
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    //solution 1
    //tc- O(n^2) and space O(1)
    public static int[] twoNumberSumSolution1(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[]{array[i], array[j]};
                }
            }

        }
        return new int[0];
    }

    //Time- O(n), space O(n)
    public static int[] twoNumberSumSolution2(int[] array, int targetSum) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int val = targetSum - array[i];
            if (set.contains(val)) {
                return new int[]{val, array[i]};
            }
            set.add(array[i]);
        }
        return new int[0];
    }

    //time O(n) | space O(n)
    public static int[] twoNumberSumSolution3(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int value = targetSum - array[i];
            if (map.containsKey(value)) {
                return new int[]{value, array[i]};
            }
            map.put(array[i], i);
        }
        return new int[0];
    }

    //time: O(nlogn) | space O(1)
    public static int[] twoNumberSumSolution4(int[] array, int targetSum) {
        Arrays.sort(array);

        int start = 0;
        int end = array.length-1;

        while (start < end) {
            int currentsum = array[start] + array[end];
            if (currentsum == targetSum) {
                return new int[]{array[start], array[end]};
            } else if (currentsum < targetSum) {
                start++;
            } else if (currentsum > targetSum) {
                end--;
            }
        }
        return new int[0];
    }
}
