package algoexpert.arrays.medium;

import java.util.HashSet;

public class ZeroSumSubArray {

    public static void main(String[] args) {
        //input nums=[4,-3,2,4,-1,-5,7]; output=true
    }

    //Time O(n) | space O(n)
    public boolean zeroSumSubarray(int[] nums) {
        HashSet<Integer> sums = new HashSet<Integer>();
        sums.add(0);
        int currentSum = 0;
        for (int num : nums) {
            currentSum = currentSum + num;
            if (sums.contains(currentSum)) {
                return true;
            }
            sums.add(currentSum);
        }
        return false;
    }

    //Time O(n^2) | space O(1)
    public boolean zeroSumSubarrayNaive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum == 0) {
                return true;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
