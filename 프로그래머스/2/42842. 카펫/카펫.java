class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        for(int Height = 1; Height <= yellow; Height++) {
            for(int Width = Height; Width <= yellow; Width++) {
                if(Height * Width > yellow)
                    break;
                if(Height * Width == yellow) {
                    if((Height + 1) * 2 + (Width + 1) * 2 == brown) {
                        answer[0] = Width + 2;
                        answer[1] = Height + 2;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}