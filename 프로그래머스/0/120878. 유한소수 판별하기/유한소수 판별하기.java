class Solution {
    public int solution(int a, int b) {
        int gcd = getGCD(a, b);
        
        b /= gcd;
        
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        
        return b == 1 ? 1 : 2;
    }
    
    private int getGCD(int num1, int num2) {
        if (num2 == 0) return num1;
        return getGCD(num2, num1 % num2);
    }
}