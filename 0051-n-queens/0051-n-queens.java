class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>>ans=new ArrayList<>();

;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nqueen(board, 0, ans);
        return ans;
    }

    public void nqueen(char[][] board, int row, List<List<String>>ans){
         int n = board.length;
              // base case: all queens placed
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }


         // work and call
        for (int col= 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nqueen(board, row + 1,ans);
                // backtracking
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col){
        int n=board.length;

    // check column above
    for (int i = 0; i < row; i++) {
        if (board[i][col] == 'Q') return false;
    }

    // check upper-left diagonal
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') return false;
    }

    // check upper-right diagonal
    for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
        if (board[i][j] == 'Q') return false;
    }

    return true;
}
}