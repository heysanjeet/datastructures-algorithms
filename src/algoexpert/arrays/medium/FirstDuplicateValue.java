package algoexpert.arrays.medium;

import java.util.HashSet;

public class FirstDuplicateValue {
    public static void main(String[] args) {
/**
 *input =[2,1,5,2,3,3,4]
 * output=2 :- it is first duplicate
 */
    }


    //Time O(n) | space O(1)
    public int firstDuplicateValueBest(int[] array) {
        for(int value:array){
            int absValue=Math.abs(value);
            if(array[absValue-1] < 0){
                return absValue;
            }
            array[absValue-1] *=-1;
        }
        return -1;
    }



    //Time O(n) | space O(n)
    public int firstDuplicateValue(int[] array) {
        HashSet<Integer> valueSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (valueSet.contains(array[i])) {
                return array[i];
            }
            valueSet.add(array[i]);
        }

        return -1;
    }

    //Time O(n^2) | space O(1)
    public int firstDuplicateValueNaive(int[] array) {
        int miniSecondIdx = array.length;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int valueToCompare = array[j];

                if (value == valueToCompare) {
                    miniSecondIdx = Math.min(miniSecondIdx, j);//3<7 index, update min
                }
            }
        }
        if (miniSecondIdx == array.length) {//we did not find duplicate
            return -1;
        }
        return array[miniSecondIdx];
    }
}
