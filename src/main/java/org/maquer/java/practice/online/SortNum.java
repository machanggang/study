package org.maquer.java.practice.online;

public class SortNum {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 3,3,3,3,3 };
        System.out.print("原始数组：");
        printArr(arr);

        System.out.print("冒泡排序升序：");
        printArr(bubbleSort1(getArrCopy(arr)));
        System.out.print("冒泡排序降序：");
        printArr(bubbleSort1(getArrCopy(arr), true));

        System.out.print("选择排序升序：");
        printArr(sort2(getArrCopy(arr)));
        System.out.print("选择排序降序：");
        printArr(sort2(getArrCopy(arr), true));

        System.out.print("插入排序升序：");
        printArr(insertionSort(getArrCopy(arr)));
        System.out.print("插入排序降序：");
        printArr(insertionSort(getArrCopy(arr), true));

        System.out.print("快速排序升序：");
        int[] arr1 = getArrCopy(arr);
        quickSort(arr1, 0, arr1.length - 1);
        printArr(arr1);
        // System.out.print("快速排序降序：");
        // printArr(insertionSort(getArrCopy(arr), true));
    }

    public static int[] getArrCopy(int[] arr) {
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        return arrCopy;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void compareAndSwap(int[] arr, int i, int j, boolean... desc) {
        if (desc != null && desc.length > 0 && desc[0]) {
            if (arr[i] < arr[j]) {
                swap(arr, i, j);
            }
        } else {
            if (arr[i] > arr[j]) {
                swap(arr, i, j);
            }
        }
    }

    /**
     * 冒泡排序，默认升序 1. 从一端开始，假设是0，用第i个和第i+1个数比较（i=0， 1， 。。。， n-1），并按照从小到大（或者从大到小）重新排序，最终第n个数就是最小（大）的数 2. 将i的取值变为0， 1， 。。。， n-2，重复步骤1，得到第n-1个数就是最小（大）的数 3. i不断变小，直到
     * 
     * @param arr
     * @param desc 是否降序
     * @return
     */
    public static int[] bubbleSort1(int[] arr, boolean... desc) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (desc != null && desc.length > 0 && desc[0]) {
                        if (arr[j] < arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    } else {
                        if (arr[j] > arr[j + 1]) {
                            swap(arr, j, j + 1);
                        }
                    }
                }
            }
        }

        return arr;
    }

    /**
     * 选择排序，默认升序
     * 
     * @param arr
     * @param desc 是否降序
     * @return
     */
    public static int[] sort2(int[] arr, boolean... desc) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                for (int j = i; j < arr.length; j++) {
                    if (desc != null && desc.length > 0 && desc[0]) {
                        if (temp < arr[j]) {
                            temp = arr[j];
                            swap(arr, i, j);
                        }
                    } else {
                        if (temp > arr[j]) {
                            temp = arr[j];
                            swap(arr, i, j);
                        }
                    }
                }
            }
        }

        return arr;
    }

    /**
     * 插入排序
     * 
     * @param arr
     * @param desc
     * @return
     */
    public static int[] insertionSort(int[] arr, boolean... desc) {
        if (arr != null && arr.length > 0) {
            int[] sort = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                sort[i] = arr[i];
                for (int j = i; j > 0; j--) {
                    if (desc != null && desc.length > 0 && desc[0]) {
                        if (sort[j] > sort[j - 1]) {
                            swap(sort, j - 1, j);
                        }
                    } else {
                        if (sort[j] < sort[j - 1]) {
                            swap(sort, j - 1, j);
                        }
                    }
                }
            }

            return sort;
        }

        return arr;
    }

    public static int[] mergeSort(int[] arr, boolean... desc) {
        if (arr != null && arr.length > 2) {
            int middle = (int) Math.floor(arr.length / 2);
            int[] arrLeft = new int[middle];
            System.arraycopy(arr, 0, arrLeft, 0, arrLeft.length);
            int[] arrRight = new int[arr.length - middle];
            System.arraycopy(arr, middle, arrRight, 0, arrRight.length);
            // TODO
        }
        return arr;
    }

    public static int[] quickSort(int[] arr, final int begin, final int end) {
        if (arr != null && arr.length > 0) {
            int left = begin;
            int right = end;
            int base = arr[left];
            while (right != left) {
                while(right > left && arr[right] >= base) {
                    right--;
                }
                swap(arr, left, right);
                while (left < right && arr[left] <= base) {
                    left++;
                }
                swap(arr, left, right);
            }

            int mid = right;
            if (begin < (mid - 1)) {
                quickSort(arr, begin, mid - 1);
            }
            if ((mid + 1) < end) {
                quickSort(arr, mid + 1, end);
            }
        }

        return arr;
    }

}
