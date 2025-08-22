// User function Template for Java

class Solution {
    static List<Integer> minPartition(int n) {
        // code here
        int arr[]={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        
        List<Integer> al=new ArrayList<>();
        int j=arr.length-1;
        
        while(n>0 && j>=0){
            while(n<arr[j]){
                j--;
            }
            n=n-arr[j];
            al.add(arr[j]);
        }
        return al;
    }
}