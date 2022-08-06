package interview_question.google_interview_questions;

import java.util.HashMap;

public class HasPairWithSum {
   /* Given array find the check if it has some number
   int[] array1={1,2,3,9}; sum=8 No
   int[] array2={1,2,4,4} sum=8 Yes
    */

    public static void main(String[] args) {
        int[] array1 = {1,2,4,4};
        boolean result = hasPairWithSum2(array1, 8);
        System.out.println(result);
    }

    //Native approach O(n^2)
    public static boolean hasPairWithSum(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    //A better solution O(n)
    public static boolean hasPairWithSum2(int[] array, int sum) {
        HashMap<Integer, Integer> hasMap = new HashMap<Integer, Integer>();
        //do for each element
        for (int i = 0; i < array.length; i++) {
            // check if pair (array[i], sum-array[i]) exists
            // if the difference is seen before, print the pair
            //int[] array2={1,2,4,4} sum=8 Yes
            if (hasMap.containsKey(sum - array[i])) {
                return true;
            }
            // store index of the current element in the map
            hasMap.put(array[i], i);
        }
        return false;
    }

}
