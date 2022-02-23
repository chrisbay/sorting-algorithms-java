import org.junit.Test;
import org.launchcode.algorithms.sort.BubbleSort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Chris Bay
 */
public class TestBubbleSort {

    private static boolean isSorted(int[] items) {
        for (int i = 0; i < items.length-1; i++) {
            if (items[i] > items[i+1]) return false;
        }
        return true;
    }

    @Test
    public void testBubbleSortDoesNotModifySortedArray() {
        int[] items = {1, 2, 3, 4, 5};
        int[] copy = items.clone();
        BubbleSort.sort(items);
        assertArrayEquals(copy, items);
    }

    @Test
    public void testBubbleSortWithBackwardsArray() {
        int[] items = {5, 4, 3, 2, 1};
        BubbleSort.sort(items);
        assertTrue(isSorted(items));
    }

    @Test
    public void testBubbleSortWithMostlySortedArray() {
        int[] items = {1, 2, 3, -1, -4};
        BubbleSort.sort(items);
        assertTrue(isSorted(items));
    }

    @Test
    public void testBubbleSortWithUnsortedItemAtEnd() {
        int[] items = {1, 2, 3, 4, -1};
        BubbleSort.sort(items);
        assertTrue(isSorted(items));
    }

    @Test
    public void testBubbleSortWithUnsortedItemAtBeginning() {
        int[] items = {5, 1, 2, 3, 4};
        BubbleSort.sort(items);
        assertTrue(isSorted(items));
    }

}
