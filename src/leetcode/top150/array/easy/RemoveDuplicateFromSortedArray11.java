package leetcode.top150.array.easy;

public class RemoveDuplicateFromSortedArray11 {
    //Time O(n) | space O(1)
    public int removeDuplicates(int[] nums) {
        int count = 1, i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (count < 2 && nums[j] == nums[j - 1]) {
                nums[i] = nums[j];
                count++;
                i++;
            } else if (nums[j] != nums[j - 1]) {
                count = 1;
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
