class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean isTrue = false;
        
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                isTrue = n >= m;
            } else if (eq.equals("!")) {
                isTrue = n > m;
            }
        } else if (ineq.equals("<")) {
            if (eq.equals("=")) {
                isTrue = n <= m;
            } else if (eq.equals("!")) {
                isTrue = n < m;
            }
        }
        
        return isTrue ? 1 : 0;
    }
}