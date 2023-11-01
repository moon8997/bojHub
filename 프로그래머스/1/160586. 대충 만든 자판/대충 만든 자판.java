import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        List<Integer> tempList = new ArrayList<Integer>();
        
        for(int a=0; a<targets.length; a++){
            String t = targets[a];
            int cntSum = 0;
            
            for(int i=0; i<t.length(); i++){
                int tempCnt = -1;
                for(String k : keymap){
                    for(int j=0; j<k.length(); j++){ 
                        if(t.charAt(i) == k.charAt(j)){
                            if(tempCnt == -1){
                                tempCnt = j+1;
                            } else {
                                tempCnt = Math.min(j+1, tempCnt);
                            }
                        }
                    }
                    
                }
                if(tempCnt == -1) {
                	answer[a] = -1;
                	break;
                } else {
                	answer[a] += tempCnt;
                }
            }       
                
        }

        System.out.println(tempList);
        return answer;
    }
}