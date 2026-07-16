import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        
        Map<String, Character> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            
            morseMap.put(morse[i], (char)('a' + i));
        }
        
        
        StringBuilder answer = new StringBuilder();
        
        String[] letters = letter.split(" ");
        
        for (String word : letters) {
            answer.append(morseMap.get(word));
        }
        
        return answer.toString();
    }
}