// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int n, int[] asteroids) {
       
        Stack<Integer> st=new Stack<>();
       
       for(int i=0;i<n;i++){
           int curr=asteroids[i];
           
           while(!st.isEmpty() && curr<0 && st.peek()>0){
               int top=st.peek();
               
               if(top<-curr){
                   st.pop();
                   continue;
               }
               else if(top==-curr){
                   st.pop();
                   curr=0;
                   break;
               }
               else{
                   curr=0;
                   break;
               }
           }
           if(curr!=0){
               st.push(curr);
           }
       }
       int[] res=new int[st.size()];
       for(int i=res.length-1;i>=0;i--){
           res[i]=st.pop();
       }
       return res;
       
    }
}
