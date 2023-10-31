import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++){
            if(sosu(i))
                answer++;
        }   
        return answer;
    }
    
    static boolean sosu(int a){
        if(a==2)
            return true;
        
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i == 0)
                return false;
        }
        return true;
    }
}