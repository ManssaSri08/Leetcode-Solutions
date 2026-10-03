/*
LeetCode: 621. Task Scheduler
Runtime: 3
Memory: 48056000
*/

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        int maxFreq=0, maxCount=0;
        for(char ch:tasks){
            freq[ch-'A']++;
            if(freq[ch-'A']>maxFreq){
                maxFreq=freq[ch-'A'];
            }
        }
        for(int f:freq){
            if(f==maxFreq) maxCount++;
        }
        int result=(maxFreq-1)*(n+1)+maxCount;
        return Math.max(result,tasks.length);
    }
}
