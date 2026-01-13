package Recursion;

public class PrintNumber {
    static String[] array = {
        "Zero", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine"
    };
    public static void main(String[] args) {
        printDigits(1234);
    }
    public static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        printDigits(n / 10);
        int digit = n % 10;
        System.out.print(array[digit] + " ");
    }
}
