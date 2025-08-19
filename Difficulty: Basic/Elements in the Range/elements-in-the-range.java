// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        Set<Integer> needed = new HashSet<>();
        
        // Add all elements from A to B into the set
        for (int i = A; i <= B; i++) {
            needed.add(i);
        }
        
        // Remove elements that are found in arr[]
        for (int i = 0; i < n; i++) {
            needed.remove(arr[i]);
        }
        
        // If the set is empty, all elements from A to B were found
        return needed.isEmpty();
    }
}
