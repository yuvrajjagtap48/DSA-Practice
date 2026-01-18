package PraticeS;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[n];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;

        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }            
        }
        System.out.println("Array in desc order");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
