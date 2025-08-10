class Solution {
    private double[][] memo = new double[200][200];

    public double soupServings(int n) {
        // For large n, probability approaches 1
        if (n > 4800) return 1.0;
        int servings = (n + 24) / 25;  // Scale down by 25 units
        return dfs(servings, servings);
    }

    private double dfs(int a, int b) {
        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1.0;
        if (b <= 0) return 0.0;
        if (memo[a][b] > 0) return memo[a][b];

        memo[a][b] = 0.25 * (
            dfs(a - 4, b) +
            dfs(a - 3, b - 1) +
            dfs(a - 2, b - 2) +
            dfs(a - 1, b - 3)
        );
        return memo[a][b];
    }
}

