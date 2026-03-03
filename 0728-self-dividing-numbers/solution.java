class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            int temp=i;
            boolean valid=true;
            while(temp>0){
                int rem=temp%10;
                if(rem==0 || num%rem!=0){
                    valid=false; break;
                }
                temp/=10;
            }
            if(valid){
                list.add(num);
            }
        }
        return list;
    }
}
