package algorithms.matrix;

public class PrintMatrixInSnakeP {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4},{5,6,7,8},
                       {9,10,11,12},{13,14,15,16}};
        printMatrixInSnakePattern(array);
    }

    /*Examples:

    Input: mat[][] = { {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9} };
    Output: 1 2 3 6 5 4 7 8 9*/
    public static void printMatrixInSnakePattern(int[][] array){
        int R=4;int C=4;
        for(int i=0;i<R;i++){
            if(i%2==0){
                for(int j=0;j<C;j++){
                    System.out.print(array[i][j]+" ");
                }
            }else{
                for(int j=C-1;j>=0;j--){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
    }
}
