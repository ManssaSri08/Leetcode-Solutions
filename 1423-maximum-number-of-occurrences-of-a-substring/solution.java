class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int[] freq=new int[26];
        int n=s.length(),left=0,distinct=0,max=0;
        for(int i=0;i<minSize;i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==0) distinct++;
            freq[ch-'a']++;
        }
        Map<String,Integer> map=new HashMap<>();
        String sub=new String();
        for(int right=minSize;right<n;right++){
            sub=s.substring(left,left+minSize);
            if(distinct<=maxLetters){
                map.put(sub,map.getOrDefault(sub,0)+1);
                max=Math.max(max,map.get(sub));
            }
            char ch=s.charAt(right);
            if(freq[ch-'a']==0) distinct++;
            freq[ch-'a']++;
            char c=s.charAt(left);
            freq[c-'a']--;
            if(freq[c-'a']==0) distinct--;
            left++;
        }
        sub=s.substring(left,left+minSize);
        if(distinct<=maxLetters){
            map.put(sub,map.getOrDefault(sub,0)+1);
            max=Math.max(max,map.get(sub));
        }
        return max;
    }
}
