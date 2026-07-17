class Solution {
    public int solution(int[] numbers, int k) {
        
        int a = ((k - 1) * 2) % numbers.length;
        return numbers[a];
    }
}