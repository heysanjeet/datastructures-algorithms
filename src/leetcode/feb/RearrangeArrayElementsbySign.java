package leetcode.feb;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        /*Input: nums = [3,1,-2,-5,2,-4]
        Output: [3,-2,1,-5,2,-4]
        Explanation:
        The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
        The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
        Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions*/
    }

    public int[] rearrangeArray(int[] nums) {

        int[] result = new int[nums.length];
        int positive = 0;
        int negative = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[positive] = nums[i];
                positive += 2;
            } else {
                result[negative] = nums[i];
                negative += 2;
            }

        }
        return result;
    }

    public int[] rearrangeArrayNaive(int[] nums) {
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                v1.add(num);
            } else {
                v2.add(num);
            }
        }
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums.length / 2) {
            result.add(v1.get(index1));
            index1++;
            result.add(v2.get(index2));
            index2++;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
