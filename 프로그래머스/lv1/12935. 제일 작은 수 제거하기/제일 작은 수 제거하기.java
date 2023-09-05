import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        
        answer = new int[arr.length-1];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != sortedArr[0]){
                answer[index++] = arr[i];
            }
            
        }
        
        
        return answer;
    }
}