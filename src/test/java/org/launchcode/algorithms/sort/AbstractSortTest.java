package org.launchcode.algorithms.sort;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Chris Bay
 */
public abstract class AbstractSortTest {

    final int[] expected = {1, 2, 3, 4, 5};
    static Method algorithm = null;

    private void sortAndAssert(int[] items) throws InvocationTargetException, IllegalAccessException {
        int[] sorted = (int[]) algorithm.invoke(null, items);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithSortedArray() throws InvocationTargetException, IllegalAccessException {
        int[] items = {1, 2, 3, 4, 5};
        sortAndAssert(items);
    }

    @Test
    public void testSortWithBackwardsArray() throws InvocationTargetException, IllegalAccessException {
        int[] items = {5, 4, 3, 2, 1};
        sortAndAssert(items);
    }

    @Test
    public void testSortWithMostlySortedArray() throws InvocationTargetException, IllegalAccessException {
        int[] items = {3, 4, 5, 2, 1};
        sortAndAssert(items);
    }

    @Test
    public void testSortWithUnsortedItemAtEnd() throws InvocationTargetException, IllegalAccessException {
        int[] items = {2, 3, 4, 5, 1};
        sortAndAssert(items);
    }

    @Test
    public void testSortWithUnsortedItemAtBeginning() throws InvocationTargetException, IllegalAccessException {
        int[] items = {5, 1, 2, 3, 4};
        sortAndAssert(items);
    }

}
