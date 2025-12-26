class Solution {
    public int bestClosingTime(String customers) {
        int penalty=0,bestHour=0;
        for(char ch:customers.toCharArray()){
            if(ch=='Y') penalty++;
        }
        int minPenalty=penalty;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y')
                penalty--;
            else
                penalty++;
            if(penalty<minPenalty){
                minPenalty=penalty;
                bestHour=i+1;
            }
        }
        return bestHour;
    }
}
