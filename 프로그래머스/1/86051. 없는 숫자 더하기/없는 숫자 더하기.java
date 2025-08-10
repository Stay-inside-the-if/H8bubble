class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int i;
        int j;
        
        answer = 0;
        for(i = 0; i < 10; i++) {
            for(j = 0; j < numbers.length; j++) {
                if(numbers[j] == i)
                    break;
            }
            if(j == numbers.length)
                answer += i;
        }
        return answer;
    }
}