package leetcode.top150.array.easy;

public class RemoveElement {
    public static void main(String[] args) {

        /*Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).*/
        int[] nums = {3,3,2,2,3,2};
        System.out.println(removeElement(nums,3));
    }

    //time O(n) | space O(1)
    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        return i;
    }
}
