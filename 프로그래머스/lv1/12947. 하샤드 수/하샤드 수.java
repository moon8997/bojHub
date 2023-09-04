class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int temp = 0;
        int x2 = x;
        while(true){
            
            temp += x2%10;
            x2 = (int)Math.floor(x2/10);
            if(x2<10){
                temp += x2;
                break;
            }
        }
        
        if(x%temp != 0){
            answer = false;
        }
        
        
        return answer;
    }
}