package org.launchcode.algorithms.sort;

import org.junit.BeforeClass;

/**
 * Created by Chris Bay
 */
public class TestInsertionSort extends AbstractSortTest {

    @BeforeClass
    public static void setUp() throws NoSuchMethodException {
        Class<InsertionSort> clazz = InsertionSort.class;
        algorithm = clazz.getMethod("sort", int[].class);
    }

}
