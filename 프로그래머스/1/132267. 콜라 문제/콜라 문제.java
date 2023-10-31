class Solution {
    
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cnt = 0;
        
        for(;n>=a;cnt++){
            n = n-a+b;
        }
        
        
        return cnt*b;
    }
}