package algoexpert.arrays.medium;

public class ArrayOfProduct {
    public static void main(String[] args) {
        /**
         * input=[5,1,4,2]
         * output=[8,40,10,20]
         * explain:
         * 8 is equal to 1*4*2
         * 40 is equal to 5*4*2
         * 10 is equal to 5*1*2
         * 20 is equal to 5*1*4
         */


    }

    //Time O(n^2) | space O(n)
    public int[] arrayOfProductsNaive(int[] array) {
        int[] products = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int runningProduct = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {//dont consider the same position
                    runningProduct *= array[j];
                }
                products[i] = runningProduct;
            }
        }
        return products;
    }

}
