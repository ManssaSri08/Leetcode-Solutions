class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        Queue<String> q=new LinkedList<>();
        Set<String> set=new HashSet<>(wordList);
        q.offer(beginWord);
        int count=1;
        while(!q.isEmpty()){
            count++;
            for(int i=q.size();i>0;i--){
                String word=q.poll();
                char[] ch=word.toCharArray();
                for(int j=0;j<ch.length;j++){
                    char safe=ch[j];
                    for(char c='a';c<='z';c++){
                        ch[j]=c;
                        String temp=new String(ch);
                        if(temp.equals(endWord)) return count;
                        if(set.contains(temp)){
                            q.offer(temp);
                            set.remove(temp);
                        }
                    }
                    ch[j]=safe;
                }
            }
        }
        return 0;
    }
}
