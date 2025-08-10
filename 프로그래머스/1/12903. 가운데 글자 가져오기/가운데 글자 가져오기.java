class Solution {
    public String solution(String s) {
        String answer = "";
        float n1 = s.length()/(float)2;
        int n2 = s.length()/2;
        
        if(n1 == (float)n2) {
            answer += s.charAt(n2-1);
            answer += s.charAt(n2);
        }
        else {
            answer += s.charAt(n2);
        }
        
        return answer;
    }
}