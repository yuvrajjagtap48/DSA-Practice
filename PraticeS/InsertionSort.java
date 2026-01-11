package PraticeS;

public class InsertionSort {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];
        arr[0] = 7;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 6;

        for(int i=0; i<n; i++){
            int j = i-1;
            int curr = arr[i];

            while(j>0 && arr[j]<curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
