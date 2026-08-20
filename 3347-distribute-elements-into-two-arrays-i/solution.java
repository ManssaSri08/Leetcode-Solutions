class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int a=1,b=1;
        for(int i=2;i<n;i++){
            if(arr1[a-1]>arr2[b-1]){
                arr1[a++]=nums[i];
            }
            else{
                arr2[b++]=nums[i];
            }
        }
        int k=a;
        for(int i=0;i<b;i++){
            arr1[k++]=arr2[i];
        }
        return arr1;
    }
}
