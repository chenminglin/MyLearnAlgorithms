package com.bethena.learn_algorithms.sort;

public class MyArray {

    public final static int[] INTS = {43, 19, 80, 22, 21, 3, 56, 7, 85, 1, 29, 44, 52, 21, 23, 87, 32};


    public static void printArray() {
        printArray(false);
    }

    public static void printArray(boolean isShowIndex) {
        System.out.println("after sort array length = " + INTS.length);
        for (int i = 0; i < INTS.length; i++) {
            System.out.print(INTS[i]);
            if (isShowIndex) {
                System.out.print("[" + i + "]");
            }
            System.out.print(" ");
        }
    }
}
