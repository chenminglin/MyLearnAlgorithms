package com.bethena.learn_algorithms.sort;


/**
 * 选择排序就是选择最大（最小）的下标，放在前面或者后面，每次外循环后最大（最小）的值就放在一边，
 * 剩下的最为一个数组继续找出最大（最小）然后放在一边，外循环n-1次，内循环
 */
public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        sort(MyArray.INTS);
        MyArray.printArray(true);

    }
}
