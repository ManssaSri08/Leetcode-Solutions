class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] words=paragraph.split("\\s+");
        Map<String,Integer> map=new HashMap<>();
        Set<String> ban=new HashSet<>(Arrays.asList(banned));
        String result="";
        int max=0;
        for(String s:words){
            if(!s.equals("") && !ban.contains(s)){
                map.put(s,map.getOrDefault(s,0)+1);
                if(map.get(s)>max){
                    max=map.get(s);
                    result=s;
                }
            }
        }
        return result;
        
    }
}
