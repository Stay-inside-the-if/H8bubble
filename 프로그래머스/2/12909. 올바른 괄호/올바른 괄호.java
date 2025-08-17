class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        
        if(s.charAt(0) == ')')
            return false;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(') {
                num++;
            } else if (c == ')') {
                num--;
            }
            if(num < 0)
                return false;
        }
        if (num > 0) {
                return false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}