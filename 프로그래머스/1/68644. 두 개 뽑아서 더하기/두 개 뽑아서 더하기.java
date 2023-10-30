import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        HashSet<Integer> sumSet = new HashSet<Integer>();
        
        int length = numbers.length;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                int sum = numbers[i]+numbers[j];
                if(!sumSet.contains(sum)){
                    array.add(sum);
                    sumSet.add(sum);
                }
            }
        }
        Collections.sort(array);
        
        answer = new int[array.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}