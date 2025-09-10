class Solution {
    public String largestSwap(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;

        // Step 1: Store the last index of each digit
        int[] lastIndex = new int[10]; // for digits 0–9
        for (int i = 0; i < n; i++) {
            lastIndex[ch[i] - '0'] = i;
        }

        // Step 2: Try to find the first position to swap
        for (int i = 0; i < n; i++) {
            // Try all digits greater than ch[i], from 9 down to ch[i] + 1
            for (int d = 9; d > ch[i] - '0'; d--) {
                if (lastIndex[d] > i) {
                    // Swap ch[i] with ch[lastIndex[d]]
                    char temp = ch[i];
                    ch[i] = ch[lastIndex[d]];
                    ch[lastIndex[d]] = temp;
                    return new String(ch);
                }
            }
        }

        // No swap needed or possible
        return s;
    }
}
