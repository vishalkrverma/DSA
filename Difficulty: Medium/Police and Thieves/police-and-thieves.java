class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        List<Integer> police = new ArrayList<>();
        List<Integer> thieves = new ArrayList<>();
        
        // Populate the lists with indices
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') {
                police.add(i);
            } else if (arr[i] == 'T') {
                thieves.add(i);
            }
        }
        
        int p = 0, t = 0; // Pointers for police and thieves
        int maxCaught = 0;
        
        // Two-pointer technique to match policemen with thieves
        while (p < police.size() && t < thieves.size()) {
            if (Math.abs(police.get(p) - thieves.get(t)) <= k) {
                // If within distance, catch the thief
                maxCaught++;
                p++;
                t++;
            } else if (police.get(p) < thieves.get(t)) {
                // Move to the next policeman
                p++;
            } else {
                // Move to the next thief
                t++;
            }
        }
        
        return maxCaught;
        
    }
}