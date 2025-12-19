import java.io.*;

public class printAllSubArrays {
    
    public static void main(String[] args) {
        int n=4;
        int arr[] = new int[n];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 14;
        arr[3] = 7; 
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
}
