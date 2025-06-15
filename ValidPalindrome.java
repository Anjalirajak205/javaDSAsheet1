public class ValidPalindrome {
   // public static boolean Palindrome(String s) {
     public static boolean Palindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static String removeChar(String str, int i) {
        return str.substring(0, i) + str.substring(i + 1);
    }
    public static boolean isValidPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            } else {
                
                String s1 = removeChar(str, l);
                String s2 = removeChar(str, r);
                return Palindrome(s1) || Palindrome(s2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "racecxar";  
        System.out.println(isValidPalindrome(s1)); 
    }
}
