// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
       
       
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            pq.offer(arr[i]); // Add first k elements
        }

        for (int i = k; i < n; i++) {
            if (pq.peek() > arr[i]) {
                pq.poll();         // Remove largest in heap
                pq.offer(arr[i]);  // Add smaller element
            }
        }

        return pq.peek();
    }
}
