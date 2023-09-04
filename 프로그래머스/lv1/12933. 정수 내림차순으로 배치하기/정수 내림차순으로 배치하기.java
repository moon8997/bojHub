import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String sAnswer = Long.toString(n);
        String[] sAnswerArray = sAnswer.split("");

        Arrays.sort(sAnswerArray, Collections.reverseOrder()); // 내림차순 정렬
        String temp = "";
        for(int i=0; i<sAnswerArray.length; i++){
        	temp = temp +  sAnswerArray[i];
        }
        answer = Long.parseLong(temp);
        
        return answer;
    }
}