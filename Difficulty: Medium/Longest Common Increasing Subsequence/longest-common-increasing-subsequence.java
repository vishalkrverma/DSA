class Solution {
    public int LCIS(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        // dp[j] = LCIS ending at b[j]
        int[] dp = new int[m];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int currentMax = 0;  // best LCIS length found so far for a[i]

            for (int j = 0; j < m; j++) {

                // Case 1: match → can extend the LCIS
                if (a[i] == b[j]) {
                    dp[j] = currentMax + 1;
                    answer = Math.max(answer, dp[j]);
                }

                // Case 2: b[j] < a[i] → candidates to extend later
                else if (b[j] < a[i]) {
                    currentMax = Math.max(currentMax, dp[j]);
                }
            }
        }

        return answer;
    }
}
