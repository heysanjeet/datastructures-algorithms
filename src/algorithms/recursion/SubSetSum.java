package algorithms.recursion;

public class SubSetSum {
    public static void main(String[] args) {
        int[] nums = {24, 34, 23, 45};
        System.out.println(countSubsets(nums, nums.length, 57));//1
    }

    private static int countSubsets(int[] nums, int n, int sum) {
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }
        return countSubsets(nums, n - 1, sum) + countSubsets(nums, n - 1, sum - nums[n - 1]);
    }
}
