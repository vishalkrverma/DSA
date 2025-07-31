import java.util.*;

public class Solution {
    public int powerfulInteger(int[][] intervals, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Step 1: Line sweep setup: +1 at start, -1 at end+1
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            map.put(start, map.getOrDefault(start, 0) + 1);
            map.put(end + 1, map.getOrDefault(end + 1, 0) - 1);
        }

        int active = 0;
        int maxPowerful = -1;
        int prev = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int point = entry.getKey();

            // If the previous count was ≥ k, then the range [prev, point - 1] was powerful
            if (active >= k && prev != -1) {
                maxPowerful = Math.max(maxPowerful, point - 1);
            }

            // Update current active interval count
            active += entry.getValue();
            prev = point;
        }

        return maxPowerful;
    }
}
