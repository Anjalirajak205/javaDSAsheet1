public class CountSay {

    public static void main(String[] args) {
        int n = 4;
        System.out.println("n = " + n);
        System.out.println("The sequence of count and say is " + countsay(n));
    }

    static String countsay(int n) {
        String term = "1"; // First term of the sequence

        for (int i = 2; i <= n; i++) {
            String current = "";
            int count = 1;

            for (int j = 0; j < term.length(); j++) {
                // Count how many times the current digit repeats
                if (j + 1 < term.length() && term.charAt(j) == term.charAt(j + 1)) {
                    count++;
                } else {
                    // Add count and digit to the result string
                    current = current + count + term.charAt(j);
                    count = 1;
                }
            }

            term = current; // Update term to the newly generated one
        }

        return term;
    }
}

        
        
    
    
    

