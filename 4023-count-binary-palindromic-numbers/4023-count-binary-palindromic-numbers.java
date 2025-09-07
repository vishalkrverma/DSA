class Solution {
    public int countBinaryPalindromes(long n) {
        if (n == 0) return 1; // "0"
        if (n == 1) return 2; // "0","1"

        int l = Long.toBinaryString(n).length();

        // dp[len] = number of palindromic binaries of exact length len
        int[] dp = new int[l + 1];
        dp[0] = 1; // ""
        dp[1] = 2; // "0","1"
        for (int i = 2; i <= l; i++) {
            dp[i] = 1 << ((i - 1) / 2);
        }

        // count palindromes with length < l
        int res = 0;
        for (int i = 1; i < l; i++) res += dp[i];

        // count palindromes of length = l using construct
        res += construct(l - 2, 1, (1L << (l - 1)) + 1, n);

        return res;
    }

    public int construct(int l, int r, long cur, long limit) {
        if (cur > limit) return 0;
        if (l < r) {
            return 1; // finished building palindrome, valid
        }
        if (l == r) {
            int count = 1; // leave center bit 0
            if (cur + (1L << l) <= limit) count++; // center bit 1
            return count;
        }

        // inward contraction
        int zeros = construct(l - 1, r + 1, cur, limit);
        int ones = construct(l - 1, r + 1, cur + (1L << l) + (1L << r), limit);

        return zeros + ones;
    }
}