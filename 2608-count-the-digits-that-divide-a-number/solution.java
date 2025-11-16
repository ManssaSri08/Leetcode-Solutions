class Solution {
    public int countDigits(int num) {
        int temp=num,count=0,dig;
        while(num>0){
            dig=num%10;
            if(temp%dig==0)
                count++;
            num=num/10;
        }
        return count;
    }
}
