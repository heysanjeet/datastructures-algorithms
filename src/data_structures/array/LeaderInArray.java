package data_structures.array;

public class LeaderInArray {

    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        findLeaderInArray(array);
    }

    /*Input: arr[] = {16, 17, 4, 3, 5, 2},
    Output: 17, 5, 2

    Input: arr[] = {1, 2, 3, 4, 5, 2},
    Output: 5, 2*/

    //Naive
    //O(n^2)
    public static void findLeaderInArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean isLeader = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    isLeader = true;
                    break;

                }
            }
            if (isLeader == false) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
