
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int m=mat.length;
        
        int i=0;
        int n=mat[0].length;
        int j=n-1;
        
         while (i < m && j >= 0) {
            if (mat[i][j] == x) {
                return true; // Element found
            } 
            else if (mat[i][j] > x) {
                j--; // Move left
            } 
            else {
                i++; // Move down
            }
        }
        
        return false;
    }
}