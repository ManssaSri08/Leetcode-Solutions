class Solution {
    public int numSubmat(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] heights = new int[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    heights[i][j] = 0;
                } else {
                    heights[i][j] = (i == 0 ? 1 : heights[i - 1][j] + 1);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int minHeight = heights[i][j];
                for (int k = j; k >= 0 && minHeight > 0; k--) {
                    minHeight = Math.min(minHeight, heights[i][k]);
                    count += minHeight;
                }
            }
        }

        return count;
    }
}
