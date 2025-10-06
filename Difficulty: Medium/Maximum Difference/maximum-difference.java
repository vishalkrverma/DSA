class Solution {
    // Find nearest smaller to left
    static int[] nearestSmallerToLeft(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(arr[i]);
        }

        return res;
    }

    // Find nearest smaller to right
    static int[] nearestSmallerToRight(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(arr[i]);
        }

        return res;
    }
    // Main method to find the maximum absolute difference
       public int findMaxDiff(int[] arr) {
        int n = arr.length;

        int[] left = nearestSmallerToLeft(arr);
        int[] right = nearestSmallerToRight(arr);

        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(left[i] - right[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}
