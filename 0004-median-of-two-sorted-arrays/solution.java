class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1=a.length, n2=b.length, n=n1+n2;
        int ind2=n/2, ind1=ind2-1;
        int ind1El=-1, ind2El=-1;
        int count=0, i=0, j=0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(count==ind1) ind1El=a[i];
                if(count==ind2) ind2El=a[i];
                count++; i++;
            }
            else{
                if(count==ind1) ind1El=b[j];
                if(count==ind2) ind2El=b[j];
                count++; j++;
            }
        }
        while(i<n1){
            if(count==ind1) ind1El=a[i];
            if(count==ind2) ind2El=a[i];
            count++; i++;
        }
        while(j<n2){
            if(count==ind1) ind1El=b[j];
            if(count==ind2) ind2El=b[j];
            count++; j++;
        }
        if(n%2==1) return ind2El;
        return (double)(ind1El+ind2El)/2.0;
    }
}
