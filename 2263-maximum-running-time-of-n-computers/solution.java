class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long total = 0;
        for (int b : batteries) total += b;
        long left = 0, right = total / n;
        while (left < right) {
            long mid = right - (right - left) / 2;
            if (canRun(mid, n, batteries)) left = mid;
            else right = mid - 1;
        }
        return left;
    }
    private boolean canRun(long t, int n, int[] batteries) {
        long power = 0;
        for (int b : batteries) power += Math.min(b, t);
        return power >= (long) n * t;
    }
}

