class Solution {
    public String longestNiceSubstring(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            Set<Character> set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                set.add(s.charAt(j));
                if(isNice(set) && j-i+1 > result.length())
                    result=s.substring(i,j+1);
            }
        }
        return result;
    }
    public boolean isNice(Set<Character> set){
        for(char c:set){
            if(Character.isLowerCase(c) && !set.contains(Character.toUpperCase(c)))
                return false;
            if(Character.isUpperCase(c) && !set.contains(Character.toLowerCase(c)))
                return false;
        }
        return true;
    }
}
