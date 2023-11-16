class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        if(n >= 2){
            dp[2] = 2;
            if(n >= 3){
                for(int i = 3; i <= n; i++){
                dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
                }
            }
            
        }
        answer = dp[n];
        return answer;
    }
}