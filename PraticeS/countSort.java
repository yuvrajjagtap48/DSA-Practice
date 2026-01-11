package PraticeS;
import java.io.*;
public class countSort {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = new int[n];
        arr[0] = 6;
        arr[1] = 7;
        arr[2] = 6;
        arr[3] = 6;
        arr[4] = 2;
        arr[5] = 4;


        

        int mx = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]> mx){
                mx = arr[i];
            }
        }
        int count[] = new int [mx+1];

        for(int i=0; i<n; i++){
            int element  = arr[i];
            count[element]++;
        }

        int k=0;
        for(int i=mx;i>=0;i--){
            int freq = count[i];
            for(int j=0;j<freq;j++){
                arr[k] = i;
                k++;
            }
        }
        System.out.println("sorted array in desc order");
        for(int  i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
