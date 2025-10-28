// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
            int n = arr.length;

        // prev[last] = maximum points till previous day if last activity was "last"
        int[] prev = new int[4];

        // Base case: Day 0
        prev[0] = Math.max(arr[0][1], arr[0][2]);
        prev[1] = Math.max(arr[0][0], arr[0][2]);
        prev[2] = Math.max(arr[0][0], arr[0][1]);
        prev[3] = Math.max(arr[0][0], Math.max(arr[0][1], arr[0][2]));

        // For each day from 1 to n-1
        for (int day = 1; day < n; day++) {
            int[] curr = new int[4];

            for (int last = 0; last < 4; last++) {
                int maxPoints = 0;

                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int points = arr[day][task] + prev[task];
                        maxPoints = Math.max(maxPoints, points);
                    }
                }
                curr[last] = maxPoints;
            }
            prev = curr; // Move to next day
        }

        return prev[3];
    }
}