import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            ArrayList<Integer> arraylist = new ArrayList<Integer>();
            
            if(commands[i][0] == commands[i][1]){
                arraylist.add(array[commands[i][0]-1]);
            } else {
                for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++){           
                    arraylist.add(array[j]);
                }
            }
            
            Collections.sort(arraylist);
            
            System.out.println(arraylist);
            
            answer[i] = arraylist.get(commands[i][2]-1);
        }
        
        return answer;
    }
}