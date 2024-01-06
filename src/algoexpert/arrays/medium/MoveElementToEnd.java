package algoexpert.arrays.medium;

import java.util.List;

public class MoveElementToEnd {
    public static void main(String[] args) {
        //input=[2,1,2,2,2,3,4,2] toMove=2
        //output=[1,3,4,2,2,2,2,2]
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

        int start = 0;
        int end = array.size() - 1;

        while (start < end) {
            while (start < end && array.get(end) == toMove)
                end--;
            if (array.get(start) == toMove)
                swap(start, end, array);
            start++;
        }

        return array;
    }

    private static void swap(int i, int j, List<Integer> array) {
        int temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }

}
