package PraticeS.Session19;

public class KeyPadCombinations {
    static String keys[] = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    static void solve(String digits, int index, String curr) {

        if (index == digits.length()) {
            System.out.println(curr);
            return;
        }

        String letters = keys[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            solve(digits, index + 1, curr + letters.charAt(i));
        }
    }

    public static void main(String[] args) {
        String digits = "2";
        solve(digits, 0, "");
    }

}
