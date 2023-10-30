class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toUpperCase();

        int pCnt = 0;
        int yCnt = 0;
        
        for(int i=0; i<s.length(); i++){
            
            String a = String.valueOf(s.charAt(i));
            
            if(a.equals("P")){
                pCnt++;
            } else if(a.equals("Y")){
                yCnt++;
            }
        }
        
        if(pCnt != yCnt){
            answer = false;
        }
        
        return answer;
    }
}