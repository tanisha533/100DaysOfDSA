class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visit = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visit[i][j]) {
                    count++;
                    dfs(i, j, grid, visit);
                }
            }
        }

        return count;
    }

    public void dfs(int i, int j, char[][] grid, boolean[][] visit) {
       
       if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
        return ;

       if(grid[i][j]=='0' || visit[i][j]) return;

        visit[i][j] = true;

       dfs(i+1,j,grid,visit);
       dfs(i-1,j,grid,visit);
       dfs(i,j+1,grid,visit);
       dfs(i,j-1,grid,visit);
    }
}