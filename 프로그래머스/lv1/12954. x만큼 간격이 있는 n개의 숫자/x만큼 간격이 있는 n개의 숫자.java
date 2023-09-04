class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long x2 = x;

        for(int i=0; i<answer.length; i++){
            answer[i] = x2;
            x2 = x2+x;
        }
        
        return answer;
    }
}