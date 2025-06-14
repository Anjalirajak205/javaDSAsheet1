// question 28/50.
// 14 june

public class StringToInteger {
    public static int Atoi(String s){
        int result = 0;
        int length = s.length();

        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
            int digit = c - '0';
            result = result * 10 + digit;
        }
            else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "12345";
        int number = Atoi(str);
        System.out.println("Converted number is: " + number);
    }
}



            
           

        

        
        

