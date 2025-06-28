class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
         Arrays.sort(b);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // For each element in array a, count elements in b <= a[i]
        for (int num : a) {
            result.add(countLessThanOrEqual(b, num));
        }
        
        return result;
    }

    // Binary search to count elements <= x in sorted array b
    private static int countLessThanOrEqual(int[] b, int x) {
        int low = 0, high = b.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (b[mid] <= x) {
                low = mid + 1; // Include more elements
            } 
            else {
                high = mid; // Exclude elements > x
            }
        }
        return low; // Low is the count of elements <= x
    }
}