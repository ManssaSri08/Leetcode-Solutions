class Solution {
    public int minimumSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = Integer.MAX_VALUE;

        java.util.function.BiFunction<int[], int[], Integer> calcArea = (rRange, cRange) -> {
            int r1 = m, c1 = n, r2 = -1, c2 = -1;
            for (int i = rRange[0]; i <= rRange[1]; i++) {
                for (int j = cRange[0]; j <= cRange[1]; j++) {
                    if (grid[i][j] == 1) {
                        r1 = Math.min(r1, i);
                        c1 = Math.min(c1, j);
                        r2 = Math.max(r2, i);
                        c2 = Math.max(c2, j);
                    }
                }
            }
            if (r2 < r1) return 0;
            return (r2 - r1 + 1) * (c2 - c1 + 1);
        };

        for (int mid1 = 0; mid1 < m - 1; mid1++) {
            for (int mid2 = mid1 + 1; mid2 < m - 1; mid2++) {
                int a = calcArea.apply(new int[]{0, mid1}, new int[]{0, n - 1});
                int b = calcArea.apply(new int[]{mid1 + 1, mid2}, new int[]{0, n - 1});
                int c = calcArea.apply(new int[]{mid2 + 1, m - 1}, new int[]{0, n - 1});
                ans = Math.min(ans, a + b + c);
            }
        }

        for (int mid1 = 0; mid1 < n - 1; mid1++) {
            for (int mid2 = mid1 + 1; mid2 < n - 1; mid2++) {
                int a = calcArea.apply(new int[]{0, m - 1}, new int[]{0, mid1});
                int b = calcArea.apply(new int[]{0, m - 1}, new int[]{mid1 + 1, mid2});
                int c = calcArea.apply(new int[]{0, m - 1}, new int[]{mid2 + 1, n - 1});
                ans = Math.min(ans, a + b + c);
            }
        }

        for (int hr = 0; hr < m - 1; hr++) {
            for (int midc = 0; midc < n - 1; midc++) {
                int topLeft = calcArea.apply(new int[]{0, hr}, new int[]{0, midc});
                int topRight = calcArea.apply(new int[]{0, hr}, new int[]{midc + 1, n - 1});
                int bottom = calcArea.apply(new int[]{hr + 1, m - 1}, new int[]{0, n - 1});
                ans = Math.min(ans, topLeft + topRight + bottom);

                int bottomLeft = calcArea.apply(new int[]{hr + 1, m - 1}, new int[]{0, midc});
                int bottomRight = calcArea.apply(new int[]{hr + 1, m - 1}, new int[]{midc + 1, n - 1});
                int top = calcArea.apply(new int[]{0, hr}, new int[]{0, n - 1});
                ans = Math.min(ans, bottomLeft + bottomRight + top);
            }
        }

        for (int vc = 0; vc < n - 1; vc++) {
            for (int midr = 0; midr < m - 1; midr++) {
                int leftTop = calcArea.apply(new int[]{0, midr}, new int[]{0, vc});
                int leftBottom = calcArea.apply(new int[]{midr + 1, m - 1}, new int[]{0, vc});
                int right = calcArea.apply(new int[]{0, m - 1}, new int[]{vc + 1, n - 1});
                ans = Math.min(ans, leftTop + leftBottom + right);

                int rightTop = calcArea.apply(new int[]{0, midr}, new int[]{vc + 1, n - 1});
                int rightBottom = calcArea.apply(new int[]{midr + 1, m - 1}, new int[]{vc + 1, n - 1});
                int left = calcArea.apply(new int[]{0, m - 1}, new int[]{0, vc});
                ans = Math.min(ans, rightTop + rightBottom + left);
            }
        }

        return ans;
    }
}
