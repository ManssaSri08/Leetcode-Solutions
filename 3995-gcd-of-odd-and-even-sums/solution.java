class Solution {
    public int gcdOfOddEvenSums(int n) {
        int n1=1,n2=2,oddSum=0,evenSum=0,gcd=1,limit;
        for(int i=1;i<=n;i++){
            oddSum+=n1; n1+=2;
            evenSum+=n2; n2+=2;
        }
        limit=(oddSum<evenSum)?evenSum:oddSum;
        for(int i=1;i<=limit;i++){
            if(evenSum%i==0 && oddSum%i==0)
                gcd=i;
        }
        return gcd;
    }
}
