
class Solution {
    int smallestDivisor(int[] arr, int k) {
        int left = 1;
        int right = getMax(arr);
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (computeSum(arr, mid) <= k) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    int computeSum(int[] arr, int divisor) {
        int sum = 0;
        for (int num : arr) {
            sum += (num + divisor - 1) / divisor;  // This is equivalent to ceil(num / divisor)
        }
        return sum;
    }

    int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
