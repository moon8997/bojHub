import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int length = score.length;
        int[] reverseSort = new int[length];
        Arrays.sort(score);
        
        for (int i = 0; i < length; i++) {
            reverseSort[i] = score[length - i - 1];
        }
        
        int temp = 0;
        
        for(int i=0; i<length; i++){
            if((i+1)%m == 0){
                answer += reverseSort[i]*m;
            }
        }
        
        
        return answer;
    }
}