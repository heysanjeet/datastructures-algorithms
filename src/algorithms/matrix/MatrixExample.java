package algorithms.matrix;

public class MatrixExample {
    public static void main(String[] args) {
        array2D();

    }

    public static void print2DArray() {
        int[][] array = {{1, 2, 3, 8, 9}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void array2D(){
        int[][] array=new int[2][5];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=10;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
