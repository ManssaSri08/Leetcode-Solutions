class Solution {
    public int maxSumDivThree(int[] nums) {
        int min1=Integer.MAX_VALUE, min1_2=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE, min2_2=Integer.MAX_VALUE;
        int sum=0;
        for(int num:nums){
            sum+=num;
            int r=num%3;
            if(r==1){
                if(num<min1){
                    min1_2=min1; min1=num;
                }
                else if(num<min1_2)
                    min1_2=num;
            }
            if(r==2){
                if(num<min2){
                    min2_2=min2; min2=num; 
                }
                else if(num<min2_2)
                    min2_2=num;
            }
        }
        if(sum%3==1){
            int opt1=min1;
            int opt2=(min2==Integer.MAX_VALUE||min2_2==Integer.MAX_VALUE)?Integer.MAX_VALUE:min2+min2_2;
            sum-=Math.min(opt1,opt2);
        }
        if(sum%3==2){
            int opt1=min2;
            int opt2=(min1==Integer.MAX_VALUE||min1_2==Integer.MAX_VALUE)?Integer.MAX_VALUE:min1+min1_2;
            sum-=Math.min(opt1,opt2);
        }
        return sum;
    }
}
