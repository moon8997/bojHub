class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        boolean isFirstChar = true;

        for (char currentChar : s.toCharArray()) {
            if (Character.isWhitespace(currentChar)) {
                isFirstChar = true;
                answer.append(currentChar);
            } else {
                if (isFirstChar) {
                    answer.append(Character.toUpperCase(currentChar));
                } else {
                    answer.append(Character.toLowerCase(currentChar));
                }
                isFirstChar = false;
            }
        }

        return answer.toString();
    }
}
