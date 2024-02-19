package leetcode.feb;

public class PowerofTwo {
    public static void main(String[] args) {
        /*Input: n = 1
        Output: true
        Explanation: 2^0 = 1*/
    }
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n -1) ==0;
    }
}
