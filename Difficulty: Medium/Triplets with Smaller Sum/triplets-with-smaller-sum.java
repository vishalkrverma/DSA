// User function Template for Java

import java.util.Arrays;

class Solution {
    long countTriplets(int n, int targetSum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;
        int m = arr.length;

        for (int i = 0; i < m - 2; i++) {
            int j = i + 1;
            int k = m - 1;

            while (j < k) {
                long sum = arr[i] + arr[j] + arr[k];

                if (sum < targetSum) {
                    // All triplets from j to k are valid
                    count += (k - j);
                    j++;
                } 
                else{
                    k--;
                }
            }
        }

        return count;
    }
}
