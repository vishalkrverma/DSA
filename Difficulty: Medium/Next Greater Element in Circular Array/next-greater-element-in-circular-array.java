class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
       int n=arr.length;
       int[] res=new int[n];
       Stack<Integer> st=new Stack<>();
       
       
       for(int i=2*n-1;i>=0;i--){
           int curr=arr[i%n];
           
           while(!st.isEmpty() && st.peek()<=curr){
               st.pop();
           }
           if(i<n){
               res[i]=st.isEmpty()?-1:st.peek();
           }
           st.push(curr);
       }
       ArrayList<Integer> al=new ArrayList<>();
       for(int val:res) al.add(val);
       return al;
    }
}