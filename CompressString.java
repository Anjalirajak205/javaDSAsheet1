// quest 31/50..
// 16 june 

public class CompressString {
    public static void main(String[] args) {
        String str ="hhheeelllooo ";
        StringBuilder newStr = new StringBuilder();
        int count =1;
        //String str1="";
       for(int i=1;i<str.length();i++){
        if(str.charAt(i)==str.charAt(i-1)){
            count++;
        }
        else{
            newStr.append(str.charAt(i-1)).append(count);
            count = 1;
        }
    }
        System.out.println("Compressed string:"+newStr);

    }
}
    


    

