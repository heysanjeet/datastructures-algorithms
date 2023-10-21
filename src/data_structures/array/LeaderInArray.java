package data_structures.array;

public class LeaderInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2};
        printLeaderInArray(array);//5, 2
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

    //Time- O(n)
    //Space-O(1)
    public static void printLeaderInArray(int array[]) {
        int currentLeader = array[array.length-1];
        System.out.print(currentLeader + " ");

        for (int i = array.length - 2; i > 0; i--) {
            if (array[i] > currentLeader) {
                currentLeader=array[i];
                System.out.print(currentLeader + " ");
            }
        }
    }
}
