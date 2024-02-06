package leetcode.feb;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        /*Input: low = 100, high = 300
        Output: [123,234]*/
    }

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= 9; i++) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;//gererate the number
                if (low <= num && num <= high) {
                    result.add(num);
                }
                nextDigit++;
            }
        }
        result.sort(null);
        return result;
    }
}
