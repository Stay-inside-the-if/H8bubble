import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0, 0};
        int gcd = 1;
        
        for(int i = 1; i <= Math.min(n,m); i++) {
            if(m % i == 0 && n % i == 0)
                gcd = i;
        }
        answer[0] = gcd;
        answer[1] = n * m / gcd;
        
        return answer;
    }
}