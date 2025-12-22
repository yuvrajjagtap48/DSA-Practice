import java.util.*;
import java.io.*;

public class CountSort {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 7;
        arr[5] = 5;

        int mx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        int count[] = new int[mx + 1];

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            count[element]++;
        }

        int k = 0;
        
        for (int i = mx; i >= 0; i--) {
            int freq = count[i]; 
            for (int j = 0; j < freq; j++) {
                arr[k] = i;
                k++;
            }
        }
        System.out.println(" Sorted Array in descending order ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}