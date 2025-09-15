import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findSubString(String str) {
        int n = str.length();
        
        // Number of distinct characters in str
        int distinctCount = (int) str.chars().distinct().count();
        
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, count = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        
        for (int i = 0; i < n; i++) {
            char endChar = str.charAt(i);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
            
            if (map.get(endChar) == 1) {
                count++;  // New distinct character found in current window
            }
            
            // Try to shrink the window if it contains all distinct chars
            while (count == distinctCount) {
                if (i - start + 1 < minLen) {
                    minLen = i - start + 1;
                    minStart = start;
                }
                
                char startChar = str.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    count--;  // Lost a distinct char from window
                }
                start++;
            }
        }
        
        return minLen;
    }
}
