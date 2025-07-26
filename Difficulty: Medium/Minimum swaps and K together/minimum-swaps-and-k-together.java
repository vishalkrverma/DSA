// User function Template for Java

class Solution {
    public int minSwap(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        // Step 1: Count elements <= k
        for (int num : arr) {
            if (num <= k) count++;
        }

        // Step 2: Count elements > k in the first window of size 'count'
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) bad++;
        }

        // Step 3: Slide the window and update 'bad'
        int ans = bad;
        for (int i = count; i < n; i++) {
            if (arr[i - count] > k) bad--;  // element going out
            if (arr[i] > k) bad++;          // element coming in
            ans = Math.min(ans, bad);
        }

        return ans;
    }
}
