
class Solution {
    
    // Helper method to check if Koko can finish with speed s in k hours
    private boolean canFinish(int[] arr, int k, int s) {
        int hours = 0;
        for (int pile : arr) {
            hours += (pile + s - 1) / s; // ceil(pile / s)
        }
        return hours <= k;
    }

    // Main method to find minimum eating speed
    public int kokoEat(int[] arr, int k) {
        int left = 1;
        int right = getMax(arr);
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canFinish(arr, k, mid)) {
                result = mid;
                right = mid - 1; // try a smaller speed
            } else {
                left = mid + 1;  // need a faster speed
            }
        }

        return result;
    }

    // Helper method to get the maximum value in the array
    private int getMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}

