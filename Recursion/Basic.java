package Recursion;

public class Basic {
    // Descresing nummber
    // public static void printDec(int n){
    //     if(n==1){
    //         System.out.println(1);
    //         return;
    //     }
    //     System.out.print(n +"  ");
    //     printDec(n-1);
    // }
    // incresing number
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }

    // Check sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }


    // find first Occurrence
    public static int fistOcuurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fistOcuurence(arr, key, i+1);
    }

    // Last Occurrence 
    public static int lastOcuurence (int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcuurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    // print Power
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        // int n = 10;
        // printDec(n);
        // printInc(n);
        // int arr[] = {1,2,7,5,8,6,7,3,4,6,8,4,5,6,3};
        System.out.println(power(5, 2));
    }
}
