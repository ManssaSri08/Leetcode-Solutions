class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        boolean[] visited=new boolean[strs.length];
        String[] sorted=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            sorted[i]=new String(arr);
        }
        for(int i=0;i<strs.length;i++){
            if(visited[i]) continue;
            List<String> group=new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;
            for(int j=0;j<strs.length;j++){
                if(!visited[j] && sorted[i].equals(sorted[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
            result.add(group);
        }
        return result;
    }
}
