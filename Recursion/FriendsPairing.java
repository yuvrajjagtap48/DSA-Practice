package Recursion;

public class FriendsPairing {
    public static int friendsPairing(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }

        // choice 1: single
        int fnm1 = friendsPairing(n-1);

        // choice 2: pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        int totalWays = fnm1 + pairWays;
        return totalWays;


        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);  //oneline answer
    }
    public static void main(String[] args) {
        int n = 3; 
        System.out.println(friendsPairing(n));
    }
}
