package org.launchcode.algorithms.sort;

/**
 * Created by Chris Bay
 */
public class AbstractSort {

    static void swap(int[] items, int i, int j) {
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

}
