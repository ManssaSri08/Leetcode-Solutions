class Solution {
    private List<Integer>[] graph;
    private int[] values;
    private int k;
    private int componentCount = 0;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        this.k = k;
        this.values = values;
        graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(0, -1);
        return componentCount;
    }

    private long dfs(int u, int parent) {
        long sum = values[u];
        for (int v : graph[u]) {
            if (v == parent) continue;
            sum += dfs(v, u);
        }
        if (sum % k == 0) {
            componentCount++;
        }
        return sum;
    }
}

