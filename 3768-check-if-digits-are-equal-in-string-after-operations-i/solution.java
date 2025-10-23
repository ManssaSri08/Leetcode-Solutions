class Solution {
    public boolean hasSameDigits(String s) {
        List<Integer> list=new ArrayList<>();
        for(char c:s.toCharArray()){
            list.add(c-'0');
        }
        while(list.size()>2){
            List<Integer> next=new ArrayList<>();
            for(int i=0;i+1<list.size();++i){
                next.add((list.get(i)+list.get(i+1))%10);
            }
            list=next;
        }
        return list.get(0).equals(list.get(1));
    }
}
