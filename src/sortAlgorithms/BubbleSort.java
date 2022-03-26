package sortAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

       System.out.println(Arrays.toString(bubblesort(intArray)));
    }

//    bubblesort is a stable algorithm because if both indexes are the
//    same when checking in the inner loop, you dont swap them due
//    because an element of the same value is equal
//    however changing the loop condition to include >= causes this stable algorithm
//     to become unstable

    public static int[] bubblesort(int[] myArr) {

        for (int lastUnsortedIndex = myArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (myArr[i] > myArr[i + 1]) {
                    swap(myArr, i, i + 1);
                }
            }
        }
        return myArr;
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


