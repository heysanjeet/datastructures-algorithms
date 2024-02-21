package leetcode.feb;

public class BitwiseANDofNumbersRange {
    public static void main(String[] args) {
        /*Input: left = 5, right = 7
        Output: 4*/
    }

    public int rangeBitwiseAnd(int left, int right) {
        while(right > left){
            right &= right-1;
        }
        return right;
    }
}

