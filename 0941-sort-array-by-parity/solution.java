class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        int N=nums.length,k=0;
        int[] res=new int[N];
        for(int n:nums){
            if(n%2==0) even.add(n);
            else odd.add(n);
        }
        for(int e:even){
            res[k++]=e;
        }
        for(int o:odd){
            res[k++]=o;
        }
        return res;
    }
}
