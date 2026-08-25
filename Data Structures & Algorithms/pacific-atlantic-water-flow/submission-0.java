class Solution {
    private final int[][]  directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        if (heights == null || heights[0] == null)
            return null;

        int nr = heights.length; 
        int nc = heights[0].length;

        boolean [][] pac = new boolean[nr][nc];
        boolean [][] atl = new boolean[nr][nc];

        for (int c = 0; c < nc; c++) {
            dfs(heights, 0, c, pac);
            dfs(heights, nr - 1, c, atl);
        }

        for (int r = 0; r < nr; r++) {
            dfs(heights, r, 0, pac);
            dfs(heights, r, nc - 1, atl);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (pac[r][c] && atl[r][c])
                    res.add(Arrays.asList(r, c));
            }
        }

        return res;
    }

    private void dfs(int[][] heights, int r, int c, boolean[][] ocean) {
        ocean[r][c] = true;
        for (int[] dir : directions) {
            int nr = r + dir[0], nc = c + dir[1];
            if (nr >= 0 && nr < heights.length && nc >= 0 && nc < heights[0].length && !ocean[nr][nc] && heights[nr][nc] >= heights[r][c])
                dfs(heights, nr, nc, ocean);
        }
    }
}
