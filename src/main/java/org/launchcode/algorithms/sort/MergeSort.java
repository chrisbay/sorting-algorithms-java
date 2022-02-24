package org.launchcode.algorithms.sort;

/**
 * Created by Chris Bay
 */
public class MergeSort {

    static int[] slice(int[] arr, int start, int end) {
        int sliceLen = end - start;
        int[] sliced = new int[sliceLen];
        for (int i = 0; i < sliceLen; i++) {
            sliced[i] = arr[start + i];
        }
        return sliced;
    }

    public static int[] sort(int[] items) {

        if (items.length <= 1) {
            return items;
        }

        int middle = items.length / 2;
        int[] left = slice(items, 0, middle);
        int[] right = slice(items, middle, items.length);

        int [] sorted = merge(sort(left), sort(right));

        return sorted;
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < merged.length; i++) {
            if (idx2 >= arr2.length) {
                merged[i] = arr1[idx1];
                idx1++;
            } else if (idx1 >= arr1.length) {
                merged[i] = arr2[idx2];
                idx2++;
            } else if (arr1[idx1] < arr2[idx2]) {
                merged[i] = arr1[idx1];
                idx1++;
            } else {
                merged[i] = arr2[idx2];
                idx2++;
            }
        }

        return merged;
    }

}
