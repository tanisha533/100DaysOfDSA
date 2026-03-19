class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int sum=0;
        int n= grid.length, m=grid[0].length;
        int k[][]=new int[n][m];
        int pref[][]=new int[n][m];
        int[][] countX = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
              if(grid[i][j]=='X') k[i][j]=1;   
              else if(grid[i][j]=='Y') k[i][j]=-1;
              else {
                k[i][j]=0;
              }      }
        }
      // Step 2: build prefix sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pref[i][j] = k[i][j]
    + (i > 0 ? pref[i-1][j] : 0)
                           + (j > 0 ? pref[i][j-1] : 0)
                           - (i > 0 && j > 0 ? pref[i-1][j-1] : 0);

                int val = (grid[i][j] == 'X' ? 1 : 0);
                countX[i][j] = val
                             + (i > 0 ? countX[i-1][j] : 0)
                             + (j > 0 ? countX[i][j-1] : 0)
                             - (i > 0 && j > 0 ? countX[i-1][j-1] : 0);
            }
        }

        // Step 3: count valid submatrices
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pref[i][j] == 0 && countX[i][j] > 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
