/*
LeetCode: 225. Implement Stack using Queues
Runtime: N/A
Memory: 42776000
*/

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        int size=q.size();
        for(int i=1;i<size;i++){
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
