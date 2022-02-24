package org.launchcode.algorithms.sort;

import org.junit.BeforeClass;

/**
 * Created by Chris Bay
 */
public class TestBubbleSort extends AbstractSortTest {

    @BeforeClass
    public static void setUp() throws NoSuchMethodException {
        Class<BubbleSort> clazz = BubbleSort.class;
        algorithm = clazz.getMethod("sort", int[].class);
    }

}
