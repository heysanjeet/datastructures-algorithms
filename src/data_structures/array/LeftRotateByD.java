package data_structures.array;

public class LeftRotateByD {
    public static void main(String[] args) {
        int[] array = {3, 6, 2, 5, 3, 7, 8, 5};
        leftRotate(array, 2, array.length - 1);
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
    //space-O(d)
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

    //better approach
    //time O(n)
    //space O(1)
    static void leftRotate(int arr[], int d, int n) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

    }

    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
