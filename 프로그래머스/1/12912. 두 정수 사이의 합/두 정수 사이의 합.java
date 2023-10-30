class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a==b){
            answer = a;
        } else if(a>b){
            while(a!=b){
                answer += b;
                b++;
            }
            answer += b;
        }else{
            while(a!=b){
                answer += a;
                a++;
            }
            answer += a;
        }
        
        return answer;
    }
}