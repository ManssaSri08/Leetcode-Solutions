class Solution {
    int[] count;
    int[] idx;
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        count=new int[n]; idx=new int[n];
        for(int i=0;i<n;i++) idx[i]=i;
        divide(nums,0,n-1);
        List<Integer> list=new ArrayList<>();
        for(int num:count){
            list.add(num);
        }
        return list;
    }
    public void divide(int[] a,int left,int right){
        if(left>=right) return;
        int mid=left+(right-left)/2;
        divide(a,left,mid);
        divide(a,mid+1,right);
        merge(a,left,mid,right);
    }
    public void merge(int[] a,int left,int mid,int right){
        int n1=mid-left+1; int n2=right-mid;
        int[] l=new int[n1]; int[] r=new int[n2];
        int[] li=new int[n1]; int[] ri=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=a[left+i]; li[i]=idx[left+i];
        }
        for(int j=0;j<n2;j++){
            r[j]=a[mid+1+j]; ri[j]=idx[mid+1+j];
        }
        int i=0,j=0,k=left,smaller=0;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                count[li[i]]+=smaller;
                a[k]=l[i];
                idx[k]=li[i];
                i++;
            }
            else{
                smaller++;
                a[k]=r[j];
                idx[k]=ri[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            count[li[i]]+=smaller;
            a[k]=l[i];
            idx[k]=li[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=r[j];
            idx[k]=ri[j];
            j++;
            k++;
        }
    }
}
