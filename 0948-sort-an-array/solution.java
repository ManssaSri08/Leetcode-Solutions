class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
    public static int divide(int[] nums,int left,int right){
        if(nums.length==1) return nums[0];
        if(left<right){
            int mid=left+(right-left)/2;
            divide(nums,left,mid);
            divide(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
        return 0;
    }
    public static void merge(int[] nums,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for(int i=0;i<n1;i++) l[i]=nums[left+i];
        for(int j=0;j<n2;j++) r[j]=nums[mid+1+j];
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                nums[k]=l[i];
                i++;
            }
            else{
                nums[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k]=l[i];
            i++; k++;
        }
        while(j<n2){
            nums[k]=r[j];
            j++; k++;
        }
    }
}
