class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public int minPrice(int[] prices) {
    if (prices.length == 0)
        return -1; 

    int idx = 0;
    int min = prices[0];
    for (int i = 1; i < prices.length; i++) {
        if (prices[i] < min) {
            min = prices[i];
            idx = i;
        }
    }
    return idx;
}
}
