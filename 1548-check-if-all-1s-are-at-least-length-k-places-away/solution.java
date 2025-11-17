class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int count=0,foundNext=0;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==1){
                        foundNext=1;
                        break;
                    }
                    count++;
                }
                if(foundNext==1){
                        if(count<k) return false;
        }   }   }
    return true;
    }
}
