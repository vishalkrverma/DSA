import java.util.HashMap;

class Solution {
    public int smallestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int cnt = Integer.MAX_VALUE;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() == 3) {
                cnt = Math.min(cnt, i - j + 1);

                char leftChar = s.charAt(j);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                j++;
            }
        }

        return (cnt == Integer.MAX_VALUE) ? -1 : cnt;
    }
}
