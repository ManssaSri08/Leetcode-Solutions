
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        
        for (int idx = 0; idx < n; idx++) {
            int x = nums.get(idx);
            
            // If number is 2 (even prime), no solution
            if (x == 2) {
                ans[idx] = -1;
            } else {
                // Find first 0 bit from LSB starting at bit 1
                for (int i = 1; i < 32; i++) {
                    if (((x >> i) & 1) == 0) {
                        ans[idx] = x ^ (1 << (i - 1));
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
    }
