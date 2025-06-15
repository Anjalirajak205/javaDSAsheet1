// question 29/50
// 15 june
public class SubstringSearch{
     public static String subString(String str, int a) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = a; i < chars.length; i++) {
            result += chars[i];
        }
        return result;
    }
    public static String subString(String str, int a, int b) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = a; i < b && i < chars.length; i++) {
            result += chars[i];
        }
        return result;
    }
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(subString(s1, 5));      // " World"
        System.out.println(subString(s1, 2, 7));   // "llo W"
       // System.out.println(subString(s1, 2, 7));   // "llo
        }
    }

         
    



   

   

