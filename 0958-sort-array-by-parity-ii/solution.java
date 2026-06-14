class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        int N=nums.length,k=0,ei=0,oi=0;
        int[] res=new int[N];
        for(int n:nums){
            if(n%2==0) even.add(n);
            else odd.add(n);
        }
        for(int i=0;i<N;i++){
            if(i%2==0) res[i]=even.get(ei++);
            else res[i]=odd.get(oi++);
        }
        return res;
    }
}
