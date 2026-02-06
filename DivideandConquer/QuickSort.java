// worst case time complexity: O(n^2) when the array is already sorted or reverse sorted
// worst case occures when pivot is always the smallest or lregest element 
// best case time complexity: O(n log n) when the pivot divides the array into two

public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
    }

    public static void quickSort(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }
        // work 
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); // left part
        quickSort(arr, pIdx+1, ei); // right part

    }

    public static int partition (int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for smaller element than pivot
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // swap pivot
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
