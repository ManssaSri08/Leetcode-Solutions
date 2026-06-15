class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0,sumB=0;
        for(int n:aliceSizes) sumA+=n;
        for(int n:bobSizes) sumB+=n;
        HashSet<Integer> set=new HashSet<>();
        int diff=(sumA-sumB)/2;
        for(int n:bobSizes) set.add(n);
        for(int n:aliceSizes){
            int need=n-diff;
            if(set.contains(need)){
                return new int[]{n,need};
            }
        }
        return new int[]{};
    }
}
