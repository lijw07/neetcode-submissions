class Solution {
    boolean[][] visited;
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid[0] == null)
            return 0;

        int nr = grid.length;
        int nc = grid[0].length;
        int max = 0;
        visited = new boolean[nr][nc];
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                max = Math.max(max, dfs(grid, r, c));
            }
        }

        return max;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || visited[r][c] || grid[r][c] == 0)
            return 0;
        
        int count = 0;
        if (grid[r][c] == 1) {
            visited[r][c] = true;
            count++;
        }

        count+= dfs(grid, r - 1, c);
        count+= dfs(grid, r + 1, c);
        count+= dfs(grid, r, c - 1);
        count+= dfs(grid, r, c + 1);
        return count;
    }
}
