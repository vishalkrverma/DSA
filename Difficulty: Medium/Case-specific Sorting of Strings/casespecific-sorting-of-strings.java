import java.util.Arrays;

class Solution {
    public static String caseSort(String s) {
        StringBuilder upperCase = new StringBuilder();
        StringBuilder lowerCase = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCase.append(ch);
            } else if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            }
        }

        char[] upper = upperCase.toString().toCharArray();
        char[] lower = lowerCase.toString().toCharArray();

        Arrays.sort(upper);
        Arrays.sort(lower);

        int upIndex = 0, lowIndex = 0;
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(upper[upIndex++]);
            } else if (Character.isLowerCase(ch)) {
                result.append(lower[lowIndex++]);
            }
        }

        return result.toString();
    }
}
