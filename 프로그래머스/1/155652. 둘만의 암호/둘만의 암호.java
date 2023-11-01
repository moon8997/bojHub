import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] sChar = s.toCharArray();
        char[] skipChar = skip.toCharArray();
        
        for (int i = 0; i < sChar.length; i++) {
            char c1 = sChar[i];
            for(int j=1; j<=index; j++){
                for (int k=0; k<skipChar.length; k++){
                    if((c1 + j) > 'z'){
                        c1 = (char)(c1-26);
                    }
                    System.out.println(k+" " + (char)(c1 + j));
                    if ((char)(c1 + j) == skipChar[k]) {
                        System.out.println(" ");
                        c1 = (char)(c1 + 1);
                        k=-1;
                    } 
                }
            }
            
            if(c1+index > 'z'){
                answer += String.valueOf((char)(c1+index-26));
            } else {
                answer += String.valueOf((char)(c1+index));
            }
            
        }
        
        
        return answer;
    }
}