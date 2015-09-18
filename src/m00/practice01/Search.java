package m00.practice01;
/**
 * @date 18.09.2015
 * @author Edgar_000
 */
public class Search {

    /**
     * Find the first occurrence of x in sorted array a.
     *
     * @param x value to find
     * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
     * @r
     * eturn lowest i such that a[i]==x, or -1 if x not found in a.
     */
    public static int find(int x, int[] a) {
        if (isArraySorted(a)) {
            return binarySearch(x, a, 0, a.length);
        } else {
            return -1;
        }
    }

    /**
     * Recursive implementation of binary search algorithm
     *
     * @param x key element
     * @param a array of elements
     * @param from left bound of array
     * @param to right bound of array
     * @return lowest i such that a[i]==x, or -1 if x not found in a.
     */
    private static int binarySearch(int x, int[] a, int from, int to) {
        int mid = (from + to) / 2;
        if (from > to || from > a.length - 1) {
            return -1;
        } else if (x < a[mid]) {
            return binarySearch(x, a, from, mid - 1);
        } else if (x > a[mid]) {
            return binarySearch(x, a, mid + 1, to);
        } else {
            if (mid != 0 && a[mid - 1] == a[mid]) {
                return binarySearch(x, a, from, mid - 1);
            } else {
                return mid; 
            }
        }
    }

    /**
     * Checks if the Array is sorted
     *
     * @param a array of elements
     * @return is array sorted or not
     */
    public static boolean isArraySorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
