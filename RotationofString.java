// question 34/50..
// 19 june 
public class RotationofString {
    public static void Rotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }
        
        String combined = s1 + s1;
        if (combined.contains(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String s1 = "Mango";
        String s2 = "oMang";
        

        Rotation(s1, s2);
    }
}

        



    

