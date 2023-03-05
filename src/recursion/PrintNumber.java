package recursion;

public class PrintNumber {

    public static int printNumber(int n){
        if(n==0){
            return 0;
        }else{
            System.out.print(n+" ");
            return printNumber(n-1);
        }
    }

    public static void main(String[] args) {
        printNumber(5);
    }
}
