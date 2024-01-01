package leetcode.top150.array.easy;
import java.util.Arrays;

public class MergeSortedArray {

    /*Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]*/
    public static void main(String[] args) {

    }
    public void merge2(int[] nums1, int m, int[] nums2, int n){

    }
    //time O(m+n)log(m+n) | space O(1)
    public void mergeNaive(int[] nums1, int m, int[] nums2, int n){
        for(int i=m, j=0;j<n;j++){
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}
