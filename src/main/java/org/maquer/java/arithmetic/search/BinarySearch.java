package org.maquer.java.arithmetic.search;

/**
 * 二分查找算法
 * <p>
 * 注意：
 * <p>
 * 1. 整形溢出。取中位时，（最小下标+最大下标）/2，当最小下标+最大下标超出Integer.MAX_VALUE时，便会导致结果不正确。 应使用（最小下标+最大下标）>>> 1，无符号右移1位，或者最小下标 +（最大下标-最小下标）/2。 2.
 * 
 * @author xiaoma
 */
public class BinarySearch {

    public static void main(String[] args) {

    }

    public static int binarySearchIndexByWhile(final int target, int[] array) {
        int begin = 0, end = array.length - 1;
        if (array[begin] > target || array[end] < target || begin > end) {
            return -1;
        }

        int mid = 0;
        while (begin <= end) {
            mid = begin + (end - begin) / 2;
            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                begin = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearchIndexByRecursion(final int target, int[] array, final int begin, final int end) {
        if (array[begin] > target || array[end] < target || begin > end) {
            return -1;
        }
 
        int mid = begin + (end - begin) / 2;
        if (array[mid] > target) {
            return binarySearchIndexByRecursion(target, array, begin, mid - 1);
        } else if (array[mid] < target) {
            return binarySearchIndexByRecursion(target, array, mid + 1, end);
        } else {
            return mid;
        }
    }
}
