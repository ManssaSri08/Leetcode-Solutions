class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list=new ArrayList<>();
        int totalLen=words[0].length()*words.length;
        int wordLen=words[0].length();
        Map<String,Integer> map=new HashMap<>();
        for(String w:words)
            map.put(w,map.getOrDefault(w,0)+1);
        for(int i=0;i+totalLen<=s.length();i++){
            Map<String,Integer> temp=new HashMap<>(map);
            int count=words.length;
            int j;
            for(j=i;j<i+totalLen;j+=wordLen){
                String cur=s.substring(j,j+wordLen);
                Integer freq=temp.get(cur);
                if(freq==null || freq==0){
                    count=-1;
                    break;
                }
                temp.put(cur,freq-1);
                count--;
            }
            if(count==0){
                list.add(i);
            }
        }
        return list;
    }
}
