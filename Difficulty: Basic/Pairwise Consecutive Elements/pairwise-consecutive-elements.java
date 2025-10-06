// your task is to complete the function
// function should return true/false or 1/0
class GFG {
    public static boolean pairWiseConsecutive(Stack<Integer> st) {
      while(st.size()>1){
          int first=st.pop();
          if(Math.abs(st.peek()-first)!=1){
              return false;
          }
      }
      return true;
    }
}