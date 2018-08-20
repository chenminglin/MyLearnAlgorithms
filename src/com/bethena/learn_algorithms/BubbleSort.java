package com.bethena.learn_algorithms;

/**
 * 思想：冒泡排序就是两两比较，把最大的值放在后面，外循环n-2次，内循环 n-1-(外循环的第几次j)
 *
 */
public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort(MyArray.INTS);
        MyArray.printArray();
    }
}
