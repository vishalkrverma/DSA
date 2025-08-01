import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); 
             // First element is always 1

            // Calculate the middle elements based on the previous row
            for (int j = 1; j < i; j++) {
                int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                row.add(val);
            }

            if (i > 0) {
                row.add(1);  // Last element is always 1 for rows after the first
            }

            res.add(row);
        }

        return res;
    }
}
