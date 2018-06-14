package org.maquer.java.practice.online;

public class SearchNum {

    public static void main(String[] args) {
        int[] arr = { 0, 3, 6, 10, 12, 13, 14 };
        System.out.println(binarySearchIndexByWhile(6, arr));
        System.out.println((Integer.MAX_VALUE + Integer.MAX_VALUE) >>> 1);
        System.out.println(Integer.MAX_VALUE);
    }

    public static boolean find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean find1(int target, int[][] array) {
        int mid1 = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int binarySearchIndexByWhile(final int target, int[] array) {
        int begin = 0, end = array.length - 1;
        if (array[begin] > target || array[end] < target || begin > end) {
            return -1;
        }

        int mid = 0;
        while(begin <= end) {
            mid = begin + (end - begin) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                begin = mid + 1;
            }
        }

        return -1;
    }

    public static int binarySearchIndexByRecursion(final int target, int[] array, final int begin, final int end) {
        if (array[begin] > target || array[end] < target || begin > end) {
            return -1;
        }

        int mid = begin + (end - begin) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearchIndexByRecursion(target, array, begin, mid - 1);
        } else if (array[mid] < target) {
            return binarySearchIndexByRecursion(target, array, mid + 1, end);
        }

        return -1;
    }
}
