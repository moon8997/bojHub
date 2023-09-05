class Solution {
    public long solution(int price, long money, int count) {
        long answer = -1;

        // 원래가 price
        // 처음가지고있던금액 money
        // 이용횟수. count
        
        for(int i=1; i<=count; i++){
            money = money - price*i;
        }
        
        if(money > 0){
            answer = 0;
        } else {
            answer = -money;
        }
        
        return answer;
    }
}