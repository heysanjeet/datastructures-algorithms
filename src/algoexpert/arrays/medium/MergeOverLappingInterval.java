package algoexpert.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverLappingInterval {
    public static void main(String[] args) {

    }

    /**
     * intervals = [[1, 2], [3, 5], [4, 7], [6, 8], [9, 10]]
     * output=[[1, 2], [3, 8], [9, 10]]
     * // Merge the intervals [3, 5], [4, 7], and [6, 8].
     * // The intervals could be ordered differently.
     */


    //Time O(nlogn) | space O(n)
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedIntervals = new ArrayList<int[]>();
        int[] currentInterval = sortedIntervals[0];
        mergedIntervals.add(currentInterval);

        for (int[] nextInterval : sortedIntervals) {
            int currentIntervalEnd = currentInterval[1];
            int nextIntervalStart = nextInterval[0];
            int nextIntervalEnd = nextInterval[1];

            if (currentIntervalEnd >= nextIntervalStart) {
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);

            } else {
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }

        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

