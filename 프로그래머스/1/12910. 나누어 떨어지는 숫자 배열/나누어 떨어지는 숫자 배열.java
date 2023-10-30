import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answerList.add(arr[i]);
            }
        }
        
        if(answerList.size()==0){
            answerList.add(-1);
        }
        
        Collections.sort(answerList);
        
        int[] answerArray = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answerArray[i] = answerList.get(i);
        }
        
        return answerArray;
    }
}