class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int[] diff=new int[n];
        for(int i=0;i<n;i++){
            Set<Integer> leftSet=new HashSet<>();
            for(int j=0;j<=i;j++){
                leftSet.add(nums[j]);
            }
            Set<Integer> rightSet=new HashSet<>();
            for(int j=i+1;j<n;j++){
                rightSet.add(nums[j]);
            }
            diff[i]=leftSet.size()-rightSet.size();
        }
        return diff;
    }
}
