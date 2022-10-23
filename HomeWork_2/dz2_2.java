package HomeWork_2;

import java.util.Arrays;

public class dz2_2 {
    public static void main(String[] params) {
        int[] array = new int[] {17, 2, 33, 11, 1, 7, 17};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }
}
