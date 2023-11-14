class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toBinaryString(n);
        int nCnt = cnt(a);

        int i = 0;
        int cnt = 0;
        while(nCnt != cnt){
            i++;
            cnt = cnt(Integer.toBinaryString(n+i));
        }
        answer = n+i;
        return answer;

    }

    static int cnt(String a){
        int cnt = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '1'){
                cnt++;
            }
        }
        return cnt;
    }

}