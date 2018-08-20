package con.bethena.learn_algorithms;

public class BubbleSort {
    public static void sort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {

            for (int j = 0; j < arrays.length - i - 1; j++) {

                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
        System.out.println("array length = " + MyArray.INTS.length);
        for (int a : MyArray.INTS) {
            System.out.print(a + " ");
        }
        System.out.print("\n");
        sort(MyArray.INTS);
        System.out.println("after sort array length = " + MyArray.INTS.length);
        for (int a : MyArray.INTS) {
            System.out.print(a + " ");
        }
    }
}
