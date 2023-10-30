class Solution {
    public int solution(String s) {
        int answer = 0;
        String sAnswer = "";
        String temp = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 48 && s.charAt(i)<=57){
                sAnswer += String.valueOf(s.charAt(i));
            } else {
                temp += String.valueOf(s.charAt(i));
            }
            
            if(temp.equals("zero")){
                sAnswer += "0";
                temp = "";
            } else if(temp.equals("one")){
                sAnswer += "1";
                temp = "";
            } else if(temp.equals("two")){
                sAnswer += "2";
                temp = "";
            } else if(temp.equals("three")){
                sAnswer += "3";
                temp = "";
            } else if(temp.equals("four")){
                sAnswer += "4";
                temp = "";
            } else if(temp.equals("five")){
                sAnswer += "5";
                temp = "";
            } else if(temp.equals("six")){
                sAnswer += "6";
                temp = "";
            } else if(temp.equals("seven")){
                sAnswer += "7";
                temp = "";
            } else if(temp.equals("eight")){
                sAnswer += "8";
                temp = "";
            } else if(temp.equals("nine")){
                sAnswer += "9";
                temp = "";
            }
            
        }
        
        answer = Integer.parseInt(sAnswer);
        
        return answer;
    }
}