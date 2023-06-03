package interview_question;

public class TowSumSortedArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 10, 12, 18, 19};
        int[] result = twoSum(array, 23);
        System.out.println(result[0] + " " + result[1]);//1,7
    }

    private static int[] twoSum(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (array[start] + array[end] != target) {
            if (array[start] + array[end] < target) {
                start++;//sum<target move start pointer
            } else {
                end--;//else move end pointer
            }
        }
        return new int[]{start, end};
    }
}
