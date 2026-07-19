import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] tokens = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("Z")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        for (int num : stack) {
            answer += num;
        }
        
        return answer;
    }
}