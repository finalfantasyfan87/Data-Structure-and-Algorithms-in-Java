package sortAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }

            }
            swap(arr, largest, lastUnsortedIndex);
        }
        return arr;
    }

    public static void swap(int[] array, int a, int b) {
        if (a == b) {
            return;
        }
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
