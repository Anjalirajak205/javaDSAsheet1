// question 29/50
// 15 june
public class SubstringSearch{
    public static int lengthOfLongestSub(String s) {
        String current = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));

            if (current.contains(ch)) {

                current = current.substring(current.indexOf(ch) + 1);
            }

            current += ch;
            maxLength = Math.max(maxLength, current.length());
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcaabcbb";
        int result = lengthOfLongestSub(input);
        System.out.println("Longest substring length: " + result);
    }
}

         
    



   

   

