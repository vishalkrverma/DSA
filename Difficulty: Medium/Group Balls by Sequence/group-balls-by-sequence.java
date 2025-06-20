class Solution {
    public boolean validgroup(int[] arr, int k) {
        // code here
         if (arr.length % k != 0) {
            return false;
        }

        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count == 0) {
                continue;
            }

            for (int i = 0; i < k; i++) {
                int currentNum = num + i;
                if (frequencyMap.getOrDefault(currentNum, 0) < count) {
                    return false;
                }
                frequencyMap.put(currentNum, frequencyMap.get(currentNum) - count);
            }
        }

        return true;
    }
}