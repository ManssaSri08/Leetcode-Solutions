class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums1){
            list.add(num);
        }
        List<Integer> resultList=new ArrayList<>();  
        for(int num:nums2){
            if(list.contains(num)){
                resultList.add(num);
                list.remove(Integer.valueOf(num));
            }
        }
        int[] result=new int[resultList.size()];
        for(int i=0;i<resultList.size();i++)
            result[i]=resultList.get(i);
        return result;
    }
}
