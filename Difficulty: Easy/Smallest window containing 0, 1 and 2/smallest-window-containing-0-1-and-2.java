// User function Template for Java

import java.util.HashMap;

class Solution {
    public int smallestSubstring(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < S.length(); right++) {
            char currentChar = S.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            // Try to shrink the window from the left as long as it contains all 3 characters
            while (map.size() == 3) {
                minLength = Math.min(minLength, right - left + 1);

                char leftChar = S.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
}

