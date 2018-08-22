package com.bethena.learn_algorithms.sort;


/**
 * 并归排序
 * 思想：把数组通过下标分为若干部分个小数组，最小的数组是两个值，只有一个值的可以不需要管。
 * 把小数组排序，最后合并到大的。
 *
 */
public class MergeSort {


    public static void sort(int[] array) {
        int[] temp = new int[array.length];
        sort(array, 0, array.length - 1, temp);
    }


    public static void sort(int[] array, int start, int end, int[] temp) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(array, start, mid, temp);
            sort(array, mid + 1, end, temp);
            merge(array, start, mid, end, temp);
        }
    }

    public static void merge(int[] array, int start, int mid, int end, int[] temp) {

        int l = start;
        int r = mid + 1;
        int i = 0;

        while (l <= mid && r <= end) {
            if (array[l] >= array[r]) {
                temp[i] = array[r++];
            } else {
                temp[i] = array[l++];
            }
            i++;
        }

        while (l <= mid) {
            temp[i++] = array[l++];
        }

        while (r <= end) {
            temp[i++] = array[r++];
        }

        i = 0;
        while (start <= end) {
            array[start] = temp[i];
            start++;
            i++;
        }

    }


    public static void main(String[] args) {

        sort(MyArray.INTS);

        MyArray.printArray(false);

    }
}
