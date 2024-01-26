package algoexpert.arrays.medium;

public class BestSeat {
    public static void main(String[] args) {
       //input seats=[1,0,1,0,0,0,1] //op=4 ->no one is seating left and right
    }


    //Time O(n) | space O(1)
    public int bestSeat(int[] seats) {
        int bestSeat = -1;
        int maxSpace = 0;
        int left = 0;
        while (left < seats.length) {
            int right = left + 1;
            while (right < seats.length && seats[right] == 0) {
                right++;
            }
            int availableSpace = right - left - 1;
            if (availableSpace > maxSpace) {
                bestSeat = (left + right) / 2;
                maxSpace = availableSpace;
            }
            left = right;
        }
        return bestSeat;
    }
}
