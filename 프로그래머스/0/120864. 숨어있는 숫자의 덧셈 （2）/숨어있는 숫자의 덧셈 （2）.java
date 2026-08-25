class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int currentNum = 0;
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } else {
                answer += currentNum;
                currentNum = 0;
            }
        }
        answer += currentNum;
        
        return answer;
    }
}