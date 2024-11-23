import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    // Empty array case
    @Test
    public void testEmptyArray() {
        Integer[] input = {};
        Integer[] result = BubbleSort.sort(input);

        assertEquals("BubbleSort failed with empty array", 0, result.length);
    }

    // Array that is already sorted
    @Test
    public void testSortedArray() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals("BubbleSort failed with already sorted array", input, result);
    }

    // Array with one
    @Test
    public void testOneElementArray() {
        Integer[] input = {22};
        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals("BubbleSort failed with one element", new Integer[]{22}, result);
    }

    // Duplicated Array
    @Test
    public void testDuplicatesInArray() {
        Integer[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Integer[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};

        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals("BubbleSort failed with duplicate elements", expected, result);
    }

    // Reverse array
    @Test
    public void testReverseArray() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};

        Integer[] result = BubbleSort.sort(input);

        assertArrayEquals("BubbleSort failed with reverse sorted array", expected, result);
    }
}