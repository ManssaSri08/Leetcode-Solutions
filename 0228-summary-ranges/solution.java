class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==0) return list;
        int start=nums[0],end=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                if(start==end)
                    list.add(String.valueOf(start));
                else
                    list.add(start+"->"+nums[i]);
                start=nums[i+1];
                end=nums[i+1];
            }
            else{
                end=nums[i+1];
            }
        }
        if(start==end)
            list.add(String.valueOf(start));
        else
            list.add(start+"->"+end);
        return list;
    }
}
