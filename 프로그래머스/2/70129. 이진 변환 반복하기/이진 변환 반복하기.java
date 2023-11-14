class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zeroCnt = 0;

        while(!s.equals("1")){
            String[] arr = s.split("");
            int temp = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i].equals("0")){
                    temp++;
                }
            }
            zeroCnt += temp;
            cnt++;

            s = Integer.toBinaryString(arr.length - temp);
        }

        int[] answer = {cnt, zeroCnt};
        
        return answer;
    }
}