import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        ArrayList<Integer> array = new ArrayList<>();
        
        Arrays.sort(nums);
        array.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                array.add(nums[i]);
            }
        }
        if(nums.length/2 >= array.size()){
            answer = array.size();
        } else {
            answer = nums.length/2;
        }
        
        return answer;
    }
}