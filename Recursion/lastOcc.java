package Recursion;

public class lastOcc {
    public static void main(String[] args) {
        int array[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        int lastindex = 0;
        // itreative approach
        for(int i=0; i < array.length; i--){
            if(array[i] == key){
                lastindex = i;
                System.out.print(i + "");
            }
        }
        System.out.println(lastindex + " ");
        // recursive approach


    }
}
