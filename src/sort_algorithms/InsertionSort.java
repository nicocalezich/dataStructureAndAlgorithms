package sort_algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {4, -22, 61, -15, 1, 9, 23, 54, 7};

        insertionSort(array);

        Arrays.stream(array).forEach(System.out::println);
    }

    public static void insertionSort(int[] array) {
        /* asumimos que el elemento 0 ya se encuentra dentro de la zona ordenada del array
        por eso comienza a iterar en el index 1
         */
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }

}
