class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split(" ", -1);

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 0) {
                answer.append(str[i].substring(0, 1).toUpperCase())
                      .append(str[i].substring(1).toLowerCase());
            }
            if (i != str.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
