class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()) return list;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0,right=0,count=p.length();
        while(right<s.length()){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)>=0){
                    count--;
                }
            }
            right++;
            if(count==0){
                list.add(left);
            }
            if(right-left==p.length()){
                char leftChar=s.charAt(left);
                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);
                    if(map.get(leftChar)>0){
                        count++;
                    }
                }
                left++;
            }
        }
        return list;
    }
}
