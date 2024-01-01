package algoexpert.arrays.easy;

import java.util.Arrays;

public class SortedSqaredArray {
    public static void main(String[] args) {
        //array=[1,2,3,4,5,6,7,8,9]
        //op- [1,4,9,25,35,64,81]
    }

    //time O(n) | space O(n)
    public int[] sortedSquaredArray2(int[] array) {
        // Write your code here.
        int[] sortedSquares = new int[array.length];
        int smallerValueIdx = 0;
        int largerValueIdx = array.length - 1;
        for (int idx = array.length - 1; idx >= 0; idx--) {
            int samllerValue = array[smallerValueIdx];
            int largetValue = array[largerValueIdx];
            if (Math.abs(samllerValue) > Math.abs(largetValue)) {
                sortedSquares[idx] = samllerValue * samllerValue;
                smallerValueIdx++;
            } else {
                sortedSquares[idx] = largetValue * largetValue;
                largerValueIdx--;
            }
        }
        return sortedSquares;
    }


    //time O(nlogn) | space O(n)
    public int[] sortedSquaredArray1(int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            tempArray[i] = value * value;
        }
        Arrays.sort(tempArray);
        return tempArray;
    }
}

