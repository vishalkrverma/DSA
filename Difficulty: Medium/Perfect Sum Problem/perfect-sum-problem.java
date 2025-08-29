class Solution {
    static int MOD = 1000000007; // Use modulo if needed (many problems require it)

    static int sum(int[] arr, int sum, int n){
        int[][] dp = new int[n + 1][sum + 1];

        // Base Case Initialization
        dp[0][0] = 1; // Only one way to have sum 0 with 0 elements
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = 0;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = (dp[i - 1][j - arr[i - 1]] + dp[i - 1][j]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public int perfectSum(int[] nums, int target) {
        int n = nums.length;
        return sum(nums, target, n);
    }
}
