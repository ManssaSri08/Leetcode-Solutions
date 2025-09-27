class Solution {
    long fun(long base,long exp)
    {
        if(exp==1) return base;
        if(exp==0) return 1;
        long half=exp/2;
        long half_ans=fun(base,half);
        long full_ans=(half_ans*half_ans)%1000000007;
        if(exp%2==1) full_ans=(full_ans*base)%1000000007;
        return full_ans;
    }
    public int countGoodNumbers(long n) {
        long half=n/2;
        long res=1;
        if(n%2==1) res=5;
        res=(res*fun(20,half))%1000000007;
        return (int)res;
    }
}
