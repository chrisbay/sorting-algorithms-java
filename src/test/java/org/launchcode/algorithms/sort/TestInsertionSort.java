package org.launchcode.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Chris Bay
 */
public class TestInsertionSort extends AbstractTest {

    @Test
    public void testInsertionSortWithSortedArray() {
        int[] items = {1, 2, 3, 4, 5};
        int[] sorted = InsertionSort.sort(items);
        assertArrayEquals(items, sorted);
    }

    @Test
    public void testInsertionSortWithBackwardsArray() {
        int[] items = {5, 4, 3, 2, 1};
        int[] sorted = InsertionSort.sort(items);
        assertTrue(isSorted(sorted));
    }

    @Test
    public void testInsertionSortWithMostlySortedArray() {
        int[] items = {2, 3, 1, 4, 5};
        int[] sorted = InsertionSort.sort(items);
        assertTrue(isSorted(sorted));
    }

    @Test
    public void testBubbleSortWithUnsortedItemAtEnd() {
        int[] items = {2, 3, 4, 5, 1};
        int[] sorted = InsertionSort.sort(items);
        assertTrue(isSorted(sorted));
    }

    @Test
    public void testBubbleSortWithUnsortedItemAtBeginning() {
        int[] items = {5, 1, 2, 3, 4};
        int[] sorted = InsertionSort.sort(items);
        assertTrue(isSorted(sorted));
    }

}
