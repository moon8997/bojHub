class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<9; j++){
                if(arr[j] == numbers[i]){
                    arr[j] = 0;
                    break;
                }
            }
        }
        
        for(int j=0; j<9; j++){
            answer += arr[j];
        }
        
        return answer;
    }
}