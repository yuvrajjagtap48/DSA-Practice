package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Place a vertical tile
        int fn1 = tilingProblem(n - 1);
        // Place two horizontal tiles
        int fn2 = tilingProblem(n - 2);

        return fn1 + fn2;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
