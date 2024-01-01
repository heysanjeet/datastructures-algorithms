package algoexpert.arrays.easy;

import java.util.Arrays;
import java.util.List;

public class ValidSequence {
    public static void main(String[] args) {
        /*int[] array={1,2,3,4,5,6};
        int[] sequence={4,5};
        output= true*/
        System.out.println(isValidSubSequence2(Arrays.asList(1,2,3,4,5,6),Arrays.asList(4,5)));//true

    }

    //time O(n) | space O(1), n is length of the array
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence) {

        int arrIndex = 0;
        int seqIndex = 0;

        while (arrIndex < array.size() && seqIndex < sequence.size()) {
            if (array.get(arrIndex).equals(sequence.get(seqIndex))) {
                seqIndex++;
            }
            arrIndex++;
        }
        return seqIndex == sequence.size();
    }

    //time O(n) | space O(1) - where n is the length of the array
    public static boolean isValidSubSequence2(List<Integer> array, List<Integer> sequence){
        int seqIndex=0;
        for(int value: array){
            if(seqIndex==sequence.size()){
                break;
            }if(sequence.get(seqIndex).equals(value)){
                seqIndex++;
            }
        }
        return seqIndex==sequence.size();
    }
}
