import java.util.*;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        // Handle negative numbers
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Convert to long to avoid overflow
        long dividend = Math.abs((long) numerator);
        long divisor = Math.abs((long) denominator);

        // Append integer part
        result.append(dividend / divisor);
        long remainder = dividend % divisor;

        if (remainder == 0) {
            return result.toString(); // No decimal part
        }

        result.append(".");

        // Map to store seen remainders and their positions
        Map<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {
            // If we’ve seen this remainder before, it means the fraction is repeating
            if (map.containsKey(remainder)) {
                int index = map.get(remainder);
                result.insert(index, "(");
                result.append(")");
                break;
            }

            // Store the current position of the remainder
            map.put(remainder, result.length());

            remainder *= 10;
            result.append(remainder / divisor);
            remainder %= divisor;
        }

        return result.toString();
    }
}
