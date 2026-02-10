public class MergeSort {
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] res = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;

                 
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < n){
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j<m) {
            res[k] = arr2[j];
            j++;
            k++; 
        }
        return res;
    } 

    public static int[] mergeSort(int[] arr, int si, int ei){
        //base case
        if(si == ei){
            int[] base = new int[1];
            base[0] = arr[si];
            return base;
        }
        //work 
        int mid = (si+ei)/2;
        int[] left = mergeSort(arr, si, mid);
        int[] right = mergeSort(arr, mid+1, ei);

        int res[] = mergeTwoSortedArray(left, right);
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,1,7,2,9,5};
        int[] result = mergeSort(arr1, 0, 5);
        // int[] arr2 = {2,4,6,8};

        // int[] result = mergeTwoSortedArray(arr1, arr2);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
