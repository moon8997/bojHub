class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a<b){
            while(true){
                answer += a;
                a++;
                if(a>b) break;
            }
        } else if (a>b){
            while(true){
                answer += b;
                b++;
                if(a<b) break;
            }
        } else {
            answer = (long)a;
        }
        
        return answer;
    }
}