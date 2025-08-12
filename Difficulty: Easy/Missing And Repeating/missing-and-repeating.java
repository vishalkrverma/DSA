

// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
          ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        // True sum and square sum based on 1 to n
        long trueSum = (long) n * (n + 1) / 2;
        long trueSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        long foundSum = 0;
        long foundSquareSum = 0;

        // Calculate found sums from the array
        for (int i = 0; i < n; i++) {
            foundSum += arr[i];
            foundSquareSum += (long) arr[i] * arr[i];
        }

        // Calculate the differences
        long diff = trueSum - foundSum; // Missing - Repeating
        long squareDiff = trueSquareSum - foundSquareSum; // Missing^2 - Repeating^2

        // Using the equations to find the numbers
        long plus = squareDiff / diff; // Missing + Repeating
        int missing = (int) (plus + diff) / 2;
        int repeating = (int) (missing - diff);

        // Add results to the ArrayList
        result.add(repeating);
        result.add(missing);

        return result;
    }
}
