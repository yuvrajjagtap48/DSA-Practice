package PraticeS;

public class stringAnagram {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i=0; i<str1.length(); i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            freq[ch1 - 'a']++;
            freq[ch2 - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}
