class Solution {
    public int substrCount(String s, int k) {
        int n = s.length();
        if (k > n) return 0;

        int count = 0;
        int[] freq = new int[26];
        int distinct = 0;

        // Initialize first window
        for (int i = 0; i < k; i++) {
            int idx = s.charAt(i) - 'a';
            if (freq[idx] == 0) distinct++;
            freq[idx]++;
        }
        if (distinct == k - 1) count++;

        // Slide window
        for (int i = k; i < n; i++) {
            int outIdx = s.charAt(i - k) - 'a';
            freq[outIdx]--;
            if (freq[outIdx] == 0) distinct--;

            int inIdx = s.charAt(i) - 'a';
            if (freq[inIdx] == 0) distinct++;
            freq[inIdx]++;

            if (distinct == k - 1) count++;
        }

        return count;
    }
}
