import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int[] temp = new int[10];
        
        for(int i=0; i<10; i++){
            temp[i] = i;
        }
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<10; j++){
                if(numbers[i] == temp[j]){
                    temp[j] = 0;
                    break;
                }
            }
        }
        answer = Arrays.stream(temp).sum();
        
        return answer;
    }
}