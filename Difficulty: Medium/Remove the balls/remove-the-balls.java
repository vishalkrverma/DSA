class Solution {
    public int findLength(int[] color, int[] radius) {
        // code here
     
        Deque<int[]> stack = new ArrayDeque<>();
        
        for (int i = 0; i < color.length; i++) {
            if (!stack.isEmpty() && stack.peek()[0] == color[i] && stack.peek()[1] == radius[i]) {
                stack.pop();  // remove both
            } else {
                stack.push(new int[]{color[i], radius[i]});
            }
        }
        
        return stack.size();  // remaining balls
    }
}
