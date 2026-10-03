/*
LeetCode: 3289. The Two Sneaky Numbers of Digitville
Runtime: 1
Memory: 45584000
*/

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    arr[k++]=nums[i];
                    if(k==2) return arr;
                }
            }
        }
        return arr;
    }
}
