package algoexpert.arrays.easy;

import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String[] args) {

    }

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
