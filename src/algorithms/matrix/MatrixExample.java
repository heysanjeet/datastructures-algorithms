package algorithms.matrix;

public class MatrixExample {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3,8,9}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
