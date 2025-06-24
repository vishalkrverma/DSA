class Solution {
    public static String maxSubseq(String s, int k) {
        // code here
         Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            while (!stack.isEmpty() && ch > stack.peekLast() && k > 0) {
                stack.pollLast();
                k--;
            }
            stack.addLast(ch);
        }

        // If we still have deletions left, remove from the end
        while (k-- > 0) {
            stack.pollLast();
        }

        // Build the result
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}