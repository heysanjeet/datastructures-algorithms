package leetcode.top150.array.easy;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        /*Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
                It does not matter what you leave beyond the returned k (hence they are underscores).*/
    }
    public int removeDuplicates(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
