class Solution {
    public String solution(String s) {
        String answer = "";
        
        int sLength = s.length();
        int middle = sLength/2;
        
        if(sLength%2==0){
            answer = s.substring(middle-1, middle+1);
        }else{
            answer = s.substring(middle, middle+1);
        }
        
        return answer;
    }
}