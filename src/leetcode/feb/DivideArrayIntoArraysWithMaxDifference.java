package leetcode.feb;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
       /* Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
        Output: [[1,1,3],[3,4,5],[7,8,9]]*/
    }

    //time O(nlogn) | space O(1) where n is the length of the array.
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length / 3][3];
        for (int i = 2; i < nums.length; i = i + 3) {
            if (nums[i] - nums[i - 2] > k) {
                return new int[0][];
            }
            result[i / 3] = new int[]{nums[i - 2], nums[i - 1], nums[i]};
        }
        return result;
    }


    public int[][] divideArrayNaive(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        int arrIndex = 0;
        int[][] result = new int[length / 3][3];

        for (int i = 0; i < length; i += 3) {
            result[arrIndex][0] = nums[i];
            for (int j = 1; j < 3; j++) {
                if (nums[i + j] - result[arrIndex][0] <= k) {
                    result[arrIndex][j] = nums[i + j];
                } else {
                    return new int[0][0];
                }
            }
            arrIndex++;
        }
        return result;
    }
}
