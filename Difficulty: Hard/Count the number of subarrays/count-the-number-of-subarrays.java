class Solution {
    long countSubarray(int N, int A[], long L, long R) {
        long[] prefix = new long[N + 1];

        // Step 1: Build prefix sum array
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + A[i];
        }

        // Step 2: Count using modified merge sort
        return mergeSortCount(prefix, 0, N, L, R);
    }

    private long mergeSortCount(long[] pre, int left, int right, long L, long R) {
        if (left >= right) return 0;

        int mid = (left + right) / 2;
        long count = mergeSortCount(pre, left, mid, L, R)
                   + mergeSortCount(pre, mid + 1, right, L, R);

        int start = mid + 1, end = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (start <= right && pre[start] - pre[i] < L) start++;
            while (end <= right && pre[end] - pre[i] <= R) end++;
            count += (end - start);
        }

        // Merge two sorted halves
        merge(pre, left, mid, right);
        return count;
    }

    private void merge(long[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        long[] L = new long[n1];
        long[] R = new long[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}

        // code here
         