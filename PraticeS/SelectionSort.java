package PraticeS;

public class SelectionSort {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[n];
        arr[0] = 2;
        arr[1] = 7;
        arr[2] = 4;
        arr[3] = 8;

        for(int i=0; i<n;i++){
            int pos = i;
            for(int j=i+1;j<n;j++){
                if(arr[pos] < arr[j]){
                    pos = j;
                }
            }
            int temp =arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
