import java.util.*;

class Solution {
    public ArrayList<Integer> asciirange(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!seen.contains(ch)) {
                seen.add(ch);

                int first = s.indexOf(ch);
                int last = s.lastIndexOf(ch);

                if (first == last) {
                    continue; // character occurs only once, skip it
                }

                int sum = 0;
                for (int k = first + 1; k < last; k++) {
                    sum += (int) s.charAt(k); // actual ASCII value
                }
                if(sum!=0){
               result.add(sum);
                }
            }
        }
        // result.remove(0);

        return result;
    }
}
