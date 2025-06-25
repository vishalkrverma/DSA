import java.util.*;

class Solution {
    boolean sameFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Map<Integer, Integer> freqCount = new HashMap<>();
        for (int f : freq) {
            if (f > 0) {
                freqCount.put(f, freqCount.getOrDefault(f, 0) + 1);
            }
        }

        if (freqCount.size() == 1) return true;

        if (freqCount.size() == 2) {
            List<Integer> keys = new ArrayList<>(freqCount.keySet());
            int f1 = keys.get(0), f2 = keys.get(1);
            int c1 = freqCount.get(f1), c2 = freqCount.get(f2);

            // Case 1: One frequency is 1 and it appears once (can be removed)
            if ((f1 == 1 && c1 == 1) || (f2 == 1 && c2 == 1)) return true;

            // Case 2: Difference between frequencies is 1 and the higher freq appears only once
            if ((Math.abs(f1 - f2) == 1) && ((f1 > f2 && c1 == 1) || (f2 > f1 && c2 == 1))) return true;
        }

        return false;
    }
}
