// quest 19/50..
// 19 june .

public class Subsequence {

    public static boolean subsequence(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) 
            i++;
            j++;
        }
        return i == s1.length();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";

        if (subsequence(s1, s2)) {
            System.out.println("Yes, '" + s1 + "' is a subsequence of '" + s2 + "'");
        } else {
            System.out.println("No, '" + s1 + "' is not a subsequence of '" + s2 + "'");
        }
    }
}
