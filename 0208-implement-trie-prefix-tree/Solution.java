/*
LeetCode: 208. Implement Trie (Prefix Tree)
Runtime: 28
Memory: 61996000
*/

class Node{
    Node[] child=new Node[26];
    boolean endsWith;
}
class Trie {
    Node root;
    public Trie() {
        root=new Node();
    }
    public void insert(String word) {
        Node curr=root;
        for(char ch:word.toCharArray()){
            int index=ch-'a';
            if(curr.child[index]==null)
                curr.child[index]=new Node();
            curr=curr.child[index];
        }
        curr.endsWith=true;
    }
    public boolean search(String word) {
        Node curr=root;
        for(char ch:word.toCharArray()){
            int index=ch-'a';
            if(curr.child[index]==null)
                return false;
            curr=curr.child[index];
        }
        return curr.endsWith;
    }
    public boolean startsWith(String prefix) {
        Node curr=root;
        for(char ch:prefix.toCharArray()){
            int index=ch-'a';
            if(curr.child[index]==null)
                return false;
            curr=curr.child[index];
        }
        return true;
    }
}
