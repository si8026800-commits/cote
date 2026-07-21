class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            String ch = String.valueOf(my_string.charAt(i));
            
            if (!answer.contains(ch)) {
                answer += ch;
            }
        }
        
        return answer;
    }
}