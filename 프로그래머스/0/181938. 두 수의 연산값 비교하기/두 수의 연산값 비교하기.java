class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int twoAB = 2 * a * b;
        
        return Math.max(ab, twoAB);
    }
}