import java.util.*;

class Solution {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        Vector<Integer> vector = new Vector<>();
        int[] result = Arrays.copyOf(num, n);

        int mid = n / 2;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;

        // Step 1: Mirror left to right
        while (i >= 0) {
            result[j] = result[i];
            i--;
            j++;
        }

        // Step 2: Check if mirrored is greater than input
        if (!isGreater(result, num)) {
            int carry = 1;
            i = mid - 1;

            if (n % 2 == 1) {
                result[mid] += carry;
                carry = result[mid] / 10;
                result[mid] %= 10;
                j = mid + 1;
            } else {
                j = mid;
            }

            // Propagate carry to left half
            while (i >= 0 && carry > 0) {
                result[i] += carry;
                carry = result[i] / 10;
                result[i] %= 10;
                i--;
            }

            // If carry is still left, need to grow the array
            if (carry > 0) {
                vector.add(1);
                for (int k = 1; k < n; k++) vector.add(0);
                vector.add(1);
                return vector;
            }

            // Mirror again after increment
            i = 0;
            j = n - 1;
            while (i < j) {
                result[j] = result[i];
                i++;
                j--;
            }
        }

        for (int val : result) {
            vector.add(val);
        }
        return vector;
    }

    private boolean isGreater(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) return true;
            if (a[i] < b[i]) return false;
        }
        return false; // equal
    }
}
