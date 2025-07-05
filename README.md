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
| [0102-binary-tree-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0102-binary-tree-level-order-traversal) |
| [0107-binary-tree-level-order-traversal-ii](https://github.com/vishalkrverma/DSA/tree/master/0107-binary-tree-level-order-traversal-ii) |
| [0110-balanced-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0110-balanced-binary-tree) |
## Depth-First Search
|  |
| ------- |
| [0110-balanced-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0110-balanced-binary-tree) |
## Binary Tree
|  |
| ------- |
| [0102-binary-tree-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0102-binary-tree-level-order-traversal) |
| [0107-binary-tree-level-order-traversal-ii](https://github.com/vishalkrverma/DSA/tree/master/0107-binary-tree-level-order-traversal-ii) |
| [0110-balanced-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0110-balanced-binary-tree) |
## Array
|  |
| ------- |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
| [1510-find-lucky-integer-in-an-array](https://github.com/vishalkrverma/DSA/tree/master/1510-find-lucky-integer-in-an-array) |
## Two Pointers
|  |
| ------- |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
## Sorting
|  |
| ------- |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
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
## Ordered Set
|  |
| ------- |
| [0885-exam-room](https://github.com/vishalkrverma/DSA/tree/master/0885-exam-room) |
## Breadth-First Search
|  |
| ------- |
| [0102-binary-tree-level-order-traversal](https://github.com/vishalkrverma/DSA/tree/master/0102-binary-tree-level-order-traversal) |
| [0107-binary-tree-level-order-traversal-ii](https://github.com/vishalkrverma/DSA/tree/master/0107-binary-tree-level-order-traversal-ii) |
<!---LeetCode Topics End-->