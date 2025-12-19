import java.util.*;

public class BubbleSorting {
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length - 1; turn++){     //n times
            // int swap = 0; // used for already sorted array 
            for(int j = 0; j< arr.length - 1; j++){           // n - 1 => turn   time complexity = O(n^2)  
                if(arr[j] > arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                  //  swap ++ ;   // swap is increment when array is not sorted
                }
            }

            // if (swap == 0 ){   // if swap is 0 means array is sorted
            //     break; 
            // }
        }
    }
// print array
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int arr[] = {5, 4, 1 , 3, 2};
        bubbleSort(arr);
        printArr(arr);
    }
}
