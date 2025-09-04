import java.util.*;

class Solution {

    public int sumOfModes(int[] arr, int k) {
        int sum = 0;
        int n = arr.length;

        Map<Integer, Integer> freqMap = new HashMap<>();
        int mode = 0;
        int maxFreq = 0;

        // Initialize first window
        for (int i = 0; i < k; i++) {
            int val = arr[i];
            int freq = freqMap.getOrDefault(val, 0) + 1;
            freqMap.put(val, freq);

            if (freq > maxFreq || (freq == maxFreq && val < mode)) {
                mode = val;
                maxFreq = freq;
            }
        }

        sum += mode;

        // Slide window
        for (int i = k; i < n; i++) {
            int out = arr[i - k];
            int in = arr[i];

            // Remove outgoing element
            int outFreq = freqMap.get(out);
            if (outFreq == 1) {
                freqMap.remove(out);
            } else {
                freqMap.put(out, outFreq - 1);
            }

            // Add incoming element
            int inFreq = freqMap.getOrDefault(in, 0) + 1;
            freqMap.put(in, inFreq);

            // Update mode and maxFreq
            if (in == mode) {
                maxFreq = inFreq;
            } else if (inFreq > maxFreq || (inFreq == maxFreq && in < mode)) {
                mode = in;
                maxFreq = inFreq;
            } else if (out == mode && outFreq == maxFreq) {
                // Recompute mode since current mode's frequency decreased
                mode = -1;
                maxFreq = 0;
                for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                    int val = entry.getKey();
                    int freq = entry.getValue();
                    if (freq > maxFreq || (freq == maxFreq && val < mode || mode == -1)) {
                        maxFreq = freq;
                        mode = val;
                    }
                }
            }

            sum += mode;
        }

        return sum;
    }
}
