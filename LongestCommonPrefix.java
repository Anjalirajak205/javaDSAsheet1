public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        
        if(words.length==0){
            System.out.println("");
            }
            String pre = words[0];
            for(int i=1;i<words.length;i++){
                while(!words[i].startsWith(pre)){
                    pre = pre.substring(0,pre.length()-1);
                    if(pre.isEmpty()){
                        System.out.println("");
                        return;
                        }
                        }
                        }
                        System.out.println( "Longest Common Prefix: " +pre);
                    }
                        }


                    
                    
                    
                    
            
        
        
    

