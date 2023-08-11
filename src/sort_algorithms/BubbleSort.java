package sort_algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {4, -22, 61, -15, 1, 9, 23, 54, 7};

        bubbleSort(array);

        Arrays.stream(array).forEach(System.out::println);

    }

    public static void bubbleSort(int[] array) {
        for (int lastUnsortedValue = array.length - 1; lastUnsortedValue > 0; lastUnsortedValue--) {
            for (int i = 0; i < lastUnsortedValue; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
