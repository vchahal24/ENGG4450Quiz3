import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {

    // Random Pivot
    @Test
    public void testRandomPivot() {
        Integer[] input = {5, 2, 9, 1, 7, 6, 3};
        Integer[] expected = {1, 2, 3, 5, 6, 7, 9};

        QuickSort.type = QuickSort.PIVOT_TYPE.RANDOM;
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);

        assertArrayEquals("QuickSort using a random pivot failed", expected, result);
    }

    // First Pivot
    @Test
    public void testFirstPivot() {
        Integer[] input = {5, 2, 9, 1, 7, 6, 3};
        Integer[] expected = {1, 2, 3, 5, 6, 7, 9};

        QuickSort.type = QuickSort.PIVOT_TYPE.FIRST;
        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);

        assertArrayEquals("QuickSort using a first pivot failed", expected, result);
    }

    // Empty Array case
    @Test
    public void testEmptyArray() {
        Integer[] input = {};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);

        assertEquals("QuickSort failed using empty array", 0, result.length);
    }

    // One Element
    @Test
    public void testOneElementArray() {
        Integer[] input = {22};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);

        assertArrayEquals("QuickSort failed using single element", new Integer[]{42}, result);
    }

    // Sorted Array already
    @Test
    public void testSortedArray() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input);

        assertArrayEquals("QuickSort failed using already sorted array", expected, result);
    }

    // Reverse Array
    @Test
    public void testReverseArray() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input);

        assertArrayEquals("QuickSort failed using reverse sorted array", expected, result);
    }

    // Duplicates case
    @Test
    public void testDuplicates() {
        Integer[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Integer[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};

        Integer[] result = QuickSort.sort(QuickSort.PIVOT_TYPE.MIDDLE, input);

        assertArrayEquals("QuickSort failed using duplicate elements", expected, result);
    }
}