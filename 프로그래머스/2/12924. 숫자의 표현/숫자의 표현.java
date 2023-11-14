class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int start = 1; start <= n; start++) {
            int sum = 0;
            for (int i = start; sum < n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break; 
                }
            }
        }

        return answer;
    }
}
