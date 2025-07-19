class Solution {
    public int vowelCount(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Map<Character, Integer> vowelCounts = new HashMap<>();

        // Count the occurrences of each vowel in the string
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                vowelCounts.put(ch, vowelCounts.getOrDefault(ch, 0) + 1);
            }
        }

        if (vowelCounts.isEmpty()) {
            return 0;  // No vowels present
        }

        // Calculate the total number of selection combinations
        int selectionWays = 1;
        for (int count : vowelCounts.values()) {
            selectionWays *= count;
        }

        // Calculate permutations of selected vowels (factorial of number of distinct vowels)
        int numDistinctVowels = vowelCounts.size();
        int permutationCount = factorial(numDistinctVowels);

        return selectionWays * permutationCount;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}