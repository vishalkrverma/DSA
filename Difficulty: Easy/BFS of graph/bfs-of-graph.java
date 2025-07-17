class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        
        Queue<Integer> q=new LinkedList<>();
        int V=adj.size();
        
        boolean vis[]=new boolean[V];
        
        
         // Loop over all nodes to handle disconnected components
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    int curr = q.poll();
                    result.add(curr);

                    for (int neighbor : adj.get(curr)) {
                        if (!vis[neighbor]) {
                            q.add(neighbor);
                            vis[neighbor] = true;
                        }
                    }
                }
            }
        }

        return result;
    }
}