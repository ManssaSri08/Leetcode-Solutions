class Solution {
    public int reverse(int x) {
        long pv = 1;
        int safe = x;
        long res = 0;
        while (safe / 10 != 0) {
            pv *= 10;
            safe /= 10;
        }
        while (x != 0) {
            int rem = x % 10;
            res += (long) rem * pv;
            x /= 10;
            pv /= 10;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0;
        return (int) res;
    }
}

