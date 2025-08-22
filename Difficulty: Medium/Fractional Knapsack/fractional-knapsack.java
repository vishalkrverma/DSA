class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        double ratio[][] = new double[values.length][2];
        
        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double) weights[i];
        }
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));
        
        int w = W;
        double res = 0;
        
        for (int i = 0; i < values.length; i++) {
            int index = (int) ratio[i][0];
            if (w >= weights[index]) {    // Use 'index' here, NOT 'i'
                res += values[index];
                w -= weights[index];
            } else {
                res += ratio[i][1] * w;
                w = 0;
                break;
            }
        }
        return res;
    }
}
