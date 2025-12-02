class Solution {
    public int countTrapezoids(int[][] points) {
        final long MOD = 1_000_000_007;
        java.util.HashMap<Integer, Long> map = new java.util.HashMap<>();
        for (int[] p : points) {
            int y = p[1];
            map.put(y, map.getOrDefault(y, 0L) + 1);
        }
        long prefix = 0;
        long ans = 0;
        for (long count : map.values()) {
            if (count >= 2) {
                long seg = (count * (count - 1) / 2) % MOD;
                ans = (ans + seg * prefix) % MOD;
                prefix = (prefix + seg) % MOD;
            }
        }
        return (int) ans;
    }
}

