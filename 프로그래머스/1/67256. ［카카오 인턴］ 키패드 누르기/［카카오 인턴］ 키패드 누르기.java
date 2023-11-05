import java.util.*;
import java.math.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[][] btnArr = new int[4][3];
        
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                btnArr[i][j] = (i*3)+j+1;
                if(btnArr[i][j] == 11){
                    btnArr[i][j] = 0;
                }
            }
        }
        
        int[] left = {3, 0};
        int[] right = {3, 2};
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<4; j++){
                if(btnArr[j][0] == numbers[i]){
                    answer += "L";
                    left = new int[]{j, 0};
                } else if(btnArr[j][2] == numbers[i]){
                    answer += "R";
                    right = new int[]{j, 2};
                } else if(btnArr[j][1] == numbers[i]){
                    int leftValue = Math.abs(j - left[0]) + Math.abs(1 - left[1]);
                    int rightValue = Math.abs(j - right[0]) + Math.abs(1 - right[1]);
                    int result = Integer.compare(leftValue, rightValue);
                    switch (result) {
                        case 1:
                            answer += "R";
                            right = new int[]{j, 1};
                            break;
                        case -1:
                            answer += "L";
                            left = new int[]{j, 1};
                            break;
                        default:
                            String temp = hand.substring(0,1).toUpperCase();
                            answer += temp;
                            if(temp.equals("L")){
                                left = new int[]{j, 1};
                            } else {
                                right = new int[]{j, 1};
                            }
                            break;
                    }
                }
                
            }
            
        }
        
        
        return answer;
    }
}