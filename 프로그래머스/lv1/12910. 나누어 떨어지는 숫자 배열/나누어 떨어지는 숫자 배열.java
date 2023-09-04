import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                cnt++;
            }
            
        }
        if(cnt == 0){
            answer = new int[]{-1};
        } else {
            answer = new int[cnt];
            int idx = 0;

            // 나누어 떨어지는 원소를 결과 배열에 저장
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[idx++] = arr[i];
                }
            }
            
            
        }
        
        Arrays.sort(answer);
        
        
        return answer;
    }
}