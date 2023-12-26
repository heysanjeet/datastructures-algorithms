package algoexpert.easy;

import java.util.Arrays;
import java.util.List;

public class ValidSequence {
    public static void main(String[] args) {
        /*int[] array={1,2,3,4,5,6};
        int[] sequence={4,5};
        output= true*/
        System.out.println(isValidSubsequence(Arrays.asList(1,2,3,4,5,6),Arrays.asList(4,5)));//true

    }
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
}
