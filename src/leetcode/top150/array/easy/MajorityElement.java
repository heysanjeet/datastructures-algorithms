package leetcode.top150.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //time O(n) |space O(1)
    public int majorityElementNaive(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //time O(n) | O(n)
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

        }
        n=n/2;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return 0;

    }

}
