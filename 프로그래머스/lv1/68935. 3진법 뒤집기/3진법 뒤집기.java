class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String n3 = Integer.toString(n, 3);
        
        String reverse = "";
        
        for(int i=n3.length()-1; i>=0; i--){
            reverse += n3.charAt(i);
        }
        
        answer= Integer.parseInt(reverse, 3);
        
        return answer;
    }
}