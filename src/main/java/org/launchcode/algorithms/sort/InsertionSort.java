package org.launchcode.algorithms.sort;

/**
 * Created by Chris Bay
 */
public class InsertionSort extends AbstractSort {

    public static int[] sort(int[] items) {
        int[] sorted = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            sorted[i] = items[i];
            int j = i;
            while (j > 0 && sorted[j] < sorted[j-1]) {
                    swap(sorted, j, j-1);
                    j--;
            }
        }

        return sorted;
    }

}
