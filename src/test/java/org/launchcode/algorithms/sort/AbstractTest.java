package org.launchcode.algorithms.sort;

/**
 * Created by Chris Bay
 */
public abstract class AbstractTest {

    static boolean isSorted(int[] items) {
        for (int i = 0; i < items.length-1; i++) {
            if (items[i] > items[i+1]) return false;
        }
        return true;
    }

}
