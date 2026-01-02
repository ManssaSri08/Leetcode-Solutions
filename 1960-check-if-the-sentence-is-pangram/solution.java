class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:sentence.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        String alpha="abcdefghijklmnopqrstuvwxyz";
        for(char key:alpha.toCharArray()){
            if(!map.containsKey(key)) return false;
        }
        return true;
    }
}
