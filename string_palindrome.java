public class string_palindrome {
    public static void main(String[] args) {
        String palindrom = "happy";
        String reverse="";
       
        for(int i=palindrom.length()-1;i>=0;i--){
            reverse += palindrom.charAt(i);
        }

        if(reverse.equals(palindrom)){
            System.out.println("It is a palindrome.");
        }
            else{
            System.out.println("not a palindrome");
        }
    }
}