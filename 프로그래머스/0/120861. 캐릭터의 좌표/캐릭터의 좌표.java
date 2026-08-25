class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        
        for (String key : keyinput) {
            if (key.equals("left") && x > -xLimit) {
                x--;
            } else if (key.equals("right") && x < xLimit) {
                x++;
            } else if (key.equals("up") && y < yLimit) {
                y++;
            } else if (key.equals("down") && y > -yLimit) {
                y--;
            }
        }
        
        return new int[]{x, y};
    }
}