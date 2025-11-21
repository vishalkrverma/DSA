class Solution {
    static class Pair {
        int node, wt;
        Pair(int n, int w) {
            node = n;
            wt = w;
        }
    }

    public int shortestPath(int V, int a, int b, int[][] edges) {

        // Build graph with straight edges only
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        for (int[] e : edges) {
            int x = e[0], y = e[1], w1 = e[2];
            // add straight edge w1
            graph.get(x).add(new Pair(y, w1));
            graph.get(y).add(new Pair(x, w1));
        }

        // Dijkstra from A and B using only straight edges
        int[] distFromA = dijkstra(graph, V, a);
        int[] distFromB = dijkstra(graph, V, b);

        int ans = distFromA[b]; // path without curved edge

        // Try using each curved edge (at most one)
        for (int[] e : edges) {
            int x = e[0], y = e[1], w2 = e[3];

            if (distFromA[x] != Integer.MAX_VALUE && distFromB[y] != Integer.MAX_VALUE)
                ans = Math.min(ans, distFromA[x] + w2 + distFromB[y]);

            if (distFromA[y] != Integer.MAX_VALUE && distFromB[x] != Integer.MAX_VALUE)
                ans = Math.min(ans, distFromA[y] + w2 + distFromB[x]);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }


    // Standard Dijkstra
    private int[] dijkstra(ArrayList<ArrayList<Pair>> graph, int V, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);

        dist[src] = 0;
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int u = cur.node;

            for (Pair nbr : graph.get(u)) {
                int v = nbr.node;
                int wt = nbr.wt;

                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        return dist;
    }
}
