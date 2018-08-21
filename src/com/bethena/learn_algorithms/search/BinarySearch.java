package com.bethena.learn_algorithms.search;

/**
 * 二分查找法，前提是要查询有序的数组
 *
 *
 */
public class BinarySearch {

    public int search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        int mid = (low + high) / 2;

        while (low < high) {

            if (array[mid] == target) {
                return mid;
            } else if (target > array[mid]) {
                low = mid + 1;//记得这里要排除之前的mid
            } else {
                high = mid - 1;//记得这里要排除之前的mid
            }

            mid = (low + high) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = new BinarySearch().search(OrderArray.INTS, 66);

        System.out.println("index = " + index);
        if (index != -1) {
            System.out.println("target = " + OrderArray.INTS[index]);
        }

    }
}
