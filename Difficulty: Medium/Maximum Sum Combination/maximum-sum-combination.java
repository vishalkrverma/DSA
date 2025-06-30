// User function Template for Java

import java.util.*;

class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        Set<String> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        int i = N - 1, j = N - 1;
        pq.add(new int[]{A[i] + B[j], i, j});
        seen.add(i + "," + j);

        while (K-- > 0) {
            int[] top = pq.poll();
            res.add(top[0]);
            i = top[1];
            j = top[2];

            if (i > 0 && seen.add((i - 1) + "," + j))
                pq.add(new int[]{A[i - 1] + B[j], i - 1, j});
            if (j > 0 && seen.add(i + "," + (j - 1)))
                pq.add(new int[]{A[i] + B[j - 1], i, j - 1});
        }
        return res;
    }
}
