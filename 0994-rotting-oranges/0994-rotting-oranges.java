class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] isvisit = new boolean[grid.length][grid[0].length];
        int fresh = 0;
        int minutes = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
                if (grid[i][j] == 1)
                    fresh++;
            }
        }
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int k = 0; k < size; k++) {

            int[] curr = q.remove();
                int row = curr[0];
                int col = curr[1];
           for (int d = 0; d < 4; d++) {

           int newRow = row + dir[d][0];
           int newCol = col + dir[d][1];

     if (newRow >= 0 && newCol >= 0 && newRow < grid.length && newCol < grid[0].length && grid[newRow][newCol] == 1) {

            grid[newRow][newCol] = 2;
            fresh--;
             q.add(new int[] { newRow, newCol });
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}