class Solution {
    public int minFlips(String s) {
        int flips0 = 0; // Pattern: 0101...
        int flips1 = 0; // Pattern: 1010...

        for (int i = 0; i < s.length(); i++) {
            char expected0 = (i % 2 == 0) ? '0' : '1';
            char expected1 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expected0) flips0++;
            if (s.charAt(i) != expected1) flips1++;
        }

        return Math.min(flips0, flips1);
    }
}
