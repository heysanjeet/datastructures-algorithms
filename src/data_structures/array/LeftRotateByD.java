package data_structures.array;

public class LeftRotateByD {
    public static void main(String[] args) {
        int[] array = {3, 6, 2, 5, 3, 7, 8, 5};
        leftRotateByD1(array, 2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Copy the element starting by d
    //Time-O(n*d)
    //space-O(1)
    public static void leftRotate(int[] array, int d) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(array, array.length);
        }
    }

    private static int[] leftRotateByOne(int[] nums, int d) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    //Better time
    //time-O(n)
    //space-O(n)
    public static int[] leftRotateByD1(int[] array, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = array[i];
        }
        for (int i = d; i < array.length; i++) {
            array[i - d] = array[i];
        }
        for (int i = 0; i < d; i++) {
            array[array.length - d + i] = temp[i];
        }
        return array;
    }
}
