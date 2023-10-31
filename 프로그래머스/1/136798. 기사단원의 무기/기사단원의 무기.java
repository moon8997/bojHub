import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] powerList = new int[number];
        
        for (int j = 1; j <= number; j++) {
            for (int i = 1; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    if (j / i == i) {
                        powerList[j - 1]++;
                    } else {
                        powerList[j - 1] += 2;
                    }
                }
            }
        }

        
        for(int i=0; i<powerList.length; i++){
            if(powerList[i] > limit){
                answer += power;
            } else {
                answer += powerList[i];
            }
            
        }
        
        return answer;
    }
}