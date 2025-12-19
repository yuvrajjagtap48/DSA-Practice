import java.util.*;

public class SelectionSorting {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {             // time complexity = O(n^2)
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }


    // print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArr(arr);
    }
}
