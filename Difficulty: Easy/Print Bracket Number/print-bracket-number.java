// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count++; 
                stack.push(count);
                result.add(count);
            } 
            else if (ch == ')') {
                if (!stack.isEmpty()) {
                    result.add(stack.pop());
                }
            }
        }

        return result;
    }
};