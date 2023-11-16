import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> tanHash = new HashMap<>();
        
        for (int i : tangerine) {
            tanHash.put(i, tanHash.getOrDefault(i, 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(tanHash.values());
        Collections.sort(counts, Collections.reverseOrder());
        
        int selectedCount = 0;
        for (int count : counts) {
            if (selectedCount >= k) {
                break;
            }
            selectedCount += count;
            answer++;
        }
        
        return answer;
    }
}