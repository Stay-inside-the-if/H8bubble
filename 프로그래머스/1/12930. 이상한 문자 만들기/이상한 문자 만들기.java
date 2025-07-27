class Solution {
    public String solution(String s) {
        String answer = "";

        int index = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer += " ";
                index = 0;
            } else {
                if (index % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                index++;
            }
        }

        return answer;
    }
}