class Solution {
    public boolean judgePoint24(int[] cards) {
        double[] nums = new double[cards.length];
        for (int i = 0; i < 4; i++) nums[i] = cards[i];
        return dfs(nums);
    }

    private boolean dfs(double[] nums) {
        int n = nums.length;
        if (n == 1) {
            return Math.abs(nums[0] - 24) < 1e-6;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                // new array without nums[i] and nums[j]
                double[] next = new double[n - 1];
                int idx = 0;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) next[idx++] = nums[k];
                }

                // try operations
                double a = nums[i], b = nums[j];
                double[] results = {a + b, a - b, b - a, a * b};
                if (Math.abs(b) > 1e-6) results = new double[]{a + b, a - b, b - a, a * b, a / b};
                if (Math.abs(a) > 1e-6) results = new double[]{a + b, a - b, b - a, a * b, a / b, b / a};

                for (double val : results) {
                    next[next.length - 1] = val;
                    if (dfs(next)) return true;
                }
            }
        }
        return false;
    }
}

