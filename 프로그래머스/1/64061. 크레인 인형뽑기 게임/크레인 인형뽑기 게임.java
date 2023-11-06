import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<moves.length; i++){
            int a = moves[i] - 1;
            int b = 0;
            int c = 0;
            
            int bLen = board.length;
            
            for(int j=bLen-1; j>=0; j--){
                b = bLen -1 -j;
                c = board[b][a];
                
                if(c!=0)
                    break;
            }
            System.out.println(c);
            if(c != 0){
                int d = -1;
            
                if(stack.size()>0)
                    d = stack.peek();
                else 
                    d = -1;

                if(c == d){
                    stack.pop();
                    answer = answer + 2;
                }else {
                    stack.push(c);
                }
                
                board[b][a] = 0;
            } 
            
        }
        System.out.println(stack);
        return answer;
    }
}