class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for (int h = 0; h <= 10000; h++) {
            int moreThanHCount = 0, lessThanHCount = 0;

            for (int citation : citations) {
                if (citation < h) {
                    lessThanHCount++;
                } else {
                    moreThanHCount++;
                }
            }

            if (lessThanHCount < h && h <= moreThanHCount) {
                answer = h;
            }
        }
        
        return answer;
    }
}