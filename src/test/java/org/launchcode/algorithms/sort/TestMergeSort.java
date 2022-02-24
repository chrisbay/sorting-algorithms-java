package org.launchcode.algorithms.sort;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.launchcode.algorithms.Utils.slice;

/**
 * Created by Chris Bay
 */
public class TestMergeSort extends AbstractSortTest {

    @BeforeClass
    public static void setUp() throws NoSuchMethodException {
        Class<MergeSort> clazz = MergeSort.class;
        algorithm = clazz.getMethod("sort", int[].class);
    }

    @Test
    public void testSliceAtBeginning() {
        int[] items = {1, 2, 3, 4, 5};
        int[] slice = {1, 2, 3};
        assertArrayEquals(slice, slice(items, 0, 3));
    }

    @Test
    public void testSliceAtEnd() {
        int[] items = {1, 2, 3, 4, 5};
        int[] slice = {3, 4, 5};
        assertArrayEquals(slice, slice(items, 2, 5));
    }

    @Test
    public void testSliceInMiddle() {
        int[] items = {1, 2, 3, 4, 5};
        int[] slice = {2, 3, 4};
        assertArrayEquals(slice, slice(items, 1, 4));
    }

    @Test
    public void testMergeWithSizeOneArrays() {
        int[] expected = {1, 2};
        int[] left = {1};
        int[] right = {2};
        int[] merged = MergeSort.merge(left, right);
        assertArrayEquals(expected, merged);
    }

    @Test
    public void testMergeWithSizeOneArraysBackwards() {
        int[] expected = {1, 2};
        int[] left = {2};
        int[] right = {1};
        int[] merged = MergeSort.merge(left, right);
        assertArrayEquals(expected, merged);
    }

    @Test
    public void testMergeWithEmptyLeftArray() {
        int[] expected = {2};
        int[] left = {};
        int[] right = {2};
        int[] merged = MergeSort.merge(left, right);
        assertArrayEquals(expected, merged);
    }

    @Test
    public void testMergeWithEmptyRightArray() {
        int[] expected = {1};
        int[] left = {1};
        int[] right = {};
        int[] merged = MergeSort.merge(left, right);
        assertArrayEquals(expected, merged);
    }

    @Test
    public void testMergeWithMultipleOrdered() {
        int[] expected = {1, 2, 3, 4};
        int[] left = {1, 2};
        int[] right = {3, 4};
        int[] merged = MergeSort.merge(left, right);
        assertArrayEquals(expected, merged);
    }

    @Test
    public void testMergeWithMultipleOrderedBackwards() {
        int[] expected = {1, 2, 3, 4};
        int[] left = {3, 4};
        int[] right = {1, 2};
        int[] merged = MergeSort.merge(left, right);
        assertArrayEquals(expected, merged);
    }

    @Test
    public void testMergeWithMultipleOrderedMixed() {
        int[] expected = {1, 2, 3, 4};
        int[] left = {1, 3};
        int[] right = {2, 4};
        int[] merged = MergeSort.merge(left, right);
        assertArrayEquals(expected, merged);
    }

}
