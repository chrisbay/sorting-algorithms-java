package org.launchcode.algorithms.sort;

/**
 * Created by Chris Bay
 */
public class CountingSort {

    private static final int MIN = 0;
    private static final int MAX = 50;

    public static int[] sort(int[] items) {

        int[] counts = new int[MAX - MIN + 1];
        int[] sorted = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            counts[items[i]]++;
        }

        int sortedIdx = 0;
        int countIdx = 0;
        while (sortedIdx < sorted.length) {
            while (counts[countIdx] == 0) {
                countIdx++;
            }
            for (int i = 1; i <= counts[countIdx]; i++) {
                sorted[sortedIdx] = MIN + countIdx;
                sortedIdx++;
            }
            countIdx++;
        }

        return sorted;
    }

}
