class Solution {
    public String solution(int age) {
        String answer = "";
        String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        String b = String.valueOf(age);
        
        for (int i = 0; i < b.length(); i++) {
            int index = b.charAt(i) - '0';
            answer += a[index];
        }
        
        return answer;
    }
}