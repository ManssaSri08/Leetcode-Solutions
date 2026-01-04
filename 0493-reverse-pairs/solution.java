class Solution {
    public int reversePairs(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        return divide(nums,0,nums.length-1);
    }
    public int divide(int[] a,int left,int right){
        if(left>=right) return 0;
        int mid=left+(right-left)/2;
        int count=0;
        count+=divide(a,left,mid);
        count+=divide(a,mid+1,right);
        count+=countPairs(a,left,mid,right);
        merge(a,left,mid,right);
        return count;
    }
    public int countPairs(int[] a,int left,int mid,int right){
        int count=0;
        int j=mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right && (long)a[i]>2L*a[j]){
                j++;
            }
            count+=(j-(mid+1));
        }
        return count;
    }
    public void merge(int[] a,int left,int mid,int right){
        int n1=mid-left+1; int n2=right-mid;
        int[] l=new int[n1]; int[] r=new int[n2];
        for(int i=0;i<n1;i++) l[i]=a[left+i];
        for(int j=0;j<n2;j++) r[j]=a[mid+1+j];
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(l[i]<r[j]){
                a[k]=l[i]; i++;
            }
            else{
                a[k]=r[j]; j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=l[i]; i++; k++;
        }
        while(j<n2){
            a[k]=r[j]; j++; k++;
        }
    }
}
