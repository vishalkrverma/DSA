class Solution {
    public int peakElement(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            // Check boundaries before accessing neighbors
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOK = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOK && rightOK) {
                return mid;
            }

            if (!leftOK) {
                j = mid - 1;
            } else { // right neighbor is greater
                i = mid + 1;
            }
        }

        return -1;
    }
}
