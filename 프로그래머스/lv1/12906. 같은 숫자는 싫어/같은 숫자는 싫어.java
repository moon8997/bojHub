import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> arrayList = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arrayList.size() == 0 || arrayList.get(arrayList.size() - 1) != arr[i]) {
				arrayList.add(arr[i]);
			}
		
		}
		
		answer = new int[arrayList.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = arrayList.get(i);
		}

        return answer;
    }
}