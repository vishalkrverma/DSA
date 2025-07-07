class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();

        int maxArea=0;
        int n=heights.length;

        for(int i=0;i<=n;i++){
            int curr=(i==n)?0:heights[i];

        while(!st.isEmpty() && curr< heights[st.peek()]){
            int ht=heights[st.pop()];
            int wt=st.isEmpty()?i:i-st.peek()-1;
            maxArea=Math.max(maxArea,ht*wt);
        }
        st.push(i);
        }
        return maxArea;
    }
}