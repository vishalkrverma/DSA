import java.util.*;

class Solution {
    public List<String> allLCS(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Step 1: Fill DP table
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Step 2: Backtrack with memoization to collect all LCS
        Set<String> result = backtrack(s1, s2, n, m, dp, new HashMap<>());

        // Convert to sorted list
        List<String> list = new ArrayList<>(result);
        Collections.sort(list);
        return list;
    }

    // Key: i + "|" + j, Value: Set of LCS strings from (i,j)
    private Set<String> backtrack(String s1, String s2, int i, int j, int[][] dp, Map<String, Set<String>> memo) {
        String key = i + "|" + j;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        Set<String> result = new HashSet<>();

        if (i == 0 || j == 0) {
            result.add("");
        } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            Set<String> temp = backtrack(s1, s2, i - 1, j - 1, dp, memo);
            for (String str : temp) {
                result.add(str + s1.charAt(i - 1));
            }
        } else {
            if (dp[i - 1][j] >= dp[i][j - 1]) {
                result.addAll(backtrack(s1, s2, i - 1, j, dp, memo));
            }
            if (dp[i][j - 1] >= dp[i - 1][j]) {
                result.addAll(backtrack(s1, s2, i, j - 1, dp, memo));
            }
        }

        memo.put(key, result);
        return result;
    }
}
