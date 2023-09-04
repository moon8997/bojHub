class Solution {
    public int[] solution(long n) {
        String sn = Long.toString(n);
        
        String[] splitSn = sn.split("");
        
        int[] answer = new int[splitSn.length];
        int j = 0;
        for(int i=splitSn.length-1; i>=0; i--){
            answer[j] = Integer.parseInt(splitSn[i]);
            j++;
        }
        
        
        
        return answer;
    }
}