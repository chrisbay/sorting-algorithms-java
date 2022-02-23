package org.launchcode.algorithms.sort;

/**
 * Created by Chris Bay
 */
public class BubbleSort {

    private static void swap(int[] items, int i, int j) {
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public static void sort(int[] items) {
        bubbleToN(items, items.length);
    }

    private static void bubbleToN(int[] items, int n) {

        if (n == 1) return;

        for (int i = 0; i < n-1; i++) {
            if (items[i] > items[i+1]) {
                swap(items, i, i+1);
            }
        }

        bubbleToN(items, n-1);
    }

}
