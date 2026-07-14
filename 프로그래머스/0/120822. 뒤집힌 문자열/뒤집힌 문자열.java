class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        int index = my_string.length() - 1;
        
        while (index >= 0){
            answer = answer + my_string.charAt(index);
            index = index - 1;
        }
        return answer;
    }
}