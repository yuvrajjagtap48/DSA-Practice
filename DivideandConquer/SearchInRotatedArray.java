public class SearchInRotatedArray {
    
    public static int search(int arr[], int tar, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }
        // work
        int mid = (si + ei)/ 2;     //si + (ei+si)/2

        //case Found
        if(arr[mid] == tar){
            return mid;
        }

        //mid on Line1 
        if(arr[si] <= arr[mid]){
            //case a : left part
            if(arr[si]<= tar && tar < arr[mid]){
               return search(arr, tar, si, mid);
            }
            else{
                // case b: right part
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid on Line2
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    

    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println("Target found at index: " + tarIdx);
    }
}
