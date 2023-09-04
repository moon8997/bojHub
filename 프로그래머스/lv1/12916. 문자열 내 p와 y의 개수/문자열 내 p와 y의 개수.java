class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        
        String[] sS = s.split("");
        
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i=0; i<sS.length; i++){
            if(sS[i].equals("p"))
                pCnt++;
            else if(sS[i].equals("y"))
                yCnt++;
        }
        
        if(pCnt!=yCnt){
            answer = false;
        }
        
        return answer;
    }
}