package data_structures.array;

public class MaxConsecutive1 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveOneE(array));//4
    }

    //Naive approach
    public static int maxConsecutiveOne(int array[]) {
        int res = 0;

        for (int i = 0; i < array.length; i++) {
            int current = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] == 1) {
                    current++;
                } else {
                    break;
                }
            }
            res = Math.max(res, current);
        }
        return res;
    }

    //efficient
    public static int maxConsecutiveOneE(int[] array) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count = 0;
            } else if (array[i] == 1) {
                count++;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
