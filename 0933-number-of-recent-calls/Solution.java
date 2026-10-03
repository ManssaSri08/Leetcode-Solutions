/*
LeetCode: 933. Number of Recent Calls
Runtime: 23
Memory: 59804000
*/

class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        while(!q.isEmpty() && q.peek()<t-3000){
            q.poll();
        }
        return q.size();
    }
}
