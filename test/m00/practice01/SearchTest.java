package m00.practice01;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Edgar_000
 */
public class SearchTest {

    @Test
    /**
     * Test binary search on even element count in array Array [3, 4, 5, 6, 7,
     * 8], key = 5 Expected = 2
     */
    public void testBinarySeachOnSortedEven() {
        int[] testArray = new int[]{3, 4, 5, 6, 7, 8};
        int testKey = 5;
        int expected = 2;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test binary search on odd element count in array Array [2, 3, 4, 5, 77,
     * 98, 321], key = 5 Expected = 3
     */
    public void testBinarySeachOnSortedOdd() {
        int[] testArray = new int[]{2, 3, 4, 5, 77, 98, 321};
        int testKey = 5;
        int expected = 3;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test binary search on non sorted array Array [13, 4, 5, 56, 7, 8], key =
     * 5 Expected = -1
     */
    public void testBinarySeachOnNotSorted() {
        int[] testArray = new int[]{13, 4, 5, 56, 7, 8};
        int testKey = 5;
        int expected = -1;
        Assert.assertTrue("Test case to search not existing element should return -1", Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test binary search on non key that is not in the array Array [1, 4, 5,
     * 56, 67, 77, 897], key = 999 Expected = -1
     */
    public void testBinarySeachNoElementFound() {
        int[] testArray = new int[]{1, 4, 5, 56, 67, 77, 897};
        int testKey = 999;
        int expected = -1;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test binary search on key thats in the middle of Array [3, 4, 5, 66, 77,
     * 98, 321], key = 66 Expected = 3
     */
    public void testBinarySearchOnMiddle() {
        int[] testArray = new int[]{3, 4, 5, 66, 77, 98, 321};
        int testKey = 66;
        int expected = 3;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test binary search on key that is at the beginning of Array [3, 4, 5, 66,
     * 77, 98, 321], key = 3 Expected = 0
     */
    public void testBinarySearchOnLeft() {
        int[] testArray = new int[]{3, 4, 5, 66, 77, 98, 321};
        int testKey = 3;
        int expected = 0;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test binary search on key that is in the end of Array [3, 4, 5, 66, 77,
     * 98, 321], key = 321 Expected = 6
     */
    public void testBinarySearchOnRight() {
        int[] testArray = new int[]{3, 4, 5, 66, 77, 98, 321};
        int testKey = 321;
        int expected = testArray.length - 1;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test method that checks if array is sorted on sorted Array Array = [1, 3,
     * 66, 888] Expected = true
     */
    public void testIsSortedArrayOnSorted() {
        int[] a = new int[]{1, 3, 66, 888};
        Assert.assertTrue(Search.isArraySorted(a));
    }

    @Test
    /**
     * Test method that checks if array is sorted on unsorted Array
     *
     * @Array = [13,3, 66, 888]
     * @Expected = false
     */
    public void testIsSortedArrayOnNotSorted() {
        int[] a = new int[]{13, 3, 66, 888};
        Assert.assertFalse(Search.isArraySorted(a));
    }

    @Test
    /**
     * Test method that checks if binary search return lowest possible index of
     * key element
     *
     * @Array = [1, 1, 3, 3, 66, 888]
     * @Key = 1
     * @Expected = 0
     */
    public void testLowestIndexLeft() {
        int[] testArray = new int[]{1, 1, 3, 3, 66, 888};
        int testKey = 1;
        int expected = 0;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test method that checks if binary search return lowest possible index of
     * key element
     *
     * @Array = [1, 1, 3, 3, 888, 888]
     * @Key = 888
     * @Expected = 4
     */
    public void testLowestIndexRight() {
        int[] testArray = new int[]{1, 1, 3, 3, 888, 888};
        int testKey = 888;
        int expected = testArray.length - 2;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

    @Test
    /**
     * Test method that checks if binary search return lowest possible index of
     * key element if one of key element is in middle
     *
     * @Array = [1, 1, 3, 3, 3, 888, 888]
     * @Key = 3
     * @Expected = 2
     */
    public void testLowestIndexMiddle() {
        int[] testArray = new int[]{1, 1, 3, 3, 3, 888, 888};
        int testKey = 3;
        int expected = 2;
        Assert.assertTrue(Search.find(testKey, testArray) == expected);
    }

}
