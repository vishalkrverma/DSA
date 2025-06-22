class Solution {
    static int lds(int[] arr, int[] memo, int[] parent, int i) {
        if (memo[i] != -1) {
            return memo[i];
        }

        int maxLength = 1;
        int bestParent = -1;

        for (int j = 0; j < i; j++) {
            if (arr[j] % arr[i] == 0) {
                int length = lds(arr, memo, parent, j) + 1;
                if (length > maxLength) {
                    maxLength = length;
                    bestParent = j;
                }
            }
        }

        memo[i] = maxLength;
        parent[i] = bestParent;
        return maxLength;
    }

    static ArrayList<Integer> largestSubset(int[] arr) {
        int n = arr.length;

        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            arr[i] = boxedArr[i];
        }

        int[] memo = new int[n];
        int[] parent = new int[n];
        Arrays.fill(memo, -1);
        Arrays.fill(parent, -1);

        int maxSize = 0;
        int lastIndex = 0;

        for (int i = 0; i < n; i++) {
            int size = lds(arr, memo, parent, i);
            if (size > maxSize) {
                maxSize = size;
                lastIndex = i;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = lastIndex; i >= 0; i = parent[i]) {
            res.add(arr[i]);
            if (parent[i] == -1) break;
        }

        return res;
        
    }
}