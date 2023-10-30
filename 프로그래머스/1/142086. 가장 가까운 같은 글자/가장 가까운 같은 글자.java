import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character, Integer> lastIndexMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            if(lastIndexMap.containsKey(a)){
                answer[i] = i-lastIndexMap.get(a);
            } else {
                answer[i] = -1;
            }
            lastIndexMap.put(a, i);
        }
        
        return answer;
    }
}