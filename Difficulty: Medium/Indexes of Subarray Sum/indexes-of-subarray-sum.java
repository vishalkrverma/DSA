import java.util.*;

class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0, end = 0;
        int sum = 0;

        while (end < arr.length) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                result.add(start + 1); // 1-based indexing
                result.add(end + 1);
                return result;
            }

            end++;
        }

        result.add(-1);
        return result;
    }
}
