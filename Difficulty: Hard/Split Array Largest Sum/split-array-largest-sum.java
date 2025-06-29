class Solution {
    public int splitArray(int[] arr, int k) {
        int maxElement = 0, totalSum = 0;
        
        for (int num : arr) {
            maxElement = Math.max(maxElement, num);
            totalSum += num;
        }
        
        int low = maxElement, high = totalSum, result = totalSum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canSplit(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return result;
    }
    
    private boolean canSplit(int[] arr, int k, int maxSum) {
        int currentSum = 0, splits = 1;
        
        for (int num : arr) {
            if (currentSum + num > maxSum) {
                splits++;
                currentSum = num;
                if (splits > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        
        return true;
    }
}

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] arr = {7, 2, 5, 10, 8};
//         int k = 2;
//         System.out.println(solution.splitArray(arr, k));
//     }
// }
