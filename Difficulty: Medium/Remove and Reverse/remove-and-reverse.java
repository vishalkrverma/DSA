import java.util.*;

class Solution {
    String removeReverse(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toCharArray()) {
            deque.addLast(c);
        }

        boolean reversed = false;

        while (true) {
            boolean removed = false;

            if (!reversed) {
                // Scan from front
                Iterator<Character> it = deque.iterator();
                while (it.hasNext()) {
                    char c = it.next();
                    if (freq[c - 'a'] > 1) {
                        it.remove();
                        freq[c - 'a']--;
                        reversed = !reversed;
                        removed = true;
                        break;
                    }
                }
            } else {
                // Scan from back
                Iterator<Character> it = deque.descendingIterator();
                while (it.hasNext()) {
                    char c = it.next();
                    if (freq[c - 'a'] > 1) {
                        it.remove();
                        freq[c - 'a']--;
                        reversed = !reversed;
                        removed = true;
                        break;
                    }
                }
            }

            if (!removed) break; // No more duplicates
        }

        // Build final result
        StringBuilder result = new StringBuilder();
        for (char c : deque) result.append(c);
        return reversed ? result.reverse().toString() : result.toString();
    }
}
