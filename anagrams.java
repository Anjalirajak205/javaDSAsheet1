// qyestrion 25/50..
// 12 june. 

import java.util.HashMap;
import java.util.Map;
public class anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        if(isAnagram(str1,str2)){
            System.out.println("They are anagrams");
            }
            else{
                System.out.println("They are not anagrams");
                }
                }
                public static boolean isAnagram(String str1, String str2) {
                    if (str1.length() != str2.length()) {
                        return false;
                    }

                    Map<Character,Integer> map = new HashMap<>();
                    for(char c: str1.toCharArray()){
                        map.put(c,map.getOrDefault(c,0)+1);
                        }
                        for(char c: str2.toCharArray()){
                            if (!map.containsKey(c) || map.get(c) == 0) {
                                return false;
                                }
                                map.put(c,map.get(c)-1);
                                }
                                return true;
                            }

                    }
                



        
        
        

        




    
    

