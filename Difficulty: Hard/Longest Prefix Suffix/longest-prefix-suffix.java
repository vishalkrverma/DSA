class Solution {
    int getLPSLength(String s) {
        
        int n = s.length();

        int i = 1;
        int j = 0;
        int[] arr = new int[n];
        arr[0] = 0; // lps for first char is always 0

        while (i < n) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                arr[i] = j;  // length of current longest prefix suffix
                i++;
            } else {
                if (j != 0) {
                    j = arr[j - 1];  // fall back in pattern
                } else {
                    arr[i] = 0;
                    i++;
                }
            }
        }

        return arr[n - 1];
    }
}