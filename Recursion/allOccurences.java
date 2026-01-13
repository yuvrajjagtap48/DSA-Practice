package Recursion;

public class allOccurences {
    public static void linearSearch(int[] arr, int key, int end){
        if(end < 0) return; //base case

        if(arr[end] == key){
            System.out.print(end + " ");
        }
        linearSearch(arr, key, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 20 };
        int key = 20;
        linearSearch(arr, key, arr.length - 1); // starting from last
    }
}
