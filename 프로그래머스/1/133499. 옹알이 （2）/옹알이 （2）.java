class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] a = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }
            

            for(int j=0; j<a.length; j++){
                
                babbling[i] = babbling[i].replace(a[j], " ");
                
                
            }
            babbling[i] = babbling[i].replace(" ", "");
            
            if(babbling[i].length() == 0){
                answer++;
            }
        }
        
        return answer;
    }
}