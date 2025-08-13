class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
         int n = arr.length;
        int needLucky = (n + 1) / 2; // ceil(n/2)
        
        int luckyCount = 0;
        List<Integer> soldiersNeeded = new ArrayList<>();

        for (int x : arr) {
            if (x % k == 0) {
                luckyCount++;
            } else {
                soldiersNeeded.add(k - (x % k));
            }
        }

        if (luckyCount >= needLucky) {
            return 0;
        }

        Collections.sort(soldiersNeeded);

        int troopsToFix = needLucky - luckyCount;
        int totalSoldiers = 0;

        for (int i = 0; i < troopsToFix; i++) {
            totalSoldiers += soldiersNeeded.get(i);
        }

        return totalSoldiers;
    }
}