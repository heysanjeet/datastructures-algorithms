package algoexpert.arrays.easy;

import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String[] args) {
         //coins=[5,7,1,1,2,3,22]
        //output=20
    }

    //time O(nlogn) | space O(1)
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int currentChnageCreated = 0;
        for (int coin : coins) {
            if (coin > currentChnageCreated + 1) {
                return currentChnageCreated + 1;
            }
            currentChnageCreated += coin;
        }
        return currentChnageCreated + 1;
    }
}
