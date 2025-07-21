# DSA
# Indexes of Subarray Sum DSA Problem 
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target){ 
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        int j=0;  
       for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           while(sum>target){
               sum-=arr[j];
               j++;
           }
           if(sum==target){
               al.add(j+1);
               al.add(i+1);
              return al;
           }
       }
       al.add(-1);
       return al;
    }
}

<!---LeetCode Topics Start-->
# LeetCode Topics
## Tree
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/vishalkrverma/DSA/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0107-binary-tree-level-order-traversal-ii](https://github.com/vishalkrverma/DSA/tree/master/0107-binary-tree-level-order-traversal-ii) |
| [0110-balanced-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0110-balanced-binary-tree) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [1035-cousins-in-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/1035-cousins-in-binary-tree) |
## Depth-First Search
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/vishalkrverma/DSA/tree/master/0101-symmetric-tree) |
| [0110-balanced-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0110-balanced-binary-tree) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0813-all-paths-from-source-to-target](https://github.com/vishalkrverma/DSA/tree/master/0813-all-paths-from-source-to-target) |
| [1035-cousins-in-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/1035-cousins-in-binary-tree) |
## Binary Tree
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/vishalkrverma/DSA/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0107-binary-tree-level-order-traversal-ii](https://github.com/vishalkrverma/DSA/tree/master/0107-binary-tree-level-order-traversal-ii) |
| [0110-balanced-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0110-balanced-binary-tree) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [1035-cousins-in-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/1035-cousins-in-binary-tree) |
## Array
|  |
| ------- |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
| [0084-largest-rectangle-in-histogram](https://github.com/vishalkrverma/DSA/tree/master/0084-largest-rectangle-in-histogram) |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
| [1478-maximum-number-of-events-that-can-be-attended](https://github.com/vishalkrverma/DSA/tree/master/1478-maximum-number-of-events-that-can-be-attended) |
| [1510-find-lucky-integer-in-an-array](https://github.com/vishalkrverma/DSA/tree/master/1510-find-lucky-integer-in-an-array) |
| [3490-find-the-maximum-length-of-valid-subsequence-i](https://github.com/vishalkrverma/DSA/tree/master/3490-find-the-maximum-length-of-valid-subsequence-i) |
## Two Pointers
|  |
| ------- |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
## Sorting
|  |
| ------- |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [1478-maximum-number-of-events-that-can-be-attended](https://github.com/vishalkrverma/DSA/tree/master/1478-maximum-number-of-events-that-can-be-attended) |
## Hash Table
|  |
| ------- |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [1510-find-lucky-integer-in-an-array](https://github.com/vishalkrverma/DSA/tree/master/1510-find-lucky-integer-in-an-array) |
## Sliding Window
|  |
| ------- |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
## Counting
|  |
| ------- |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [1510-find-lucky-integer-in-an-array](https://github.com/vishalkrverma/DSA/tree/master/1510-find-lucky-integer-in-an-array) |
| [1708-design-parking-system](https://github.com/vishalkrverma/DSA/tree/master/1708-design-parking-system) |
## Design
|  |
| ------- |
| [0885-exam-room](https://github.com/vishalkrverma/DSA/tree/master/0885-exam-room) |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
| [1708-design-parking-system](https://github.com/vishalkrverma/DSA/tree/master/1708-design-parking-system) |
## Simulation
|  |
| ------- |
| [1708-design-parking-system](https://github.com/vishalkrverma/DSA/tree/master/1708-design-parking-system) |
## Math
|  |
| ------- |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
## Data Stream
|  |
| ------- |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
## Prefix Sum
|  |
| ------- |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
## Heap (Priority Queue)
|  |
| ------- |
| [0885-exam-room](https://github.com/vishalkrverma/DSA/tree/master/0885-exam-room) |
| [1478-maximum-number-of-events-that-can-be-attended](https://github.com/vishalkrverma/DSA/tree/master/1478-maximum-number-of-events-that-can-be-attended) |
## Ordered Set
|  |
| ------- |
| [0885-exam-room](https://github.com/vishalkrverma/DSA/tree/master/0885-exam-room) |
## Breadth-First Search
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/vishalkrverma/DSA/tree/master/0101-symmetric-tree) |
| [0102-binary-tree-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0102-binary-tree-level-order-traversal) |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0107-binary-tree-level-order-traversal-ii](https://github.com/vishalkrverma/DSA/tree/master/0107-binary-tree-level-order-traversal-ii) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0813-all-paths-from-source-to-target](https://github.com/vishalkrverma/DSA/tree/master/0813-all-paths-from-source-to-target) |
| [1035-cousins-in-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/1035-cousins-in-binary-tree) |
## Linked List
|  |
| ------- |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
## Stack
|  |
| ------- |
| [0084-largest-rectangle-in-histogram](https://github.com/vishalkrverma/DSA/tree/master/0084-largest-rectangle-in-histogram) |
| [0957-minimum-add-to-make-parentheses-valid](https://github.com/vishalkrverma/DSA/tree/master/0957-minimum-add-to-make-parentheses-valid) |
## Monotonic Stack
|  |
| ------- |
| [0084-largest-rectangle-in-histogram](https://github.com/vishalkrverma/DSA/tree/master/0084-largest-rectangle-in-histogram) |
## String
|  |
| ------- |
| [0957-minimum-add-to-make-parentheses-valid](https://github.com/vishalkrverma/DSA/tree/master/0957-minimum-add-to-make-parentheses-valid) |
| [1302-delete-characters-to-make-fancy-string](https://github.com/vishalkrverma/DSA/tree/master/1302-delete-characters-to-make-fancy-string) |
| [3396-valid-word](https://github.com/vishalkrverma/DSA/tree/master/3396-valid-word) |
## Greedy
|  |
| ------- |
| [0957-minimum-add-to-make-parentheses-valid](https://github.com/vishalkrverma/DSA/tree/master/0957-minimum-add-to-make-parentheses-valid) |
| [1478-maximum-number-of-events-that-can-be-attended](https://github.com/vishalkrverma/DSA/tree/master/1478-maximum-number-of-events-that-can-be-attended) |
## Dynamic Programming
|  |
| ------- |
| [3490-find-the-maximum-length-of-valid-subsequence-i](https://github.com/vishalkrverma/DSA/tree/master/3490-find-the-maximum-length-of-valid-subsequence-i) |
## Backtracking
|  |
| ------- |
| [0813-all-paths-from-source-to-target](https://github.com/vishalkrverma/DSA/tree/master/0813-all-paths-from-source-to-target) |
## Graph
|  |
| ------- |
| [0813-all-paths-from-source-to-target](https://github.com/vishalkrverma/DSA/tree/master/0813-all-paths-from-source-to-target) |
<!---LeetCode Topics End-->