class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=0,b=0;
        for(int i=1;i<=n;i++)
        {
            int j=n-i;
            if(nozeros(i)&&nozeros(j))
                return new int[]{i,j};
        }
        return new int[]{};
    }
    public boolean nozeros(int m)
    {
        while(m>0)
        {
            if(m%10==0) 
                return false;
            m=m/10;
        }
        return true;
    }
}
