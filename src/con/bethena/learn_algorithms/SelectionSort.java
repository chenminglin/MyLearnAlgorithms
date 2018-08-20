package con.bethena.learn_algorithms;

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
