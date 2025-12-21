package String;

public class CompareString {
    public static void main(String[] args) {
        String s1= "Yuvraj";
        String s2= "Yuvraj";
        String s3= new String("Yuvraj");
// if we create a string without using new keywords it point to there old string s1 and s2 are pointing same string 
// but if we create dtring using new keyword it pointing to new string 
// for comparing this string we use .equals() 
// if we want compare base on there value then we use .equals() 
        // if(s1 == s2){
        //     System.out.println("equal ");
        // }
        // else{
        //     System.out.println("Not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("equal ");
        // }
        // else{
        //     System.out.println("Not equal");
        // }
        
        if(s1.equals(s3)){
            System.out.println("equal ");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
