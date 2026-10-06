/*
LeetCode: 721. Accounts Merge
Runtime: 29
Memory: 49488000
*/

class Solution {
    int[] parent;
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);
                if (!map.containsKey(email)) {
                    map.put(email, i);
                } else {
                    union(i, map.get(email));
                }
            }
        }
        HashMap<Integer, List<String>> merged = new HashMap<>();
        for (String email : map.keySet()) {
            int account = map.get(email);
            int parentAccount = find(account);
            merged.putIfAbsent(parentAccount, new ArrayList<>());
            merged.get(parentAccount).add(email);
        }
        List<List<String>> result = new ArrayList<>();
        for (int account : merged.keySet()) {
            List<String> emails = merged.get(account);
            Collections.sort(emails);
            List<String> current = new ArrayList<>();
            current.add(accounts.get(account).get(0));
            current.addAll(emails);
            result.add(current);
        }
        return result;
    }
    int find(int node) {
        if (parent[node] != node) {
            parent[node] = find(parent[node]);
        }
        return parent[node];
    }
    void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if (parentA != parentB) {
            parent[parentB] = parentA;
        }
    }
}
