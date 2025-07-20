class Solution {
    public int countValid(int n, int[] arr) {
        // code here
         Set<Integer> banned = new HashSet<>();
        for (int digit : arr) {
            banned.add(digit);
        }

        // Digits not in arr[] (i.e., allowed for "not containing" case)
        List<Integer> allowedDigits = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            if (!banned.contains(i)) {
                allowedDigits.add(i);
            }
        }

        int allowedSize = allowedDigits.size();
        if (allowedSize == 0) return 0; // all digits banned => no valid number

        // Count n-digit numbers that do NOT contain any digit from arr[]
        int countWithoutArr = 0;

        // First digit cannot be 0
        for (int first : allowedDigits) {
            if (first == 0) continue;

            int count = 1;
            for (int i = 1; i < n; i++) {
                count *= allowedSize;
            }
            countWithoutArr += count;
        }

        // Total n-digit numbers
        int totalNDigit = 9 * (int)Math.pow(10, n - 1);

        // Final result = total - numbers that do NOT contain any arr[] digit
        return totalNDigit - countWithoutArr;
    }
}