import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        String digitString = my_string.replaceAll("[^0-9]", "");
        
        int[] answer = new int[digitString.length()];
        
        for (int i = 0; i < digitString.length(); i++) {
            
            answer[i] = digitString.charAt(i) - '0'; 
        }
        Arrays.sort(answer);
        
        return answer;
    }
}