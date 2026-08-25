class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid[0] == null)
            return 0;

        int num_island = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    num_island++;
                    dfs(grid, r, c);
                }
            }
        }
        
        return num_island;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0')
            return;
        
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}
