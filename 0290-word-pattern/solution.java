class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char c1=pattern.charAt(i);
            String c2=words[i];
            if(map.containsKey(c1)){
                if(!map.get(c1).equals(c2)){
                    return false;
                }
            }
            else{
                if(set.contains(c2)){
                    return false;
                }
            }
            map.put(c1,c2);
            set.add(c2);
        }
        return true;
    }
}
