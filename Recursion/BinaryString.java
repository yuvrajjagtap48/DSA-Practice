package Recursion;

public class BinaryString {
    public static void printbitString(int n, int lastPlace,String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // work
        // sit 0 on chair n
        printbitString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
        printbitString(n - 1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printbitString(3, 0, "");
    }

}
