class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int n:nums)
            freq.put(n,freq.getOrDefault(n,0)+1);
        List<Integer> list=new ArrayList<>(freq.keySet());
        Comparator<Integer> comp=new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                int fa=freq.get(a);
                int fb=freq.get(b);
                return fb-fa;
            }
        };
        Collections.sort(list,comp);
        int[] res=new int[k];
        for(int i=0;i<k;i++)
            res[i]=list.get(i);
        return res;
    }
}
