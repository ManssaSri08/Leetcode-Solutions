class Solution {
    public int totalMoney(int n) {
        int tot=0,mon=1;
        while(n>0){
            for(int day=0;day<7&&n>0;day++){
                tot=tot+mon+day;
                n--;
            }
            mon++;
        }
        return tot;
    }
}
