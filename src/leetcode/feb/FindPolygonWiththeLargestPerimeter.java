package leetcode.feb;

import java.util.Arrays;

public class FindPolygonWiththeLargestPerimeter {
    public static void main(String[] args) {
       /* Example 2:

        Input: nums = [1,12,1,2,5,50,3]
        Output: 12
        Explanation: The polygon with the largest perimeter which can be made from nums has 5 sides: 1, 1, 2, 3, and 5. The perimeter is 1 + 1 + 2 + 3 + 5 = 12.
        We cannot have a polygon with either 12 or 50 as the longest side because it is not possible to include 2 or more smaller sides that have a greater sum than either of them.
                It can be shown that the largest possible perimeter is 12.
        Example 3:

        Input: nums = [5,5,50]
        Output: -1
        Explanation: There is no possible way to form a polygon from nums, as a polygon has at least 3 sides and 50 > 5 + 5.*/
    }

    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long preElementSum = 0;
        long result = -1;
        for (int num : nums) {
            if (num < preElementSum) {
                result = num + preElementSum;
            }
            preElementSum += num;
        }
        return result;
    }
}
