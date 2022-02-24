package org.launchcode.algorithms;

/**
 * Created by Chris Bay
 */
public class Utils {

    public static int[] slice(int[] arr, int start, int end) {
        int sliceLen = end - start;
        int[] sliced = new int[sliceLen];
        for (int i = 0; i < sliceLen; i++) {
            sliced[i] = arr[start + i];
        }
        return sliced;
    }

}
