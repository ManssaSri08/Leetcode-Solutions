/*
LeetCode: 4051. Count Subarrays with Distant Sums
Runtime: 138
Memory: 89224000
*/

import java.util.*;
class Solution {
    public long distantSubarrays(int[] nums, int goal, int k) {
        int n=nums.length;
        if(k==0) return (long)n*(n+1)/2;
        long[] prefix=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        long[] sorted=prefix.clone();
        Arrays.sort(sorted);
        int m=0;
        for(int i=0;i<=n;i++){
            if(i==0||sorted[i]!=sorted[i-1]){
                sorted[m++]=sorted[i];
            }
        }
        Fenwick tree=new Fenwick(m);
        long ans=0;
        tree.add(lowerBound(sorted,m,prefix[0])+1,1);
        long low=(long)goal-k;
        long high=(long)goal+k;
        for(int i=1;i<=n;i++){
            long cur=prefix[i];
            long left=cur-low;
            long right=cur-high;
            int leftIndex=lowerBound(sorted,m,left);
            long countLeft=i-tree.sum(leftIndex);
            int rightIndex=upperBound(sorted,m,right);
            long countRight=tree.sum(rightIndex);
            ans+=countLeft+countRight;
            tree.add(lowerBound(sorted,m,cur)+1,1);
        }
        return ans;
    }
    static int lowerBound(long[] a,int n,long x){
        int l=0,r=n;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]>=x) r=mid;
            else l=mid+1;
        }
        return l;
    }
    static int upperBound(long[] a,int n,long x){
        int l=0,r=n;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]>x) r=mid;
            else l=mid+1;
        }
        return l;
    }
    static class Fenwick {
        long[] tree;
        Fenwick(int n){
            tree=new long[n+1];
        }
        void add(int i,long value){
            while(i<tree.length){
                tree[i]+=value;
                i+=i&-i;
            }
        }
        long sum(int i){
            long ans=0;
            while(i>0){
                ans+=tree[i];
                i-=i&-i;
            }
            return ans;
        }
    }
}
