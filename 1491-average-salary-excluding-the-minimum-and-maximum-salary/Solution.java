/*
LeetCode: 1491. Average Salary Excluding the Minimum and Maximum Salary
Runtime: N/A
Memory: 42036000
*/

class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int tot=0;
        for(int sum:salary){
            tot=tot+sum;
            if(sum<min) min=sum;
            if(sum>max) max=sum;
        }
        tot=tot-min-max;
        double avg=(double) tot/(salary.length-2);
        return avg;
    }
}
