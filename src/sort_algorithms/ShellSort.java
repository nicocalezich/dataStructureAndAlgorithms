package sort_algorithms;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] array = {4, -22, 61, -15, 1, 9, 23, 54, 7};

        shellSort(array);

        Arrays.stream(array).forEach(System.out::println);
    }

    // shellsort es muy parecido a insertionSort, pero en este caso se define un 'gap', para que el 'shift'
    // sea cada x elementos, de esta forma podemos hacer un ordenamiento preeliminar y reducir la complejidad
    // de un ordenamiento posteriormente.
    public static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }
}
