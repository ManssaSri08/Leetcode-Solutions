class Solution {
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        int MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        long[] prefix = new long[n + 1];

        dp[0] = 1;
        prefix[0] = 1;

        Deque<Integer> minQ = new ArrayDeque<>();
        Deque<Integer> maxQ = new ArrayDeque<>();

        int left = 0;

        for (int r = 0; r < n; r++) {

            while (!minQ.isEmpty() && nums[minQ.peekLast()] > nums[r])
                minQ.pollLast();
            minQ.addLast(r);

            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] < nums[r])
                maxQ.pollLast();
            maxQ.addLast(r);

            while (nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > k) {
                if (minQ.peekFirst() == left) minQ.pollFirst();
                if (maxQ.peekFirst() == left) maxQ.pollFirst();
                left++;
            }

            long total = prefix[r] - (left == 0 ? 0 : prefix[left - 1]);
            if (total < 0) total += MOD;

            dp[r + 1] = total % MOD;
            prefix[r + 1] = (prefix[r] + dp[r + 1]) % MOD;
        }
        return (int) dp[n];
    }
}

