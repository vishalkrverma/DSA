import java.util.*;

class Solution {

    private boolean bfs(int start, int[] colors, List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        colors[start] = 1;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : adj.get(node)) {
                if (colors[neighbor] == 0) {
                    colors[neighbor] = -colors[node];
                    q.add(neighbor);
                } else if (colors[neighbor] == colors[node]) {
                    return false;
                }
            }
        }

        return true;
    }

    public void solve() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i <= N; i++) adj.add(new ArrayList<>());

            for (int i = 0; i < M; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }

            int[] colors = new int[N + 1];
            boolean isBipartite = true;

            for (int i = 1; i <= N; i++) {
                if (colors[i] == 0) {
                    if (!bfs(i, colors, adj)) {
                        isBipartite = false;
                        break;
                    }
                }
            }

            System.out.println(isBipartite ? "yes" : "no");
        }
    }

    public static void main(String[] args) {
        new Solution().solve();
    }
}
