class Solution {

    private static boolean isValid(int[] weights, int days, int mid) {
        int cnt = 1;  // At least one day is needed
        int sum = 0;

        for (int num : weights) {
            if (sum + num > mid) {
                cnt++;
                sum = num;
            } else {
                sum += num;
            }
        }
        return cnt <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int wt : weights) {
            low = Math.max(low, wt); // max weight of single item
            high += wt;              // total weight
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isValid(weights, days, mid)) {
                high = mid; // Try smaller capacity
            } else {
                low = mid + 1; // Need bigger capacity
            }
        }

        return low; // low == high == answer
    }
}
