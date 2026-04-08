class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max=0,majority=0;
        for(int n:nums){
            if(map.get(n)>max){
                max=map.get(n);
                majority=n;
            }
        }
        return majority;
    }
}
