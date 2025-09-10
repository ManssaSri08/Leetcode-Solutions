class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=2*(nums.length);
        int[] arr=new int[size];
        for(int ind=0;ind<nums.length;ind++)
        {
            arr[ind]=nums[ind];
            arr[ind+nums.length]=nums[ind];
        }
        return arr;
    }
}
