package leetcode.feb;

public class MissingNumber {
    public static void main(String[] args) {
        /*Input: nums = [3,0,1]
        Output: 2*/
    }

    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}
