class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
      Stack<Integer> st=new Stack<>();
      
      int n=s.size();
      int cnt=n/2;
      while(cnt>=0){
          st.push(s.pop());
          cnt--;
      }
      st.pop();
      while(!st.isEmpty()){
          s.push(st.pop());
      }
    }
}