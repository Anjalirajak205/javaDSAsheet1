// question 23/50..
// 08 june 2025

public class duplicate_string {
    public static void main(String[] args) {
        String str = "happyyy";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(newStr.indexOf(c)==-1){
                newStr += c;
                //System.out.println(c);
            }
        
    }
    System.out.println(newStr + "  ");
}
}