class Solution {
    public int largestInteger(int num) {
        int temp=num,count=0;
        ArrayList<Integer> digits=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        while(temp>0){
            int rem=temp%10;
            digits.add(rem);
            if(rem%2==0) even.add(rem);
            else odd.add(rem);
            temp/=10;
            count++;
        }
        Collections.reverse(digits);
        Collections.sort(even,Collections.reverseOrder());
        Collections.sort(odd,Collections.reverseOrder());
        int ei=0,oi=0,ans=0;
        for(int d:digits){
            if(d%2==0)
                ans=ans*10+even.get(ei++);
            else
                ans=ans*10+odd.get(oi++);
        }
        return ans;
    }
}
