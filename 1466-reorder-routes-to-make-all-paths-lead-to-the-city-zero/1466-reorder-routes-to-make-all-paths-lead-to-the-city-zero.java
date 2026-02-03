class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph with direction info
        for (int[] conn : connections) {
            int u = conn[0], v = conn[1];
            graph.get(u).add(new int[] { v, 1 }); // original edge u -> v
            graph.get(v).add(new int[] { u, 0 }); // reverse edge v -> u
        }

        return dfs(graph, new boolean[n], 0);
    }

    private int dfs(List<List<int[]>> graph, boolean[] visited, int src) {
        visited[src] = true;
        int count = 0;

        for (int[] edge : graph.get(src)) {
            int dest = edge[0];
            int needsReversal = edge[1];

    if (!visited[dest]) {
    count += needsReversal + dfs(graph, visited, dest);
            }
        }

        return count;
    }
}
