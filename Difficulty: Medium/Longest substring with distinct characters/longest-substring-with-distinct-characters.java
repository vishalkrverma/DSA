class Solution {
    public int longestUniqueSubstr(String s) {
        int maxLen = 0;
        String curr = "";
        int[] res = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // Reset everything
            curr = "";
            Arrays.fill(res, 0);

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (res[ch - 'a'] == 0) {
                    curr += ch;
                    res[ch - 'a']++;
                    maxLen = Math.max(maxLen, curr.length());
                } else {
                    break; // Duplicate found, break inner loop
                }
            }
        }

        return maxLen;
    }
}
