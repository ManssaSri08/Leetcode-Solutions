class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1,sum=0,rem,result;
        while(n!=0)
        {
            rem=n%10;
            prod=prod*rem;
            sum=sum+rem;
            n=n/10;
        }
        result=prod-sum;
        return result;
    }
}


