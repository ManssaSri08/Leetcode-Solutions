class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int start=0,end=skill.length-1,skills=skill[start]+skill[end];
        long chemistry=0L;
        while(start<end){
            int sum=skill[start]+skill[end];
            if(sum!=skills) return -1L;
            chemistry+=skill[start]*skill[end];
            start++; end--;
        }
        return chemistry;
    }
}
