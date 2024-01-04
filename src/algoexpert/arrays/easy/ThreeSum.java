package algoexpert.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        //array=[12,3,1,2,-6,5,-8,6] targetSum=0
        //[[-8,2,6],[-8,3,5],[-6,1,5]]
    }


    //time O(n^2) | space O(n)
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    Integer[] newTriplet = {array[i], array[left], array[right]};
                    triplets.add(newTriplet);
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else if (currentSum > targetSum) {
                    right--;
                }
            }
        }
        return new ArrayList<Integer[]>(triplets);
    }
}
