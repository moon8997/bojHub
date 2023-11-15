import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        HashSet<String> usedWords = new HashSet<>();
        
        String start = String.valueOf(words[0].charAt(words[0].length()-1));
        usedWords.add(words[0]);
        int tmp = 0;
        for(int i=1; i<words.length; i++){
            String word = words[i];
            String s = String.valueOf(word.charAt(0));
            
            if(s.equals(start) && !usedWords.contains(word) ){
                usedWords.add(word);
                start = String.valueOf(word.charAt(word.length()-1));
            } else {
                tmp = i;
                break;
            }
            
        }
        
        System.out.println(usedWords);
        if (tmp > 0) {
            answer[0] = (tmp % n) + 1;
            answer[1] = (tmp / n) + 1;
        }
        return answer;
    }
}