class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String digitString = my_string.replaceAll("[^0-9]", "");
        
        for(int i = 0; i < digitString.length(); i++){
            answer += digitString.charAt(i) - '0';
        }
        return answer;
    }
}