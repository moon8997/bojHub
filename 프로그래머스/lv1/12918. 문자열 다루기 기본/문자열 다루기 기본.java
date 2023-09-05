class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6)
            return false; 
        
        String[] splitS = s.split("");
        
        boolean temp = false;
        
        for(int i=0; i<splitS.length; i++){
            for(int j=0; j<=9; j++){
                if(splitS[i].equals(Integer.toString(j))) {
                    temp = true;
                    break;
                }
                
            }
            if(!temp) {
                return false;
            }
                
            temp = false;
        }
        
        return answer;
    }
}