package PraticeS;

public class InversionCount {
    // public static int countInversions(int[] arr){
    //     int count = 0;
    //     for(int i=0; i<arr.length-1; i++){
    //         int ele = arr[i];
    //         for(int j=i-1; j>=0; j--){
    //             if(arr[j] > ele){
    //                 count ++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    // worst approach it's time complexity: O(n^2)  space complexity: O(1) 

    static int count = 0;

    public static int[] mergeTwoSortedArray(int[] left, int[] right){
        int n = left.length;
        int m = right.length;

        int[] res = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m){
            if(left[i] < right[j]){
                res[k] = left[i];
                i++;

                 
            } else {
                res[k] = right[j];
                count += (n-i);
                j++;
            }
            k++;
        }
        while(i < n){
            res[k] = left[i];
            i++;
            k++;
        }
        while (j<m) {
            res[k] = right[j];
            j++;
            k++; 
        }
        return res;
    } 
    
    public static int[] countInversions(int[] arr, int si, int ei ){
        //base case
        if(si == ei){
            int[] base = new int[1];
            base[0] = arr[si];
            return base;
        }
        //work 
        int mid = (si+ei)/2;
        int[] left = countInversions(arr, si, mid);
        int[] right = countInversions(arr, mid+1, ei);

        int res[] = mergeTwoSortedArray(left, right);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        countInversions(arr, 0, arr.length-1);
        System.out.println("Number of inversions: " + count);
    }
}
