package dynemic_programming;

public class PrintNumber {

    public static int printnumber(int n){
        if(n==0){
            return 0;
        }else{
            System.out.print(n+" ");
            return printnumber(n-1);
        }
    }

    public static void main(String[] args) {
        printnumber(5);
    }
}
