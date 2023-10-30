import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1){
            answer = new int[]{-1};
            return answer;
        }
   
        int min = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(min != arr[i]){
                answerList.add(arr[i]);
            }
        }
        
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}