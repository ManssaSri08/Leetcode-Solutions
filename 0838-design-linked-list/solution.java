class MyLinkedList {
    class Node{
        int val; Node next;
        Node(int v){
            val=v; next=null;
        }
    }
    Node head; Node tail; int size;
    public MyLinkedList() {
        head=null; tail=null; size=0;
    }
    
    public int get(int index) {
        if(index<0||index>=size) return -1;
        Node current=head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=nn; tail=nn;
        }
        else{
            nn.next=head; head=nn;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=nn; tail=nn;
        }
        else{
            tail.next=nn; tail=nn;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        if(index==0){
            addAtHead(val); return;
        }
        if(index==size){
            addAtTail(val); return;
        }
        Node nn=new Node(val);
        Node current=head;
        for(int i=1;i<index;i++){
            current=current.next;
        }
        nn.next=current.next;
        current.next=nn;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        if(index==0){
            head=head.next;
            size--;
            if(size==0) tail=null;
            return;
        }
        Node current=head;
        for(int i=1;i<index;i++){
            current=current.next;
        }
        current.next=current.next.next;
        if(index==size-1)
            tail=current;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
