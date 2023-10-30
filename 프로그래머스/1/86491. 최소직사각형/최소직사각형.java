class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int max_w = 0;
        int min_h = 0;
        
        for(int i=0; i<sizes.length; i++){
            int a = Math.max(sizes[i][0], sizes[i][1]);
            int b = Math.min(sizes[i][0], sizes[i][1]);
            
            max_w = Math.max(max_w, a);
            min_h = Math.max(min_h, b);
        
        }
        
        answer = max_w * min_h;
        
        return answer;
    }
}