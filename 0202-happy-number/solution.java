class Solution {
    public boolean isHappy(int n) {
        int pv=(int)Math.log10(n)+1;
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum+=d*d;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}
