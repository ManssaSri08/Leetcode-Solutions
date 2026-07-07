class Solution {
    public int trap(int[] height) {
        int n=height.length,water=0;
        int[] l=new int[n];
        int[] r=new int[n];
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],height[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],height[i+1]);
        }
        for(int i=0;i<n;i++){
            int min=Math.min(l[i],r[i]);
            if(min-height[i]>0){
                water+=min-height[i];
            }
        }
        return water;
    }
}
