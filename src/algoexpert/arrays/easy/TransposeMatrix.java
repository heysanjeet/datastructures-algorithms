package algoexpert.arrays.easy;

public class TransposeMatrix {
    public static void main(String[] args) {
/**
 * input: matrix =[
 * [1,2]
 * ]
 * output : [
 * [1]
 * [2]
 * ]
 */
    }

    //time O(w*h) | space O(w*h)
    public int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                transposedMatrix[col][row] = matrix[row][col];
            }
        }
        return transposedMatrix;
    }
}
