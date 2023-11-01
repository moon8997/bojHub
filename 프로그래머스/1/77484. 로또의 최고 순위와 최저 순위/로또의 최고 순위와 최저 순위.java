class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int min = 0;
        int zero = 0;
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(lottos[i] == win_nums[j]){
                    min++;
                    break;
                }
                if(lottos[i] == 0){
                    zero++;
                    break;
                }
                    
            }
        }
        
        System.out.println(min+zero  + " / " + min);

        answer[0] = rank(min+zero);
        answer[1] = rank(min);

        return answer;
    }
    
    
    static int rank(int a){
        switch (a) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}