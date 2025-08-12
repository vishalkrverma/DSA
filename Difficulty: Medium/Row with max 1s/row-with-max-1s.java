class Solution {
    public int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int maxRow = -1;
        int j = m - 1;

        for (int i = 0; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                maxRow = i;  // found a row with more 1s
                j--;         // move left
            }
        }

        return maxRow;
    }
}
 