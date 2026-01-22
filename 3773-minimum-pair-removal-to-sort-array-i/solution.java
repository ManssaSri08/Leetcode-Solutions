import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        int ans = 0;
        List<Integer> arr = new ArrayList<>();
        for (int x : nums) arr.add(x);

        while (hasInversion(arr)) {
            int minSum = Integer.MAX_VALUE;
            int idx = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                int sum = arr.get(i) + arr.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }
            arr.set(idx, minSum);
            arr.remove(idx + 1);
            ans++;
        }
        return ans;
    }

    private boolean hasInversion(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) return true;
        }
        return false;
    }
}
