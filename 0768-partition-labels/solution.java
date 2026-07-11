class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']=i;
        }
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE,start=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            max=Math.max(max,freq[c-'a']);
            if(i==max){
                list.add(i-start+1);
                start=i+1;
            }
        }
        return list;
    }
}
