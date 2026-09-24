class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        while (k-- > 0) {

            int last = grid[m - 1][n - 1];

            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j > 0; j--) {
                    grid[i][j] = grid[i][j - 1];
                }

                if (i > 0) {
                    grid[i][0] = grid[i - 1][n - 1];
                }
            }

            grid[0][0] = last;
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int[] row : grid) {
            List<Integer> list = new ArrayList<>();

            for (int x : row) {
                list.add(x);
            }

            ans.add(list);
        }

        return ans;
    }
}