package data_structures.array;

public class MaxDifferenceInArray {
    public static void main(String[] args) {
        int array[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(findMaxDiff(array));
    }

    /*Input : arr = {2, 3, 10, 6, 4, 8, 1}
    Output : 8
    Explanation : The maximum difference is between 10 and 2.

    Input : arr = {7, 9, 5, 6, 3, 2}
    Output : 2
    Explanation : The maximum difference is between 9 and 7.*/

    //time O(n)
    //space O(1)
    public static int findMaxDiff(int[] array) {
        int result = array[1] - array[0];//current result
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                result = Math.max(result, array[j] - array[i]);//the difference is more than current result then we update the result.
            }
        }
        return result;
    }
}
