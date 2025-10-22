class Solution {
    public long flowerGame(int n, int m) {
        long oddn=(n+1L)/2L;
        long evenn=n/2L;
        long oddm=(m+1L)/2L;
        long evenm=m/2L;
        return (evenn*oddm+oddn*evenm);
    }
}
