import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            array.add(score[i]);
            Collections.sort(array, Collections.reverseOrder());
            if(i>=k){
                answer[i] = array.get(k-1);
            } else {
                answer[i] = array.get(i);
            }
            
        }

        
        
        
        return answer;
    }
}