class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);
        
        answer = -1;
        if(n == sqrt*sqrt) {
            answer = (sqrt+1)*(sqrt+1);
        }
        return answer;
    }
}