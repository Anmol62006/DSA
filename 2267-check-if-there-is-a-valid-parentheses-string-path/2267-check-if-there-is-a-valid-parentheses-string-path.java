class Solution {
    private int m, n;
    private char[][] grid;
    private Boolean[][][] memo;

    public boolean hasValidPath(char[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.grid = grid;

        // Path length must be even
        if ((m + n - 1) % 2 != 0) return false;

        // Memoization: row, col, balance
        memo = new Boolean[m][n][m + n];

        return dfs(0, 0, 0);
    }

    private boolean dfs(int i, int j, int balance) {
        // Update balance based on current cell
        if (grid[i][j] == '(') balance++;
        else balance--;

        // Invalid balance
        if (balance < 0) return false;

        // If at end cell, check balance == 0
        if (i == m - 1 && j == n - 1) {
            return balance == 0;
        }

        // Memo check
        if (memo[i][j][balance] != null) return memo[i][j][balance];

        boolean res = false;

        // Move down
        if (i + 1 < m) {
            res = res || dfs(i + 1, j, balance);
        }

        // Move right
        if (j + 1 < n) {
            res = res || dfs(i, j + 1, balance);
        }

        memo[i][j][balance] = res;
        return res;
    }
}
