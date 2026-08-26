class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] dangerBoard = new int[n][n];

        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 1) {
                    for (int i = 0; i < 9; i++) {
                        int nr = r + dx[i];
                        int nc = c + dy[i];

                        if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                            dangerBoard[nr][nc] = 1;
                        }
                    }
                }
            }
        }

        int safeCount = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (dangerBoard[r][c] == 0) {
                    safeCount++;
                }
            }
        }

        return safeCount;
    }
}