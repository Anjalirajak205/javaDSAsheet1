// quest 31/50..
//  16 june 

public class CompressString {
    public static int compress(char[] chars) {
        int index = 0; // Write pointer
        int i = 0;     // Read pointer

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; 
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'h', 'h', 'e', 'e', 'e', 'l', 'l', 'l', 'o', 'o', 'o'};
        int newLength = compress(chars);

        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
    }
}
