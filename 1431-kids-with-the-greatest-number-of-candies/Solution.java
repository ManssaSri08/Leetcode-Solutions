/*
LeetCode: 1431. Kids With the Greatest Number of Candies
Runtime: 1
Memory: 43664000
*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int max=0;
        for(int c:candies)
            if(c>max) max=c;
        for(int c:candies)
            result.add(c+extraCandies>=max);
        return result;
    }
}
