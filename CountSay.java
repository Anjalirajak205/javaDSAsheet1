public class CountSay {

    static String countsay(int n) {
        String term = "1"; 

        for (int i = 2; i <= n; i++) {
            String current = "";
            int count = 1;

            for (int j = 0; j < term.length(); j++) {
                
                if (j + 1 < term.length() && term.charAt(j) == term.charAt(j + 1)) {
                    count++;
                } else {
                    current = current + count + term.charAt(j);
                    count = 1; 
                }
            }

            term = current; 
        }

        return term;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("n = " + n);
        System.out.println("The sequence of count and say is " + countsay(n));
    }
}

        
        
    
    
    

