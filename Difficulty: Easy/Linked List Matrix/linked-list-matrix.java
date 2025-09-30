/*class Node

class Node
{
   int data;
   Node right,down;

   Node(int data){
       this.data = data;
       right = null;
       down = null;
   }
}
*/
/*Function should return the head of the 2D LL.*/
class Solution {
    static Node construct(int arr[][]) {
        
        int n=arr.length;
        int m=arr[0].length;
        Node nodes[][]=new Node[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nodes[i][j] = new Node(arr[i][j]);
            }
        }

        // Step 2: Link next and down pointers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j + 1 < m) {
                    nodes[i][j].right = nodes[i][j + 1];
                }
                if (i + 1 < n) {
                    nodes[i][j].down = nodes[i + 1][j];
                }
            }
        }

        // Return the head of the 2D linked list
        return nodes[0][0];
    }
}