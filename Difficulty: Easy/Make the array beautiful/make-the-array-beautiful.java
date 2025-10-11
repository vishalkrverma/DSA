import java.util.*;

class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int num : arr) {
            if (!st.isEmpty()) {
                int top = st.peek();
             
                if ((top >= 0 && num < 0) || (top < 0 && num >= 0)) {
                    st.pop();
                    continue;
                }
            }
            st.push(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!st.isEmpty()) {
            result.add(st.pop());
        }
        Collections.reverse(result);
        return result;
    }
}
