class Solution {
    public int solution(int[] common) {
        int len = common.length;
        
        if (common[1] - common[0] == common[2] - common[1]) {
            int d = common[1] - common[0];
            return common[len - 1] + d;
        } else {
            int r = common[1] / common[0];
            return common[len - 1] * r;
        }
    }
}