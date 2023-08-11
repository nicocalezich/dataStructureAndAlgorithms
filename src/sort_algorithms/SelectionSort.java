package sort_algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {4, -22, 61, -15, 1, 9, 23, 54, 7};

        selectionSort(array);

        Arrays.stream(array).forEach(System.out::println);

    }

    public static void selectionSort(int[] array) {
        for (int lastUnsorted = array.length - 1; lastUnsorted > 0; lastUnsorted--) {
            int max = 0;
            for (int i = 0; i <= lastUnsorted; i++) {
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            swap(array, lastUnsorted, max);
        }
    }

    public static void swap(int[] array, int lastUnsortedIndex, int maxValueIndex) {
        int temp = array[lastUnsortedIndex];
        array[lastUnsortedIndex] = array[maxValueIndex];
        array[maxValueIndex] = temp;
    }
}
