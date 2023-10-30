class Solution {
    public int[] solution(long n) {
        String sn = Long.toString(n);
        int length = sn.length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}