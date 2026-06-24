class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int[] arr:nums){
            for(int x:arr){
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==n){
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}
