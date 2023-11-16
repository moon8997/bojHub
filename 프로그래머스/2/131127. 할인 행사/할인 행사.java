import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        ArrayList<String> arr = new ArrayList<>(); 
        
        for(int i=0; i< want.length; i++){
            for(int j=0; j<number[i]; j++){
                arr.add(want[i]);
            }
        }
        
        Collections.sort(arr);
        
        for(int i=0; i<discount.length-9; i++){
            ArrayList<String> arr2 = new ArrayList<>(); 
            for(int j=0; j<10; j++){
                arr2.add(discount[i+j]);
            }
            Collections.sort(arr2);
            if (arr.equals(arr2)) {
                answer++;
            }
        }
        
        return answer;
    }
}