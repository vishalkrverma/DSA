import java.util.HashMap;

class Solution {
    public boolean isSubset(int[] a, int[] b) {
        HashMap<Integer, Integer> freqA = new HashMap<>();

        // Count frequency of each element in a[]
        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        // Check each element in b[] against freqA
        for (int num : b) {
            if (!freqA.containsKey(num) || freqA.get(num) == 0) {
                return false;
            }
            freqA.put(num, freqA.get(num) - 1); // consume one occurrence
        }

        return true;
    }
}
