// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        
        al.add(-1);
        int max=-1;
        for(int i=n-2;i>=0;i--){
            max=Math.max(arr[i+1],max);
            al.add(max);
        }
        Collections.reverse(al);
        return al;
    }
}