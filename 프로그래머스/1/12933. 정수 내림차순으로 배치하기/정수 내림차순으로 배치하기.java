import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String a = n + "";
        
        String[] arr = new String[a.length()];
        
        for(int i=0; i<a.length(); i++){
            arr[i] = String.valueOf(a.charAt(i));
        }
        
        Arrays.sort(arr, Comparator.reverseOrder());
        
        String b = "";
        
        for(int i=0; i<arr.length; i++){
            b += arr[i];
        }
        
        answer = Long.parseLong(b);
        
        return answer;
    }
}