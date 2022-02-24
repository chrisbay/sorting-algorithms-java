package org.launchcode.algorithms.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chris Bay
 */
public class TestBinarySearch {

    private int[] items = {0, 1, 2, 3, 4, 5, 6, 7, 8};

    @Test
    public void testItemNotFound() {
        int needle = 10;
        assertEquals(-1, BinarySearch.search(items, needle));
    }

    @Test
    public void testItemFound() {
        int needle = 5;
        assertEquals(5, BinarySearch.search(items, needle));
    }

    @Test
    public void testItemAtStartFound() {
        int needle = 0;
        assertEquals(0, BinarySearch.search(items, needle));
    }

    @Test
    public void testItemAtEndFound() {
        int needle = 8;
        assertEquals(8, BinarySearch.search(items, needle));
    }

    @Test
    public void testItemInMiddleFound() {
        int needle = 4;
        assertEquals(4, BinarySearch.search(items, needle));
    }

}
