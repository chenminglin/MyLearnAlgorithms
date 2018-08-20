package com.bethena.learn_algorithms;

/**
 * 直接插入排序思路：
 *
 * 取从第二个值开始，与前面的数组比较，前面的值只要大于这个值就往后面移位，直到小于这个值为止为一次循环。
 * 外循环为取值的个数，从第二个值开始，即n-2次
 * 内循环为位移的次数。
 *
 */
public class InsertionSort {

    public void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                    index = j;
                } else {
                    break;
                }
            }
            array[index] = temp;
        }

    }

    public static void main(String[] args) {
        new InsertionSort().sort(MyArray.INTS);
        MyArray.printArray(true);
    }

}
