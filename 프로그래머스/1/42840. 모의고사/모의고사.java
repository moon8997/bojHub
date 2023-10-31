import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int first = 0;
        int second = 0;
        int third = 0;
        
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<answers.length; i++){
            
            if(answer1[i%answer1.length] == answers[i]){
                first++;
            }
            if(answer2[i%answer2.length] == answers[i]){
                second++;
            } 
            if(answer3[i%answer3.length] == answers[i]){
                third++;
            }
            
        }
        
        int top = Math.max(Math.max(first, second), third);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        if(top == first)
            result.add(1);
        if(top == second)
            result.add(2);
        if(top == third)
            result.add(3);
        
        int[] answer = new int[result.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}