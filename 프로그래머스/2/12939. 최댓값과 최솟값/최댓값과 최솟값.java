class Solution {
    public String solution(String s) {
        String answer = "";
        String temp[] = s.split(" ");
        int nums[] = new int[temp.length];
        int min = 9999;
        int max = -9999;
        
        for(int i = 0; i < temp.length; i++){
            nums[i] = Integer.parseInt(temp[i]);
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            } 
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        answer += min + " " +  max;
        
        return answer;
    }
}