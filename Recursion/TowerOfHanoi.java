package Recursion;

public class TowerOfHanoi {
    static int total = 3;
    public static void toh(char src, char dest, char aux, int n){
        if(n == 0)return; // base case

        toh(src, aux, dest, n-1); // 1st faith(choti discs source -> extra tower)
        System.out.println((total - n + 1) + " Move from " + src + " tower to " + dest + " tower"); // work
        
        toh(aux, dest, src, n-1); // 2nd faith(choti discs extra tower -> destination tower)

    }
    public static void main(String[] args){
        toh('A', 'C', 'B', 3);
    }
}
