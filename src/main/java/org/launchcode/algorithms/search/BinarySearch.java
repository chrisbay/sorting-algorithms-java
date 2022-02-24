package org.launchcode.algorithms.search;

/**
 * Created by Chris Bay
 */
public class BinarySearch {

    public static int search(int[] haystack, int needle) {
        return searchSubArray(haystack, needle, 0, haystack.length-1);
    }

    private static int searchSubArray(int[] haystack, int needle, int left, int right) {

        if (left == right) {
            return needle == haystack[left] ? left : -1;
        }

        int middle = left + (right - left) / 2;

        if (haystack[middle] < needle) {
            return searchSubArray(haystack, needle, middle+1, right);
        } else {
            return searchSubArray(haystack, needle, left, middle);
        }
    }

}
