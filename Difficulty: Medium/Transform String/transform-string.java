class Solution {
    int transform(String A, String B) {
        if (A.length() != B.length()) return -1;

        int n = A.length();

        // Step 1: Check if A and B are anagrams
        int[] freq = new int[256]; // assuming extended ASCII

        for (int i = 0; i < n; i++) {
            freq[A.charAt(i)]++;
            freq[B.charAt(i)]--;
        }

        for (int count : freq) {
            if (count != 0) return -1; // not anagrams
        }

        // Step 2: Count matching characters from end
        int i = n - 1; // pointer for A
        int j = n - 1; // pointer for B
        int matchCount = 0;

        while (i >= 0) {
            if (A.charAt(i) == B.charAt(j)) {
                j--; // matched character
                matchCount++;
            }
            i--; // always move A pointer
        }

        // Unmatched characters = need to move to front
        return n - matchCount;
    }
}
