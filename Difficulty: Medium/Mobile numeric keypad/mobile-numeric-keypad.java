class Solution {
    public int getCount(int n) {
        // code here
        if(n<=0) return 0;
        
          if (n <= 0) return 0;

        int[][] moves = {
            {0, 8},        // 0
            {1, 2, 4},     // 1
            {2, 1, 3, 5},  // 2
            {3, 2, 6},     // 3
            {4, 1, 5, 7},  // 4
            {5, 2, 4, 6, 8},// 5
            {6, 3, 5, 9},  // 6
            {7, 4, 8},     // 7
            {8, 5, 7, 9, 0},// 8
            {9, 6, 8}      // 9
        };

        long[][] dp = new long[n + 1][10];

        // Base case: single digit sequences
        for (int digit = 0; digit <= 9; digit++) {
            dp[1][digit] = 1;
        }

        for (int len = 2; len <= n; len++) {
            for (int digit = 0; digit <= 9; digit++) {
                for (int neighbor : moves[digit]) {
                    dp[len][digit] += dp[len - 1][neighbor];
                }
            }
        }

        int total = 0;
        for (int digit = 0; digit <= 9; digit++) {
            total += dp[n][digit];
        }

        return total;
    }
}