class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++)
            pre[i + 1] = pre[i] + nums[i];
        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix, Long.MAX_VALUE);
        long ans = Long.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            int mod = i % k;
            if (minPrefix[mod] != Long.MAX_VALUE)
                ans = Math.max(ans, pre[i] - minPrefix[mod]);
            minPrefix[mod] = Math.min(minPrefix[mod], pre[i]);
        }
        return ans;
    }
}

