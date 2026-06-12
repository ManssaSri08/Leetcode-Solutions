class Solution {
    public int findDuplicate(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:arr)
            map.put(n,map.getOrDefault(n,0)+1);
        for(int n:arr){
            if(map.get(n)>1){
                return n;
            }
        }
        return 0;
    }
}
