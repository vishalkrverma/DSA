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
| [0114-flatten-binary-tree-to-linked-list](https://github.com/vishalkrverma/DSA/tree/master/0114-flatten-binary-tree-to-linked-list) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0226-invert-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0226-invert-binary-tree) |
| [1035-cousins-in-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/1035-cousins-in-binary-tree) |
## Depth-First Search
|  |
| ------- |
| [0101-symmetric-tree](https://github.com/vishalkrverma/DSA/tree/master/0101-symmetric-tree) |
| [0110-balanced-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0110-balanced-binary-tree) |
| [0114-flatten-binary-tree-to-linked-list](https://github.com/vishalkrverma/DSA/tree/master/0114-flatten-binary-tree-to-linked-list) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0207-course-schedule](https://github.com/vishalkrverma/DSA/tree/master/0207-course-schedule) |
| [0226-invert-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0226-invert-binary-tree) |
| [0684-redundant-connection](https://github.com/vishalkrverma/DSA/tree/master/0684-redundant-connection) |
| [0695-max-area-of-island](https://github.com/vishalkrverma/DSA/tree/master/0695-max-area-of-island) |
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
| [0114-flatten-binary-tree-to-linked-list](https://github.com/vishalkrverma/DSA/tree/master/0114-flatten-binary-tree-to-linked-list) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0226-invert-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0226-invert-binary-tree) |
| [1035-cousins-in-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/1035-cousins-in-binary-tree) |
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/vishalkrverma/DSA/tree/master/0001-two-sum) |
| [0011-container-with-most-water](https://github.com/vishalkrverma/DSA/tree/master/0011-container-with-most-water) |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
| [0031-next-permutation](https://github.com/vishalkrverma/DSA/tree/master/0031-next-permutation) |
| [0036-valid-sudoku](https://github.com/vishalkrverma/DSA/tree/master/0036-valid-sudoku) |
| [0037-sudoku-solver](https://github.com/vishalkrverma/DSA/tree/master/0037-sudoku-solver) |
| [0048-rotate-image](https://github.com/vishalkrverma/DSA/tree/master/0048-rotate-image) |
| [0049-group-anagrams](https://github.com/vishalkrverma/DSA/tree/master/0049-group-anagrams) |
| [0074-search-a-2d-matrix](https://github.com/vishalkrverma/DSA/tree/master/0074-search-a-2d-matrix) |
| [0084-largest-rectangle-in-histogram](https://github.com/vishalkrverma/DSA/tree/master/0084-largest-rectangle-in-histogram) |
| [0118-pascals-triangle](https://github.com/vishalkrverma/DSA/tree/master/0118-pascals-triangle) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/vishalkrverma/DSA/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0128-longest-consecutive-sequence](https://github.com/vishalkrverma/DSA/tree/master/0128-longest-consecutive-sequence) |
| [0154-find-minimum-in-rotated-sorted-array-ii](https://github.com/vishalkrverma/DSA/tree/master/0154-find-minimum-in-rotated-sorted-array-ii) |
| [0204-count-primes](https://github.com/vishalkrverma/DSA/tree/master/0204-count-primes) |
| [0217-contains-duplicate](https://github.com/vishalkrverma/DSA/tree/master/0217-contains-duplicate) |
| [0238-product-of-array-except-self](https://github.com/vishalkrverma/DSA/tree/master/0238-product-of-array-except-self) |
| [0300-longest-increasing-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0300-longest-increasing-subsequence) |
| [0453-minimum-moves-to-equal-array-elements](https://github.com/vishalkrverma/DSA/tree/master/0453-minimum-moves-to-equal-array-elements) |
| [0560-subarray-sum-equals-k](https://github.com/vishalkrverma/DSA/tree/master/0560-subarray-sum-equals-k) |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [0695-max-area-of-island](https://github.com/vishalkrverma/DSA/tree/master/0695-max-area-of-island) |
| [0829-subdomain-visit-count](https://github.com/vishalkrverma/DSA/tree/master/0829-subdomain-visit-count) |
| [0940-fruit-into-baskets](https://github.com/vishalkrverma/DSA/tree/master/0940-fruit-into-baskets) |
| [1016-subarray-sums-divisible-by-k](https://github.com/vishalkrverma/DSA/tree/master/1016-subarray-sums-divisible-by-k) |
| [1036-rotting-oranges](https://github.com/vishalkrverma/DSA/tree/master/1036-rotting-oranges) |
| [1056-capacity-to-ship-packages-within-d-days](https://github.com/vishalkrverma/DSA/tree/master/1056-capacity-to-ship-packages-within-d-days) |
| [1310-watering-plants](https://github.com/vishalkrverma/DSA/tree/master/1310-watering-plants) |
| [1408-find-the-smallest-divisor-given-a-threshold](https://github.com/vishalkrverma/DSA/tree/master/1408-find-the-smallest-divisor-given-a-threshold) |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
| [1478-maximum-number-of-events-that-can-be-attended](https://github.com/vishalkrverma/DSA/tree/master/1478-maximum-number-of-events-that-can-be-attended) |
| [1510-find-lucky-integer-in-an-array](https://github.com/vishalkrverma/DSA/tree/master/1510-find-lucky-integer-in-an-array) |
| [1752-arithmetic-subarrays](https://github.com/vishalkrverma/DSA/tree/master/1752-arithmetic-subarrays) |
| [3490-find-the-maximum-length-of-valid-subsequence-i](https://github.com/vishalkrverma/DSA/tree/master/3490-find-the-maximum-length-of-valid-subsequence-i) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/vishalkrverma/DSA/tree/master/0011-container-with-most-water) |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
| [0031-next-permutation](https://github.com/vishalkrverma/DSA/tree/master/0031-next-permutation) |
| [0125-valid-palindrome](https://github.com/vishalkrverma/DSA/tree/master/0125-valid-palindrome) |
| [0165-compare-version-numbers](https://github.com/vishalkrverma/DSA/tree/master/0165-compare-version-numbers) |
| [0908-middle-of-the-linked-list](https://github.com/vishalkrverma/DSA/tree/master/0908-middle-of-the-linked-list) |
## Sorting
|  |
| ------- |
| [0016-3sum-closest](https://github.com/vishalkrverma/DSA/tree/master/0016-3sum-closest) |
| [0049-group-anagrams](https://github.com/vishalkrverma/DSA/tree/master/0049-group-anagrams) |
| [0217-contains-duplicate](https://github.com/vishalkrverma/DSA/tree/master/0217-contains-duplicate) |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [1478-maximum-number-of-events-that-can-be-attended](https://github.com/vishalkrverma/DSA/tree/master/1478-maximum-number-of-events-that-can-be-attended) |
| [1752-arithmetic-subarrays](https://github.com/vishalkrverma/DSA/tree/master/1752-arithmetic-subarrays) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/vishalkrverma/DSA/tree/master/0001-two-sum) |
| [0036-valid-sudoku](https://github.com/vishalkrverma/DSA/tree/master/0036-valid-sudoku) |
| [0037-sudoku-solver](https://github.com/vishalkrverma/DSA/tree/master/0037-sudoku-solver) |
| [0049-group-anagrams](https://github.com/vishalkrverma/DSA/tree/master/0049-group-anagrams) |
| [0128-longest-consecutive-sequence](https://github.com/vishalkrverma/DSA/tree/master/0128-longest-consecutive-sequence) |
| [0166-fraction-to-recurring-decimal](https://github.com/vishalkrverma/DSA/tree/master/0166-fraction-to-recurring-decimal) |
| [0217-contains-duplicate](https://github.com/vishalkrverma/DSA/tree/master/0217-contains-duplicate) |
| [0560-subarray-sum-equals-k](https://github.com/vishalkrverma/DSA/tree/master/0560-subarray-sum-equals-k) |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [0829-subdomain-visit-count](https://github.com/vishalkrverma/DSA/tree/master/0829-subdomain-visit-count) |
| [0940-fruit-into-baskets](https://github.com/vishalkrverma/DSA/tree/master/0940-fruit-into-baskets) |
| [1016-subarray-sums-divisible-by-k](https://github.com/vishalkrverma/DSA/tree/master/1016-subarray-sums-divisible-by-k) |
| [1264-maximum-number-of-words-you-can-type](https://github.com/vishalkrverma/DSA/tree/master/1264-maximum-number-of-words-you-can-type) |
| [1510-find-lucky-integer-in-an-array](https://github.com/vishalkrverma/DSA/tree/master/1510-find-lucky-integer-in-an-array) |
| [1752-arithmetic-subarrays](https://github.com/vishalkrverma/DSA/tree/master/1752-arithmetic-subarrays) |
## Sliding Window
|  |
| ------- |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [0940-fruit-into-baskets](https://github.com/vishalkrverma/DSA/tree/master/0940-fruit-into-baskets) |
## Counting
|  |
| ------- |
| [0594-longest-harmonious-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0594-longest-harmonious-subsequence) |
| [0829-subdomain-visit-count](https://github.com/vishalkrverma/DSA/tree/master/0829-subdomain-visit-count) |
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
| [1310-watering-plants](https://github.com/vishalkrverma/DSA/tree/master/1310-watering-plants) |
| [1708-design-parking-system](https://github.com/vishalkrverma/DSA/tree/master/1708-design-parking-system) |
| [2408-number-of-people-aware-of-a-secret](https://github.com/vishalkrverma/DSA/tree/master/2408-number-of-people-aware-of-a-secret) |
| [3336-water-bottles-ii](https://github.com/vishalkrverma/DSA/tree/master/3336-water-bottles-ii) |
## Math
|  |
| ------- |
| [0048-rotate-image](https://github.com/vishalkrverma/DSA/tree/master/0048-rotate-image) |
| [0070-climbing-stairs](https://github.com/vishalkrverma/DSA/tree/master/0070-climbing-stairs) |
| [0166-fraction-to-recurring-decimal](https://github.com/vishalkrverma/DSA/tree/master/0166-fraction-to-recurring-decimal) |
| [0204-count-primes](https://github.com/vishalkrverma/DSA/tree/master/0204-count-primes) |
| [0453-minimum-moves-to-equal-array-elements](https://github.com/vishalkrverma/DSA/tree/master/0453-minimum-moves-to-equal-array-elements) |
| [1440-convert-integer-to-the-sum-of-two-no-zero-integers](https://github.com/vishalkrverma/DSA/tree/master/1440-convert-integer-to-the-sum-of-two-no-zero-integers) |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
| [3336-water-bottles-ii](https://github.com/vishalkrverma/DSA/tree/master/3336-water-bottles-ii) |
## Data Stream
|  |
| ------- |
| [1477-product-of-the-last-k-numbers](https://github.com/vishalkrverma/DSA/tree/master/1477-product-of-the-last-k-numbers) |
## Prefix Sum
|  |
| ------- |
| [0238-product-of-array-except-self](https://github.com/vishalkrverma/DSA/tree/master/0238-product-of-array-except-self) |
| [0560-subarray-sum-equals-k](https://github.com/vishalkrverma/DSA/tree/master/0560-subarray-sum-equals-k) |
| [1016-subarray-sums-divisible-by-k](https://github.com/vishalkrverma/DSA/tree/master/1016-subarray-sums-divisible-by-k) |
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
| [0207-course-schedule](https://github.com/vishalkrverma/DSA/tree/master/0207-course-schedule) |
| [0226-invert-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/0226-invert-binary-tree) |
| [0684-redundant-connection](https://github.com/vishalkrverma/DSA/tree/master/0684-redundant-connection) |
| [0695-max-area-of-island](https://github.com/vishalkrverma/DSA/tree/master/0695-max-area-of-island) |
| [0813-all-paths-from-source-to-target](https://github.com/vishalkrverma/DSA/tree/master/0813-all-paths-from-source-to-target) |
| [1035-cousins-in-binary-tree](https://github.com/vishalkrverma/DSA/tree/master/1035-cousins-in-binary-tree) |
| [1036-rotting-oranges](https://github.com/vishalkrverma/DSA/tree/master/1036-rotting-oranges) |
## Linked List
|  |
| ------- |
| [0114-flatten-binary-tree-to-linked-list](https://github.com/vishalkrverma/DSA/tree/master/0114-flatten-binary-tree-to-linked-list) |
| [0116-populating-next-right-pointers-in-each-node](https://github.com/vishalkrverma/DSA/tree/master/0116-populating-next-right-pointers-in-each-node) |
| [0908-middle-of-the-linked-list](https://github.com/vishalkrverma/DSA/tree/master/0908-middle-of-the-linked-list) |
## Stack
|  |
| ------- |
| [0084-largest-rectangle-in-histogram](https://github.com/vishalkrverma/DSA/tree/master/0084-largest-rectangle-in-histogram) |
| [0114-flatten-binary-tree-to-linked-list](https://github.com/vishalkrverma/DSA/tree/master/0114-flatten-binary-tree-to-linked-list) |
| [0957-minimum-add-to-make-parentheses-valid](https://github.com/vishalkrverma/DSA/tree/master/0957-minimum-add-to-make-parentheses-valid) |
## Monotonic Stack
|  |
| ------- |
| [0084-largest-rectangle-in-histogram](https://github.com/vishalkrverma/DSA/tree/master/0084-largest-rectangle-in-histogram) |
## String
|  |
| ------- |
| [0044-wildcard-matching](https://github.com/vishalkrverma/DSA/tree/master/0044-wildcard-matching) |
| [0049-group-anagrams](https://github.com/vishalkrverma/DSA/tree/master/0049-group-anagrams) |
| [0115-distinct-subsequences](https://github.com/vishalkrverma/DSA/tree/master/0115-distinct-subsequences) |
| [0125-valid-palindrome](https://github.com/vishalkrverma/DSA/tree/master/0125-valid-palindrome) |
| [0165-compare-version-numbers](https://github.com/vishalkrverma/DSA/tree/master/0165-compare-version-numbers) |
| [0166-fraction-to-recurring-decimal](https://github.com/vishalkrverma/DSA/tree/master/0166-fraction-to-recurring-decimal) |
| [0829-subdomain-visit-count](https://github.com/vishalkrverma/DSA/tree/master/0829-subdomain-visit-count) |
| [0957-minimum-add-to-make-parentheses-valid](https://github.com/vishalkrverma/DSA/tree/master/0957-minimum-add-to-make-parentheses-valid) |
| [1264-maximum-number-of-words-you-can-type](https://github.com/vishalkrverma/DSA/tree/master/1264-maximum-number-of-words-you-can-type) |
| [1302-delete-characters-to-make-fancy-string](https://github.com/vishalkrverma/DSA/tree/master/1302-delete-characters-to-make-fancy-string) |
| [3396-valid-word](https://github.com/vishalkrverma/DSA/tree/master/3396-valid-word) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/vishalkrverma/DSA/tree/master/0011-container-with-most-water) |
| [0044-wildcard-matching](https://github.com/vishalkrverma/DSA/tree/master/0044-wildcard-matching) |
| [0957-minimum-add-to-make-parentheses-valid](https://github.com/vishalkrverma/DSA/tree/master/0957-minimum-add-to-make-parentheses-valid) |
| [1478-maximum-number-of-events-that-can-be-attended](https://github.com/vishalkrverma/DSA/tree/master/1478-maximum-number-of-events-that-can-be-attended) |
## Dynamic Programming
|  |
| ------- |
| [0044-wildcard-matching](https://github.com/vishalkrverma/DSA/tree/master/0044-wildcard-matching) |
| [0070-climbing-stairs](https://github.com/vishalkrverma/DSA/tree/master/0070-climbing-stairs) |
| [0115-distinct-subsequences](https://github.com/vishalkrverma/DSA/tree/master/0115-distinct-subsequences) |
| [0118-pascals-triangle](https://github.com/vishalkrverma/DSA/tree/master/0118-pascals-triangle) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/vishalkrverma/DSA/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0300-longest-increasing-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0300-longest-increasing-subsequence) |
| [2408-number-of-people-aware-of-a-secret](https://github.com/vishalkrverma/DSA/tree/master/2408-number-of-people-aware-of-a-secret) |
| [3490-find-the-maximum-length-of-valid-subsequence-i](https://github.com/vishalkrverma/DSA/tree/master/3490-find-the-maximum-length-of-valid-subsequence-i) |
## Backtracking
|  |
| ------- |
| [0037-sudoku-solver](https://github.com/vishalkrverma/DSA/tree/master/0037-sudoku-solver) |
| [0813-all-paths-from-source-to-target](https://github.com/vishalkrverma/DSA/tree/master/0813-all-paths-from-source-to-target) |
## Graph
|  |
| ------- |
| [0207-course-schedule](https://github.com/vishalkrverma/DSA/tree/master/0207-course-schedule) |
| [0684-redundant-connection](https://github.com/vishalkrverma/DSA/tree/master/0684-redundant-connection) |
| [0813-all-paths-from-source-to-target](https://github.com/vishalkrverma/DSA/tree/master/0813-all-paths-from-source-to-target) |
## Database
|  |
| ------- |
| [0176-second-highest-salary](https://github.com/vishalkrverma/DSA/tree/master/0176-second-highest-salary) |
| [0177-nth-highest-salary](https://github.com/vishalkrverma/DSA/tree/master/0177-nth-highest-salary) |
## Memoization
|  |
| ------- |
| [0070-climbing-stairs](https://github.com/vishalkrverma/DSA/tree/master/0070-climbing-stairs) |
## Matrix
|  |
| ------- |
| [0036-valid-sudoku](https://github.com/vishalkrverma/DSA/tree/master/0036-valid-sudoku) |
| [0037-sudoku-solver](https://github.com/vishalkrverma/DSA/tree/master/0037-sudoku-solver) |
| [0048-rotate-image](https://github.com/vishalkrverma/DSA/tree/master/0048-rotate-image) |
| [0074-search-a-2d-matrix](https://github.com/vishalkrverma/DSA/tree/master/0074-search-a-2d-matrix) |
| [0695-max-area-of-island](https://github.com/vishalkrverma/DSA/tree/master/0695-max-area-of-island) |
| [1036-rotting-oranges](https://github.com/vishalkrverma/DSA/tree/master/1036-rotting-oranges) |
## Union Find
|  |
| ------- |
| [0128-longest-consecutive-sequence](https://github.com/vishalkrverma/DSA/tree/master/0128-longest-consecutive-sequence) |
| [0684-redundant-connection](https://github.com/vishalkrverma/DSA/tree/master/0684-redundant-connection) |
| [0695-max-area-of-island](https://github.com/vishalkrverma/DSA/tree/master/0695-max-area-of-island) |
## Binary Search
|  |
| ------- |
| [0074-search-a-2d-matrix](https://github.com/vishalkrverma/DSA/tree/master/0074-search-a-2d-matrix) |
| [0154-find-minimum-in-rotated-sorted-array-ii](https://github.com/vishalkrverma/DSA/tree/master/0154-find-minimum-in-rotated-sorted-array-ii) |
| [0300-longest-increasing-subsequence](https://github.com/vishalkrverma/DSA/tree/master/0300-longest-increasing-subsequence) |
| [1056-capacity-to-ship-packages-within-d-days](https://github.com/vishalkrverma/DSA/tree/master/1056-capacity-to-ship-packages-within-d-days) |
| [1408-find-the-smallest-divisor-given-a-threshold](https://github.com/vishalkrverma/DSA/tree/master/1408-find-the-smallest-divisor-given-a-threshold) |
## Enumeration
|  |
| ------- |
| [0204-count-primes](https://github.com/vishalkrverma/DSA/tree/master/0204-count-primes) |
## Number Theory
|  |
| ------- |
| [0204-count-primes](https://github.com/vishalkrverma/DSA/tree/master/0204-count-primes) |
## Recursion
|  |
| ------- |
| [0044-wildcard-matching](https://github.com/vishalkrverma/DSA/tree/master/0044-wildcard-matching) |
## Queue
|  |
| ------- |
| [2408-number-of-people-aware-of-a-secret](https://github.com/vishalkrverma/DSA/tree/master/2408-number-of-people-aware-of-a-secret) |
## Topological Sort
|  |
| ------- |
| [0207-course-schedule](https://github.com/vishalkrverma/DSA/tree/master/0207-course-schedule) |
<!---LeetCode Topics End-->