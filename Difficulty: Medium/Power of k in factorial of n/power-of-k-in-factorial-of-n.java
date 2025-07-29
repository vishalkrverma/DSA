import java.util.*;

class Solution {
    public int maxKPower(int n, int k) {
        Map<Integer, Integer> primeFactors = getPrimeFactors(k);
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            int p = entry.getKey();
            int expInK = entry.getValue();

            int expInFactorial = 0;
            int power = p;
            while (power <= n) {
                expInFactorial += n / power;
                power *= p;
            }

            result = Math.min(result, expInFactorial / expInK);
        }

        return result;
    }

    // Prime factorization of k
    private Map<Integer, Integer> getPrimeFactors(int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i * i <= k; i++) {
            while (k % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                k /= i;
            }
        }
        if (k > 1) {
            map.put(k, 1);
        }
        return map;
    }
}
