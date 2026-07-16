class Solution {
    public int solution(int hp) {
        
        int a = hp / 5;
        int b = hp % 5;
        
        int c = b / 3;
        b = b % 3;
        
        int work = b;
        return a + c + work;
    }
}