package interview_question;

public class FindFirstAndMid {
    public static void find(int[] array) {
        System.out.println(array[0]);
        int mid = (0 + array.length) / 2;
        System.out.println("-----------------------------");
        for (int i = 0; i < mid; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 4, 7, 5, 8, 3, 7, 3, 6, 9, 1, 2, 3, 4};
        find(array);
    }
}
