package org.launchcode.algorithms.sort;

/**
 * Created by Chris Bay
 */
public class BubbleSort extends AbstractSort {

    public static int[] sort(int[] items) {
        int[] copy = items.clone();
        bubbleToN(copy, copy.length);
        return copy;
    }

    private static void bubbleToN(int[] items, int n) {

        if (n == 1) return;

        int numSwaps = 0;
        for (int i = 0; i < n-1; i++) {
            if (items[i] > items[i+1]) {
                swap(items, i, i+1);
                numSwaps++;
            }
        }

        if (numSwaps == 0) return;

        bubbleToN(items, n-1);
    }

}
