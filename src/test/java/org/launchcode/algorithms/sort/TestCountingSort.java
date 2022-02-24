package org.launchcode.algorithms.sort;

import org.junit.BeforeClass;

/**
 * Created by Chris Bay
 */
public class TestCountingSort extends AbstractSortTest {

    @BeforeClass
    public static void setUp() throws NoSuchMethodException {
        Class<CountingSort> clazz = CountingSort.class;
        algorithm = clazz.getMethod("sort", int[].class);
    }

}
