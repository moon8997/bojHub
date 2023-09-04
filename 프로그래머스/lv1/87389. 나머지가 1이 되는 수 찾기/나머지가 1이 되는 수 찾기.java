class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int n2 = n-1;
        
        for(int i=2; i<=n2; i++){
            if(n2%i == 0){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}